# Abstract Data Types

## Linked List
* Linked lists are basic objects that store data in a linear structure: it can be thought of as a line of objects. 
* It is implemented by creating nodes, a nested subclass of the linked list.
  *  Each node has 2 values: 
    * String: the actual value that is being stored
    * Node: the next node in the Linked List. The next node might be null, meaning this is the last Node in the list 
* This data structure can 
  * retrieve the value being stored at a certain index
  * insert/delete an item at a certain index
  * determine whether or not an item is in the list
* This Linked List class is used by the method firstNPrimes() in the PrimeService class    
## Max Heap
* Heaps are a way of storing data so that the largest item (in the case of max heap) can be retrieve in O(1) time
* They can be thought of as trees where the parent is always larger than its children, meaning the largest item is always at the top
* They can be implemented as binary trees or as arrays that are arranged in a special order
  * this MaxHeap class uses the array implementation 
* Adding items is always O(log(n)) time
 * The largest item in a heap is always the root (binary tree) or index 0 (array implementation)
   * If a newly added item is the largest, it will be at the root/ index 0 in O(log(n)) time
   * This means it can tell this item is the largest in the data set without comparing it to every item in the tree
   * This means heaps are very efficient ways of dealing with data where you are interested in quickly retrieving the largest/smallest item
* Heaps are used by the Heapsort algorithm, whose worst/average case scenario is always O(nlog(n)) 
* The MaxHeap class is not used by any methods of this project... yet 
