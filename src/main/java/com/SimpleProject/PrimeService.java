package com.SimpleProject;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeService {

	public static boolean isPrime(int n) 
	{
		if(n<=1) {return false;}
		int mid = (int) (n/2); int curr=2;
		while(curr<=mid) 
		{
			if(n%curr==0) {
				return false;
			}
			if(curr==2) {curr++;} else {curr+=2; }
		}
		return true;
	}
	
	public static int nextPrime(int n) 
	{
		if(n%2==0) {n++;} else {n+=2;}
		while(!isPrime(n)) {
			n+=2;
		}
		return n;
	}
	
	public static String firstNPrimes(int n) 
	{
		int curr=2; String primes="";
		for(int i=0; i<n; i++) 
		{
			if(i!=n-1) 
			{
				primes+=String.valueOf(curr)+" ";
			} else {primes+=String.valueOf(curr);}
			curr=nextPrime(curr);
		}
		return primes;
	}
	
	public static boolean isGenerator(int p, int g) 
	{
		if(!isPrime(p)) {
			return false;
		}
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		int base = g;
		for( int i=0; i<p-1; i++ ) {
			arr.add(g); g= (g*base)%p;
		}
		Collections.sort(arr);
		for(int i=0; i<arr.size(); i++) 
		{
			if(arr.get(i)-1 != i) {
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> getGenerators(int p) 
	{
		ArrayList<Integer> gens = new ArrayList<Integer>();
		if(!isPrime(p)) {
			return gens;
		}
		for(int i=2; i<p; i++) 
		{
			if(isGenerator(p, i)) {
				gens.add(i);
			}
		}
		return gens;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
