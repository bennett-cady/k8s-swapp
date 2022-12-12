package SudokuSolver;

public class Extractor {
	
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
	
	public static int boxByRowColumn(int row, int col) {
		if( row<=2 && row>=0) {
			if(col<=2 && col>=0) {
				return 0;
			}else if(col>=3 && col<=5) {
				return 1;
			} else {
				return 2;
			}
		}
		return 0;
	}

}
