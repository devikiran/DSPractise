package com.pkg.dp;

public class Nqueens {
	class Position {
		int r, c;

		public Position(int row, int col) {
			this.c = col;
			this.r = row;
		}
	}

	public Position[] solveNQueenOneSolution(int n) {
		Position[] positions = new Position[n];
		boolean hasSolution = solveNQueenOneSolutionUtil(n, 0, positions);
		if (hasSolution) {
			return positions;
		} else {
			return new Position[0];
		}
	}

	private boolean solveNQueenOneSolutionUtil(int n, int row, Position[] positions) {
		if (n == row) {
			return true;
		}
		int col;
		for (col = 0; col < n; col++) {
			boolean foundSafe = true;

			// check if this row and col is not under attack from any previous
			// queen.
			for (int queen = 0; queen < row; queen++) {
				if (positions[queen].c == col || positions[queen].r - positions[queen].c == row - col
						|| positions[queen].r + positions[queen].c == row + col) {
					foundSafe = false;
					break;
				}
			}
			if (foundSafe) {
				positions[row] = new Position(row, col);
				if (solveNQueenOneSolutionUtil(n, row + 1, positions)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Nqueens nq = new Nqueens();
		Position[] p = nq.solveNQueenOneSolution(8);

		for (int i = 0; i < p.length; i++) {
			System.out.println("Row " + p[i].r + " Column " + p[i].c);
		}
	}
}
