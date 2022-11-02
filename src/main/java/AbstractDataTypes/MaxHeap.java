package AbstractDataTypes;

import java.util.ArrayList;

public class MaxHeap 
{
	
	private int[] mheap;
	int size;
	int max;
	
	public MaxHeap() 
	{
		this.max = 30;
		this.size=0;
		mheap = new int[30];
	}
	
	public MaxHeap(int max) 
	{
		this.max = max;
		this.size=0;
		mheap = new int[max];
	}
	
	public void push(int n)
	{
		mheap[this.size]=n;
		this.size++;
		this.percUp();
	}

	public void percUp() 
	{
		if(this.size==1) {
			return;
		}
		int curr=this.size-1;
		int parent=-1;
		if(curr%2==0) {
			parent= curr/2 - 1;
		} else {
			parent=curr/2;
		}
		while( mheap[curr] > mheap[parent] ) 
		{
			int temp = mheap[curr];
			mheap[curr] = mheap[parent];
			mheap[parent]=temp;
			curr=parent;
			if(curr==0) {
				return;
			}
			if(curr%2==0) {
				parent= curr/2 - 1;
			} else {
				parent=curr/2;
			}
		}
	}
	
	public void percDown(int idx) 
	{
		
	}
	
	public void deleteRoot() 
	{
		int temp = mheap[0];
		mheap[0]=mheap[this.size-1];
		mheap[this.size-1] = null;
		this.size--;
		this.percDown(0);
	}

	
	public String printHeap() {
		String all="";
		for(int i=0; i<this.size-1; i++) {
			all+=String.valueOf(mheap[i])+", ";
		}
		all+=String.valueOf(mheap[this.size-1]);
		return all;
	}
	
	public static void main(String[] args) {
		MaxHeap test = new MaxHeap(90);
		test.push(100);
		test.push(16);
		test.push(76);
		test.push(7);
		System.out.println(test.size);
		System.out.println(test.printHeap());
		test.push(18);
		System.out.println(test.printHeap());
		
		test.push(24);
		System.out.println(test.printHeap());
		test.push(301);
		System.out.println(test.printHeap());
		test.push(55);
		System.out.println(test.printHeap());
		
		test.push(981);
		 
		test.push(232);
		 
		test.push(4);
		 
		test.push(800);
		 
		test.push(92);
		
		test.push(261);
		
		test.push(191);
		System.out.println(test.printHeap());
	}

}
