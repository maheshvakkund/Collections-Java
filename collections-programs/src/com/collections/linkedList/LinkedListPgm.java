package com.collections.linkedList;

import java.util.LinkedList;

/**
 * @author MAHI
 *
 */
public class LinkedListPgm {

	public static void main(String[] args) {

		LinkedList<Object> linkedList = new LinkedList<Object>();

		/**
		 * LinkedList Specific methods
		 * 
		 * 1) public void addFirst(Object) -Adding the object to the first place
		 * 
		 * 2) public Object getFirst() -Retrieves the data of the first object
		 * 
		 * 3) public Object getLast() -Retrieves the data of the last object
		 * 
		 * 4) public void addLast(Object o) -- Add the object to the last
		 * 
		 * 5) public Object removeLast() - remove the last object
		 * 
		 * 6) public Object removeFirst() - remove the first object
		 * 
		 */

		/**
		 * public void add(int index , Object o) - Adds a object at a specific index
		 */
		linkedList.add("java");
		System.out.println(" Adds a object at 1st index : " + " " + linkedList);
		linkedList.add(null);
		linkedList.add(30);
		linkedList.add("python");
		linkedList.add("java");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(
				"In Linked List duplicates are allowed ,insertion order is preserved,Heterogeneous object are allowed,Null insertion is possible :"
						+ " " + linkedList);

		/**
		 * public void addFirst(Object) -- Add the object to the first
		 */
		linkedList.addFirst("artificial intelligence");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Adding the object to the first place" + " " + linkedList);

		linkedList.set(2, "machine learning");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Set the second index element as 'machine learning'" + " " + linkedList);

		/**
		 * public Object getFirst() -Retrieves the data of the first object
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Retrieves the data of the first object:" + " " + linkedList.getFirst());
		/**
		 * public Object getLast() -Retrieves the data of the last object
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Retrieves the data of the last object:" + " " + linkedList.getLast());

		/**
		 * public void addLast(Object o) -- Add the object to the last
		 */
		linkedList.addLast("computer");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After adding 'computer' to the last:" + "" + linkedList);

		/**
		 * public Object removeLast() - remove the last object
		 */
		linkedList.removeLast();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After removing the last object :" + "" + linkedList);
		/**
		 * public Object removeFirst() - remove the first object
		 */
		linkedList.removeFirst();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After removing the first object:" + " " + linkedList);
	}

}
