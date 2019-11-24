/**
 * 
 */
package com.collections.arraylist;

import java.util.ArrayList;

/**
 * @author MAHI
 *
 */
public class ArrayListPgm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		/**
		 * 1)public boolean add(Object o) - Adds a single object
		 *
		 * 2)public void add(int index , Object o) - Adds a object at a specific index
		 * 
		 * 3)public void remove(int index) - Remove an object from the specified
		 * position
		 * 
		 * 4)public void get(int index) - Get an object from the specified position
		 * 
		 * 5)Object set(int index, Object o) - Set an object at the specified position
		 * 
		 * 6)boolean addAll(int position/index,Collection c) - Add a group of object
		 * 
		 * 7)int indexOf(Object o)- Displays the first occurrence index of the object
		 * 
		 * 8)int lastIndex(Object o) - Displays the last occurrence index of the object
		 * 
		 * In Arraylist duplicates are allowed , Insertion order is
		 * preserved,Heterogeneous object are allowed,Null insertion is possible
		 */

		/**
		 * public boolean add(Object o) - Adds a single object
		 */
		list.add("java");
		System.out.println("First object in list : " + " " + list);

		/**
		 * public void add(int pos/index , Object o) - Adds a object at a specific index
		 */
		list.add(1, "program");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(" Adds a object at 1st index : " + " " + list);

		list.add("machine learning");
		list.add("computer organization");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Objects in the list after adding 4 objects : " + " " + list);

		/**
		 * public void remove(int index) - Remove an object from the specified position
		 */
		list.remove(2);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Remove an object from the 2nd position : " + " " + list);

		/**
		 * public void get(int index) - Get an object from the specified position
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(" Get an object from the 1st position : " + " " + list.get(1));

		/**
		 * Object set(int index, Object o) - Set an object at the specified position
		 */
		list.set(2, "graph theory");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(" Set an object at the 2nd position : " + " " + list);

		ArrayList<String> templist = new ArrayList<String>();
		templist.add("python");
		templist.add("artificial intelligence");

		/**
		 * boolean addAll(int position/index,Collection c) - Add a group of object
		 */
		list.addAll(1, templist);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Add a group of object to existing list : " + "" + list);

		list.add("artificial intelligence");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Adding a duplicate 'Artificial Intelligence': " + " " + list);

		/**
		 * int indexOf(Object o)- Displays the first occurrence index of the object
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Displays the first occurrence index-Artificial intelligence : " + ""
				+ list.indexOf("artificial intelligence"));

		list.add("python");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Adding a duplicate 'python' :" + " " + list);
		/**
		 * int lastIndex(Object o) - Displays the last occurrence index of the object
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Displays the last occurrence index of the python :" + "" + list.lastIndexOf("python"));

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("FINAL LIST : " + " " + list);

		/**
		 * In Arraylist duplicates are allowed ,insertion order is
		 * preserved,Heterogeneous object are allowed,Null insertion is possible
		 */
		ArrayList<Object> listHeterogeneous = new ArrayList<>();
		listHeterogeneous.add("python");
		listHeterogeneous.add(10);
		listHeterogeneous.add("python");
		listHeterogeneous.add(null);

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(
				"In Arraylist duplicates are allowed ,insertion order is preserved,Heterogeneous object are allowed,Null insertion is possible :"
						+ " " + listHeterogeneous);
	}

}
