package SudokuSolver;

public class Solver {

	public int[][] solveBoard(int[][] board){
		
		int zeros = SolvingTools.zeroCount(board);
		
		while(zeros>0) {
			// use solving tools to fill in unknown values
			//if a value gets filled in: zeros--;
			zeros--;
		}
		
		return board;
	}
}
