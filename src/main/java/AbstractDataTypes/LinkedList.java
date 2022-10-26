package AbstractDataTypes;

public class LinkedList 
{
	
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
		if(this.head==null) {
			this.head = node;
		} else {
			Node current = this.head;
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
		Node current = this.head;
		while(current.next!=null) {
			items += current.strData+ ", "; 
			current=current.next;
		}
		items+=current.strData; 
		return items;
	}
	
	public String get(int idx) {
		if (idx>=this.size) { 
			idx=this.size-1; 
		} else if (idx<0) { 
			idx =0; 
		}
		Node current = this.head; int ci=0;
		while(ci<idx) {
			current=current.next; ci++;
		}
		return current.strData;
	}
	
	public boolean contains(String item) {
		Node current = this.head; 
		int idx=0;
		while(idx<this.size()) {
			if(current.strData.equals(item)) {
				return true;
			}
			current=current.next; idx++;
		}
		return false;
	}
	
	public void insert(String str, int idx) 
	{
		if( idx>=this.size || this.size==0 ) {
			this.add(str); 
			return;
		}
		Node newNode = new Node(str);
		if(idx<=0)  {
			newNode.next=this.head; this.head=newNode; 
			size++; 
			return;
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
	
	public void delete(int idx) 
	{
		if(this.size==0) {return;}
		if(this.size==1) {
			this.head = null;
			size=0;
			return;
		}
		if(idx<=0) {
			this.head=this.head.next; size--;
			return;
		}
		if(idx>=this.size) {
			idx=this.size -1;
		}
		int ci=0; 
		Node prev=null; 
		Node current=this.head;
		while(ci<=idx) 
		{
			if(ci==idx-1) 
			{
				prev=current;
				if(idx>=this.size()-1) 
				{
					prev.next = null; 
					size--; 
					return;
				}
			}
			current=current.next; ci++;
		}
		Node next=current; 
		prev.next=next; 
		size--;
	}


	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("3");
		ll.add("8");
		ll.add("7");
		ll.add("5");
		System.out.println(ll.printList()); System.out.println(ll.size());
		// 3, 8, 7, 5 : 4
		
		ll.insert("10", 0);
		System.out.println(ll.printList()); System.out.println(ll.size());
		// 10, 3, 8, 7, 5, 4
		 
		
		
		ll.insert("22", 22);
		System.out.println(ll.printList()); System.out.println(ll.size());
		//10, 3, 8, 7, 5, 22
		
		ll.insert("4", -8);
		System.out.println(ll.printList()); System.out.println(ll.size());
		// 4, 10, 3, 8, 7, 5, 22
		
		
		ll.insert("0", 2);
		System.out.println(ll.printList()); System.out.println(ll.size());
		// 4, 10, 0, 3, 8, 7, 5, 22
		
		/*
		ll.insert(ll, "17", 4);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 0);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 33);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 7);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 5);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 2);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, -5);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 1);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 2);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 2);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.delete(ll, 0);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.add(ll, "9");
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.add(ll, "6");
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.insert(ll, "11", 0);
		System.out.println(ll.printList(ll));
		
		ll.insert(ll, "3", 9);
		System.out.println(ll.printList(ll));
		
		ll.insert(ll, "99", -7);
		System.out.println(ll.printList(ll));
		
		ll.insert(ll, "101", 3);
		System.out.println(ll.printList(ll));
		*/
	}

	
}
