package com.pkg.hackerrank.medium;

public class SodukuPractise {
	int size = 0;
	public static int[][] GRID_TO_SOLVE = { { 9, 0, 0, 1, 0, 0, 0, 0, 5 }, { 0, 0, 5, 0, 9, 0, 2, 0, 1 },
			{ 8, 0, 0, 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 8, 0, 0, 0, 0 }, { 0, 0, 0, 7, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 2, 6, 0, 0, 9 }, { 2, 0, 0, 3, 0, 0, 0, 0, 6 }, { 0, 0, 0, 2, 0, 0, 9, 0, 0 },
			{ 0, 0, 1, 9, 0, 4, 5, 7, 0 }, };

	
	private int[][] board;
	public static final int EMPTY = 0; // empty cell
	public static final int SIZE = 9; // size of our Sudoku grids
	
	
	public boolean isInRow(int row, int number) {
		for (int i = 0; i < size; i++) {
			if (board[row][i] == number) {
				return true;
			}

		}
		return false;
	}

	public boolean isInColumn(int column, int number) {
		for (int i = 0; i < size; i++) {
			if (board[i][column] == number) {
				return true;
			}

		}
		return false;
	}
	
	public boolean isInGrid(int row,int col,int number) {
		int r = row - row % 3;
		int c = col - col % 3;
		
		for (int i = r; i < r + 3; i++)
			for (int j = c; j < c + 3; j++)
				if (board[i][j] == number)
					return true;
		
		return false;
	}
	
	private boolean isOk(int row, int col, int number) {
		return !isInRow(row, number)  &&  !isInColumn(col, number)  &&  !isInGrid(row, col, number);
	}
	
	 public boolean solve() {
	        for (int row = 0; row < SIZE; row++) {
	         for (int col = 0; col < SIZE; col++) {
	          // we search an empty cell
	          if (board[row][col] == EMPTY) {
	            // we try possible numbers
	            for (int number = 1; number <= SIZE; number++) {
	              if (isOk(row, col, number)) {
	                // number ok. it respects sudoku constraints
	                board[row][col] = number;

	                if (solve()) { // we start backtracking recursively
	                  return true;
	                } else { // if not a solution, we empty the cell and we continue
	                  board[row][col] = EMPTY;
	                }
	             }
	            }
	          }
		        }
		 }
	            return false; // we return false
	           }

}
