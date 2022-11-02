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
		if(this.size<=1 || idx > (this.size/2 - 1) ) {
			return;
		}
		while(idx<= this.size/2-1) {
			if( this.size%2==0 && idx==this.size/2 - 1) { //only has left child
				int leftChild = mheap[2*idx + 1];
				if(mheap[idx]>=leftChild) {
					return;
				}
			//int temp = leftChild;
				mheap[2*idx+1]=mheap[idx];
				mheap[idx]=leftChild;
				idx=2*idx+1;
			} else {
				if( mheap[idx]>=mheap[2*idx+1] && mheap[idx]>=mheap[2*idx+2] ) { 
					//in correct position
					return;
				} else {
					// needs to be swapped
					if( mheap[2*idx+1] >= mheap[2*idx+2 ] ) {
						int temp = mheap[2*idx+1];
						mheap[2*idx+1]=mheap[idx];
						mheap[idx]=temp;
						idx=2*idx+1;
					} else {
						int temp = mheap[2*idx+2];
						mheap[2*idx+2]=mheap[idx];
						mheap[idx]=temp;
						idx=2*idx+2;
					}
				}
			}
		}
	}
	
	public void deleteRoot() 
	{
		if(this.size==1 || this.size==0) {
			mheap[0]=0;
			this.size=0;
			return;
		}
		mheap[0]=mheap[this.size-1];
		mheap[this.size-1] = 0;
		this.size--;
		this.percDown(0);
	}

	
	public String printHeap() {
		if(this.size==0) {
			return "";
		}
		String all="";
		for(int i=0; i<this.size-1; i++) {
			all+=String.valueOf(mheap[i])+", ";
		}
		all+=String.valueOf(mheap[this.size-1]);
		return all;
	}
	
	/*
	public void heapify(int[] arr) {
		this.size = arr.length;
		int parent = arr.length/2 -1;
		while(parent>=0) {
			this.percDown(parent);
			parent--;
		}
	}
	// requires working percDown method
	*/
	
	
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
		 
		
		System.out.println(test.printHeap());
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
		test.deleteRoot();
		System.out.println(test.printHeap());
		
	}

}
