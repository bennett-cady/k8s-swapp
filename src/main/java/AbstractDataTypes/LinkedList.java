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
	
	public void add(LinkedList arr, String str) {
		Node node = new Node(str);
		if(arr.head==null) {
			arr.head = node;
		} else {
			Node current = arr.head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=node;
		}
		size++;
	}
	
	public String printList(LinkedList arr) {
		if(arr.size==0) {
			return "";
		}
		String items = ""; 
		Node current = arr.head;
		while(current.next!=null) {
			items += current.strData+ ", "; 
			current=current.next;
		}
		items+=current.strData; 
		return items;
	}
	
	public Node get(LinkedList arr, int idx) {
		if (idx>=arr.size()) { idx=arr.size()-1; } else if (idx<0) { idx =0; }
		Node current = arr.head; int ci=0;
		while(ci<idx) {
			current=current.next; ci++;
		}
		return current;
	}
	
	public boolean contains(LinkedList arr, String item) {
		Node current = arr.head; int idx=0;
		while(idx<arr.size()) {
			if(current.strData.equals(item)) {
				return true;
			}
			current=current.next; idx++;
		}
		return false;
	}
	
	public void insert(LinkedList arr, String str, int idx) 
	{
		if( idx>=arr.size() || arr.size()==0 ) {
			arr.add(arr, str); return;
		}
		Node newNode = new Node(str);
		if(idx<=0)  {
			newNode.next=arr.head; arr.head=newNode; 
			size++; return;
		}
		int ci=0; 
		Node current = arr.head; 
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
	
	public void delete(LinkedList arr, int idx) 
	{
		if(arr.size()==0) {return;}
		if(arr.size==1) {
			arr.head = null;
			size=0;
			return;
		}
		if(idx<=0) {
			arr.head=arr.head.next; size--;
			return;
		}
		if(idx>=arr.size) {
			idx=arr.size -1;
		}
		int ci=0; 
		Node prev=null; 
		Node current=arr.head;
		while(ci<=idx) 
		{
			if(ci==idx-1) 
			{
				prev=current;
				if(idx>=arr.size()-1) 
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

/*	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(ll, "3");
		ll.add(ll, "8");
		ll.add(ll, "7");
		ll.add(ll, "5");
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		// 3, 8, 7, 5 : 4
		
		ll.insert(ll, "10", 0);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.insert(ll, "22", 22);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.insert(ll, "4", -8);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
		ll.insert(ll, "0", 2);
		System.out.println(ll.printList(ll)); System.out.println(ll.size());
		
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
	}
*/
	
}
