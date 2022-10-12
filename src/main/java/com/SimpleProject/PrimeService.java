package com.SimpleProject;

import java.util.ArrayList;
import java.util.Collections;

import AbstractDataTypes.LinkedList;

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
	
	public static LinkedList firstNPrimes(int n) 
	{
		int curr=2; 
		LinkedList primes = new LinkedList();
		for(int i=0; i<n; i++) 
		{
			
			primes.add(primes, String.valueOf(curr));
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
		for( int i=0; i<p-1; i++ ) 
		{
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
	
	public static LinkedList getGenerators(int p) 
	{
		LinkedList gens = new LinkedList();
		if(!isPrime(p)) {
			return gens;
		}
		for(int i=2; i<p; i++) 
		{
			if(isGenerator(p, i)) {
				gens.add(gens, String.valueOf(i));
			}
		}
		return gens;	
	}

}
