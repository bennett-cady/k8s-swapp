package SudokuSolver;

public class SudokuValidator 
{
	
	public boolean noDuplicates(int[] arr) 
	{
		int[] hash = new int[9];
		for(int i=0; i<9; i++) {
			hash[i]=0;
		}
		for(int i=0; i<9; i++) {
			if(arr[i]!=0) {
				int a=arr[i];
				if(hash[a-1]!=0) {
					return false;
				} else {hash[a-1]=a;}
			}
		}
		return true;
	}
	
	public static int[] extractColumn(int[][] board, int col) 
	{
		int[] column=new int[9];
		int idx=0;
		try {
			for(int[] row: board) {
				column[idx]=row[col]; 
				idx++;
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return column;
	}
	
	public static int[] extractBox(int[][] board, int box) 
	{
		int[] boxArr=new int[9];
		int idx=0;
		int column = -1;
		if( box%3 == 0 ) {
			column=0;
		} else if(box%3 == 1) {
			column=3;
		} else {
			column=6;
		} // int column = 3*(box%3);
		int originalC=column;
		try {
			int row = box;
			while( row%3 != 0 ) {row--;}
			for(int i=0; i<9; i++) {
				if(i%3==0 && i!=0) {
					row++;
					column=originalC;
				}
				boxArr[idx]=board[row][column];
				column++;
				idx++;
			}			
		} catch(Exception e) {
			System.out.println(e);
		}
		return boxArr;
	}
	
	public static String printArr(int[] arr) {
		String all="";
		for(int a: arr) {
			all+=String.valueOf(a)+" ";
		}
		return all;
	}

	public static void main(String[] args) {
		
		//SudokuValidator sv= new SudokuValidator();
		
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
		
		

		int[] c1 = extractBox(board, 4);
		String c1s = printArr(c1);
		System.out.println(c1s);			
		


	}

}
