Problem Solving

1. LinkedLists - Collection of nodes where each node contains the element and a reference to the next node. 
				 Use Case: Suitable for scenarios where the collection size changes frequently and insertion/deletion operations are common. LinkedLists are better for dynamic collections without the need for direct acces by index. 
				 Time Complexity: O(n) for accessing elemnts by position
				 				  For insertion/deletion:
				 				  	At beginning: 0(1)
				 				  	At the end: 0(1) if tail pointer is maintained, otherwise O(n)
				 				  	In the middle: O(1) if node reference is known, otherwise O(n)

2. circularLinkedList - The last node points to the first node, completing a full circle of nodes. So, no null 
						element at the end.
						Use cases: Useful in the implementation of the queue data structure. 
						Traversing from the last node to the head node can be done in constant time
3. DoubleLinkedLists - This data structure has both the previous and next nodes in the list. It provides 
						simplicity to traverse, insert and delete the nodes in both directions in a list. 


/***************************************************************************/

1. Collection: This interface represents group of objects known as its elements. It provides basic operations such as adding and removing elements, checking the size or checking if the element is included or not. 

2. List: An ordered collection that can contain duplicate elements. Use cases: when data ordering matters, such as maintaining insertion order or accessing elements by their index positions. ArrayList and LinkedList are widely used implementations. 

3. Set: A collection that cannot contain duplicate values. Use case: primiarily used when uniqueness of the element is a key requirement. 

4. Queue: Designed to hold elements prior to processing. Queues order elements in FIFO manner. LinkedList and PriorityQueue are common implementations, with each serving different uses depending on the required ordering and concurency characteristics. 

5. Map: Unlike other interfaces, maps doesn't extend COLLECTION interface, but is still a part of framework. A map stores key- value pairs, with each key mapping to exactly one key. HashMap and TreeMap are commonly used implementations, offering different sorting and performance characteristics.
/******************************************************************************/

ITERATING OVER COLLECTIONS:

1. USing Iterators: The iterator interface provides methods to iterate over collection. Use case: When you need to remove elements during iteration, as it supports a remove() method that safely deleted elements without causing ConcurrentModificationException.

2. Enhanced for-loop: Also known as the "for-each" loop, used when you dont need to remove elements during iteration. 

3. Java8 forEach-method: (Lambda Expression) forEach method provides a more concise and expressive way to iterate over collections. 

/****************************************************************************/

AVOIDING COMMON PROBLEMS

1. Using mutable objects as keys in Maps or elements in Sets : 
Prefer Immutable Objects: Use immutable objects as keys in maps or elements in sets. This ensures that their state cannot change once they are created, avoiding the issues discussed above.
Immutable Alternatives: If you need to use mutable objects, make sure that the parts of the object that affect equals and hashCode or compareTo methods do not change while the object is being used in a map or set.
Custom Wrappers: Consider using custom wrapper classes that encapsulate the mutable object and provide consistent equals and hashCode implementations based on the initial state of the object.

2. Ensure consistency with equals and hashCode methods to prevent unexpected behavior, especially if your collection is used in Set or as a key in Map.

3. Implement the Iterable interface to enable the use of enhanced for-loops and other iteration mechanisms.

4. Consider thread safety. If your collection is accessed by multiple threads, ensure it is properly synchronized or use java.util.concurrent utilities.


















