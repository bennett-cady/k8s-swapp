package SudokuSolver;

public class Solver 
{
	
	public int getMissing(int[] arr) 
	{
		SudokuValidator sv = new SudokuValidator();
		if(!sv.noDuplicates(arr)) {
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
		System.out.println(idx);
		if(idx==-1) {return -1;}
		int[] hash = {0,0,0,0,0,0,0,0,0};
		for(int i=0; i<9; i++) 
		{
			int a = arr[i];
			if(a!=0) {
				if(hash[a-1]!=0) {
					return -1;
				}
				hash[a-1]=a;
			}
		}
		for(int i=0; i<9; i++) 
		{
			if(hash[i]==0) {
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Solver s = new Solver();
		int[] test = { 1, 7, 8, 0, 6, 4,  2, 3, 9 };
		System.out.println(s.getMissing(test));

	}

}
