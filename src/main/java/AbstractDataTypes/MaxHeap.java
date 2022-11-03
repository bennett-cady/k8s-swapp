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
	
	public MaxHeap(int[] arr) {
		mheap=arr;
		this.size=arr.length;
		this.max=arr.length;
		this.heapify();
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
	
	
	public void heapify() 
	{
		int parent = this.size/2 -1;
		while(parent>=0){
			this.percDown(parent);
			parent--;
		}
	}
	
	
	/*
	public static int[] heapSort(int[] arr) {
	}
	*/
	
	
	public static void main(String[] args) {
		//MaxHeap test = new MaxHeap(90);
		int[] heap = {16, 23, 3, 45, 7, 100, 65, 19, 22};		
		MaxHeap mh = new MaxHeap(heap);
		System.out.println(mh.printHeap());
		// 100, 45, 65, 23, 7, 3, 16, 19, 22
		
		int[] heap1 = {1, 3, 2, 4, 6, 5, 8, 7};		
		MaxHeap mh1 = new MaxHeap(heap1);
		System.out.println(mh1.printHeap());
		//8, 7, 5, 4, 6, 1, 2, 3
		
		int[] heap2 = {1, 3};		
		MaxHeap mh2 = new MaxHeap(heap2);
		System.out.println(mh2.printHeap());
		//3, 1
		
		int[] heap3 = {1};		
		MaxHeap mh3 = new MaxHeap(heap3);
		System.out.println(mh3.printHeap());
		//1
		
		int[] heap4 = {};		
		MaxHeap mh4 = new MaxHeap(heap4);
		System.out.println(mh4.printHeap());
		//Nothing
		System.out.println("*************");
		
		int[] bigHeap = {164, 223, 15, 905, 67, 333, 721, 202, 4, 5, 1009, 245, 408, 125, 90, 880, 127, 134, 398};
		MaxHeap large = new MaxHeap(bigHeap);
		System.out.println(large.printHeap());
	}

}
