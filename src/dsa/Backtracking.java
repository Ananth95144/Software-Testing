package dsa;
/*
Backtracking
Backtracking works by recursively exploring all possible solutions to a problem.
It starts by choosing an initial solution, and then it explores all possible extensions of that solution.
If an extension leads to a solution, the algorithm returns that solution.
If an extension does not lead to a solution, the algorithm backtracks to the previous solution and tries a different extention.
 */
 
public class Backtracking {
    class Position {
        int row, col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
 
    public Position[] solveNQueens(int n) {
        Position[] positions = new Position[n];
        boolean hasSolution = helper(n, 0, positions);
        if (hasSolution) {
            return positions;
        } else {
            return new Position[0];
        }
    }
 
    private boolean helper(int n, int row, Position[] positions) {
        if (n == row) {
            return true;
        }
        int col;
        for (col = 0; col < n; col++) {
            boolean foundSafe = true;
 
            for (int queen = 0; queen < row; queen++) {
                if (positions[queen].col == col || positions[queen].row - positions[queen].col == row - col ||
                        positions[queen].row + positions[queen].col == row + col) {
                    foundSafe = false;
                    break;
                }
            }
            if (foundSafe) {
                positions[row] = new Position(row, col);
                if (helper(n, row + 1, positions)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Backtracking s = new Backtracking();
        Position[] positions = s.solveNQueens(4);
        for (Position pos : positions) {
            System.out.println(pos.row + " " + pos.col);
        }
    }
}
 
 