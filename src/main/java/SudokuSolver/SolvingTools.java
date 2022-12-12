package SudokuSolver;

public class SolvingTools {
	
	public static int zeroCount(int[][] board) {
		int zCount=0;
		for(int[] row: board) {
			for(int i: row) {
				if(i==0) {
					zCount++;
				}
			}
		}
		return zCount;
	}
	
	
	public int getMissing(int[] arr) {
		if(!SudokuValidator.noDuplicates(arr)) {
			return -1;
		}
		int idx=-1;
		for(int i=0; i<9; i++) 
		{
			if(arr[i]==0) {
				idx=i;
				break;
			}
		}
		if(idx==-1) {return -1;}
		int[] hash = {0,0,0,0,0,0,0,0,0};
		for(int i=0; i<9; i++) {
			int a = arr[i];
			if(a!=0) {
				if(hash[a-1]!=0) {
					return -1;
				}
				hash[a-1]=a;
			}
		}
		for(int i=0; i<9; i++) {
			if(hash[i]==0) {
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		SolvingTools s = new SolvingTools();
		int[] test = { 1, 7, 8, 0, 6, 4,  2, 3, 9 };
		System.out.println(s.getMissing(test));

	}

}
