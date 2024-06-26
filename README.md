Problem Solving

1. LinkedLists - Collection of nodes where each node contains the element and a reference to the next node. 
				 Use Case: Suitable for scenarios where the collection size changes frequently and insertion/deletion operations are common. LinkedLists are better for dynamic collections without the need for direct acces by index. 
				 Time Complexity: O(n) for accessing elemnts by position
				 				  For insertion/deletion:
				 				  	At beginning: 0(1)
				 				  	At the end: 0(1) if tail pointer is maintained, otherwise O(n)
				 				  	In the middle: O(1) if node reference is known, otherwise O(n)

2. CircularLinkedList - The last node points to the first node, completing a full circle of nodes. So, no null 
						element at the end.
						Use cases: Useful in the implementation of the queue data structure. 
						Traversing from the last node to the head node can be done in constant time
3. DoubleLinkedLists - This data structure has both the previous and next nodes in the list. It provides 
						simplicity to traverse, insert and delete the nodes in both directions in a list. 
						