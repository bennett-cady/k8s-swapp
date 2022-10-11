package com.SimpleProject;

import java.util.ArrayList;

public class BinService {

	public static int binToInt(String bin) 
	{
		int total=0; int idx=0;
		for(int i=bin.length()-1; i>-1; i--) 
		{
			if(bin.charAt(idx)=='1') {
				total+=Math.pow(2, i);
			}
			idx++;
		}
		return total;
	}
	
	public static String intToBin(int n) 
	{
		if(n<0) {return "";} 
		if (n==1 || n==0) {
			return String.valueOf(n);
		}
		String bin=""; int mid=0;
		while(Math.pow(2, mid)<=n) {
			mid++;
		}
		for(int i=mid-1; i>-1; i--) 
		{
			int exp=(int) Math.pow(2, i);
			if(exp<=n) 
			{
				bin+="1"; n-=exp;
			} else { bin+= "0"; }
		}
		return bin;
	}
	
	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("101"); arr.add("1010");
		arr.add("111111"); arr.add("0"); 
		arr.add("1"); arr.add("10"); 
		arr.add("");
		for(String e: arr) {
			System.out.println(binToInt(e));
		}
		
		System.out.println(intToBin(3));
	}
	
}
