package com.ok.sudoku.controller;


/**
 *
 * @author okan
 */
import com.ok.sudoku.factorydigit.Digit_FactorySetter;
import com.ok.sudoku.factorydigit.Digit;
import com.ok.sudoku.puzzle.Puzzle_Control;
import com.ok.sudoku.puzzle.Random_Number;
import com.ok.sudoku.strategyboard.*;
import com.ok.sudoku.value.*;

public class Sudoku {

    private Board_Select board_Select_6x6;
    private Board_Select board_Select_9x9 ;
    private Puzzle_Control puzzle;
    private Random_Number random = new Random_Number();
    private Digit_FactorySetter digitFactory; 
    private Digit digit;
    public Sudoku()
    {
     puzzle =new Puzzle_Control();
     //Strategy Pattern 
     board_Select_6x6 =new Board_Select(new Valid_Board_6x6());
     board_Select_9x9 =new Board_Select(new Valid_Board_9x9());
     //Factory Pattern
     digitFactory =new Digit_FactorySetter();
    }


    // Swap rows of an 2D array.
    private int[][] swapRows(int[][] board, int row1, int row2) {
        for (int j = 0; j < board.length; j++) {
            int temp = board[row1][j];
            board[row1][j] = board[row2][j];
            board[row2][j] = temp;
        }
        return board;
    }

    // Swap columns of an 2D array.
    private int[][] swapCols(int[][] board, int col1, int col2) {
        for (int i = 0; i < board.length; i++) {
            int temp = board[i][col1];
            board[i][col1] = board[i][col2];
            board[i][col2] = temp;
        }
        return board;
    }

    // This method swaps rows and columns of an valid board. 
    // Swaping process for rows must be done same horizontal grid and
    // also for column swaping process must be in vertical grid.
    private int[][] swapRowsAndCols(int[][] board) {

        int range = board.length == Grid_Value.GRID_9X9 ? 7 : 5;
        // define number of rows per horizontal group.
        int rowsInGrid = board.length == Grid_Value.GRID_9X9 ? 3 : 2;
        // For both 9X9 and and 9X6 number of columns in vertical grid is 3.
        int colsInGrid = 3;

        for (int a = 0; a < range; a += rowsInGrid) {
            int row[] = getTwoRanNum(a, rowsInGrid);
            swapRows(board, row[0], row[1]);
        }

        for (int a = 0; a < range; a += colsInGrid) {
            int[] col = getTwoRanNum(a, colsInGrid);
            swapCols(board, col[0], col[1]);
        }
        return board;
    }

    // Swap only horizontal groups.
    private int[][] swapGrids(int[][] board) {
        int firstgrid = 1 + random.Next_Number(3);
        int secondgrid = 1 + random.Next_Number(3);
        int numRowsInGrid = board.length == Grid_Value.GRID_9X9 ? 3 : 2;

        if ((firstgrid == 1 && secondgrid == 2) || (firstgrid == 2 && secondgrid == 1)) {
            for (int i = 0; i < numRowsInGrid; i++) {
                swapRows(board, i, i + numRowsInGrid);
            }
        } else if ((firstgrid == 2 && secondgrid == 3) || (firstgrid == 3 && secondgrid == 2)) {
            for (int i = numRowsInGrid; i < numRowsInGrid * 2; i++) {
                swapRows(board, i, i + numRowsInGrid);
            }
        } else if ((firstgrid == 1 && secondgrid == 3) || (firstgrid == 3 && secondgrid == 1)) {
            for (int i = 0; i < numRowsInGrid; i++) {
                swapRows(board, i, i + (numRowsInGrid * 2));
            }
        }
        return board;
    }

    // swap numbers for each rows.
    private int[][] swapNums(int[][] board) {
        int[] num = getTwoRanNum(1, board.length);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == num[0]) {
                    board[i][j] = num[1];
                } else if (board[i][j] == num[1]) {
                    board[i][j] = num[0];
                }
            }
        }
        return board;
    }

    // provide two random number as an array with length two.
    private int[] getTwoRanNum(int min, int tolerance) {
        int a[] = new int[2];
        a[0] = min + random.Next_Number(tolerance);
        a[1] = min + random.Next_Number(tolerance);
        return a;
    }

    // Create an validsudoku board.
    private int[][] createBoard(int[][] board) {
        for (int i = 0; i < 10; i++) {
            swapRowsAndCols(board);
            swapGrids(board);
            swapNums(board);
        }
        return board;
    }

    // Check Is the sollution correct or Incorrect.
    public boolean check(int[][] board) {
        boolean isCorrect = true;
        int numOfRowsInGrid = board.length == 9 ? 3 : 2;
        final String setValues = board.length == 9 ? digitFactory.Digit_FactoryGetter("SET_VALUE_9X9").getDigit() : digitFactory.Digit_FactoryGetter("SET_VALUE_6X6").getDigit() ;
        // check rows
        for (int i = 0; i < board.length; i++) {
            String set = setValues;
            for (int j = 0; j < board.length; j++) {
                set = set.replace("" + board[i][j], "");
            }
            if (!set.isEmpty()) {
                isCorrect = false;
                return isCorrect;
            }
        }

        // check columns
        for (int j = 0; j < board.length; j++) {
            String set = setValues;
            for (int i = 0; i < board.length; i++) {
                set = set.replace("" + board[i][j], "");
            }
            if (!set.isEmpty()) {
                isCorrect = false;
                return isCorrect;
            }
        }

        //check Horizontal and vertical grids
        for (int hg = 0; hg < board.length; hg += numOfRowsInGrid) {
            for (int vg = 0; vg < board[0].length; vg += 3) {
                String set = setValues;
                for (int i = hg; i < (hg + numOfRowsInGrid); i++) {
                    for (int j = vg; j < vg + 3; j++) {
                        set = set.replace("" + board[i][j], "");
                    }
                }
                if (!set.isEmpty()) {
                    isCorrect = false;
                    return isCorrect;
                }
            }
        }

        return isCorrect;
    }

    public int[][] getNewPuzzle(int grid, int gameMode) {
        if (grid == Grid_Value.GRID_9X9) {
            return  puzzle.createPuzzle(createBoard(board_Select_9x9.get_Valid_Board()), gameMode);
        } else if (grid == Grid_Value.GRID_6X6) {
            return puzzle.createPuzzle(createBoard(board_Select_6x6.get_Valid_Board()), gameMode);
        }

        return puzzle.createPuzzle(createBoard(board_Select_9x9.get_Valid_Board()), gameMode);
    }

    public int[][] resetPuzzle() {
        return puzzle.resetPuzzle();
    }


}
