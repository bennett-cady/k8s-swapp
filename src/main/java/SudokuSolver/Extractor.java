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
			} else {return 2;}
		} else if(row>=3 && row<=5) 
		{
			if(col<=2 && col>=0) {
				return 3;
			}else if(col>=3 && col<=5) {
				return 4;
			} else {return 5;}			
		} 
		if(col<=2 && col>=0) {
			return 6;
		}else if(col>=3 && col<=5) {
			return 7;
		} 
		return 8;
	}
	
	public static void main(String[] args) {
		int b1 = boxByRowColumn(4, 0);
		int b2 = boxByRowColumn(1, 5);
		int b3 = boxByRowColumn(8, 8);
		int b4 = boxByRowColumn(6,4);
		int[] boxes = {b1, b2, b3, b4};
		for(int b: boxes) {
			System.out.println(b);
		}
		/*
		 * 3
		 * 1
		 * 8
		 * 7
		 */
	}

}
