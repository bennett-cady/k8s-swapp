package AbstractDataTypes;

import AbstractDataTypes.LinkedList.Node;

public class LL2 {
	
	Node head;
	int size=0;
	
	static class Node 
	{
		String strData;
		Node next;
		
		Node(){}
		
		Node(String s){
			strData = s;
			next = null;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void add(String str) {
		Node node = new Node(str);
		if(head==null) {
			head = node;
		} else {
			Node current = head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=node;
		}
		size++;
	}
	
	public String printList() {
		if(size==0) {
			return "";
		}
		String items = ""; 
		Node current = head;
		while(current.next!=null) {
			items += current.strData+ ", "; 
			current=current.next;
		}
		items+=current.strData; 
		return items;
	}
	
	public void insert(String str, int idx) 
	{
		if( idx>=size() || size()==0 ) {
			this.add(str); return;
		}
		Node newNode = new Node(str);
		if(idx<=0)  {
			newNode.next=this.head; this.head=newNode; 
			size++; return;
		}
		int ci=0; 
		Node current = this.head; 
		Node prevNode = null;
		while(ci<idx) 
		{
			if(ci==idx-1)
			{
				prevNode=current;
			} 
			current=current.next; ci++;
		}
		newNode.next=current; 
		prevNode.next=newNode;
		size++;
	}
	

	public static void main(String[] args) {
		LL2 l2 = new LL2();
		l2.add("8");
		l2.add("3");
		l2.add("2");
		LL2 z = new LL2();
		z.add("9");
		l2.add("7");
		l2.add("13");
		System.out.println(l2.printList());
		
		LL2 also = new LL2();
		also.add("11");
		z.add("841");
		also.add("6");
		System.out.println(also.printList());
		System.out.println(z.printList());
		System.out.println(" ");
		
		l2.insert("99", 2);
		System.out.println(l2.printList());
		
		l2.insert("981", 100);
		System.out.println(l2.printList());
		
		l2.insert("12", 0);
		System.out.println(l2.printList());

	}

}
