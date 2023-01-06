package SudokuSolver;

public class Solver 
{
	
	public int[] exclusions(int[][] board,int r, int c) 
	{
		int[] cantBe = new int[9];
		for(int rowItem: board[r])
		{
			if(rowItem!=0) {
				if(cantBe[rowItem-1]==0) {
					cantBe[rowItem-1]=rowItem;
				}
			}
		}
		int[] col=Extractor.extractColumn(board, c);
		for(int colItem: col) 
		{
			if(colItem!=0) {
				if(cantBe[colItem-1]==0) {
					cantBe[colItem-1]=colItem;
				}
			}
		}
		int bNum = Extractor.boxByRowColumn(r, c);
		int[] box = Extractor.extractBox(board, bNum);
		for(int boxItem: box) 
		{
			if(boxItem!=0) {
				if(cantBe[boxItem-1]==0) {
					cantBe[boxItem-1]=boxItem;
				}
			}
		}
		return cantBe;
	}

	
	public int[][] solveBoard(int[][] board){
		
		int zeros = SolvingTools.zeroCount(board);
		
		while(zeros>0) {
			// use solving tools to fill in unknown values
			//if a value gets filled in: zeros--;
			zeros--;
		}
		
		return board;
	}
	
	public static void main(String[] args) {
		int[][] board = {
				{0, 0, 0, 9, 0, 6, 0, 0, 0},
				{7, 1, 0, 0, 5, 0, 9, 0, 0},
				{0, 9, 4, 1, 0, 0, 0, 0, 0},
				{0, 0, 5, 0, 0, 4, 0, 2, 0},
				{0, 3, 1, 0, 7, 0, 8, 9, 0},
				{0, 8, 0, 6, 0, 0, 3, 0, 0},
				{0, 0, 0, 0, 0, 8, 4, 1, 0},
				{0, 0, 6, 0, 1, 0, 0, 8, 7},
				{0, 0, 0, 4, 0, 2, 0, 0, 0}
		};
		
		Solver s = new Solver();
		int[] z = s.exclusions(board, 0, 0);
		for(int x: z) {
			System.out.print(String.valueOf(x)+" ");
		}
	}
}
