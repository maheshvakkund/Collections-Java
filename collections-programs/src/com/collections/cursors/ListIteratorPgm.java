package com.collections.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author MAHI
 *
 */
public class ListIteratorPgm {

	/**
	 * Advantages of ListIterator
	 * ======================================================
	 * 
	 * 1)List Iterator is a bidirectional cursor 2)By Using List Iterator we can add
	 * or replace Objects
	 */

	/**
	 * Methods Available in ListIterator
	 */

	/**
	 * 1)public boolean hasNext() :
	 * 
	 * Returns true if this list iterator has more elements when traversing the list
	 * in the forward direction.
	 */

	/**
	 * 2)public Object next() :
	 * 
	 * Returns the next element in the list and advances the cursor position in the
	 * forward direction.
	 */

	/**
	 * 3)public int nextIndex() :
	 * 
	 * Returns the next index of the element.
	 */

	/**
	 * 4)public boolean hasPrevious() :
	 * 
	 * Returns true if this list iterator has more elements when traversing the list
	 * in the forward direction.
	 */

	/**
	 * 5)public Object previous() :
	 * 
	 * Returns the previous element in the list and advances the cursor position in
	 * backward direction.
	 */

	/**
	 * 6)public int previousIndex() :
	 * 
	 * Returns the previous index of the element.
	 */

	/**
	 * 7)public void remove() :
	 * 
	 * Removes from the list the last element that was returned by next() or
	 * previous()
	 */

	/**
	 * 8)public void add(Object o) :
	 * 
	 * Inserts the specified element into the list.
	 */

	/**
	 * 9)public void set(Object o) :
	 * 
	 * Replaces the last element returned by next() or previous() with the specified
	 * element.
	 */

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("java");
		linkedList.add("python");
		linkedList.add("artificial intelligence");
		linkedList.add("machine learning");
		System.out.println("ELEMENTS IN THE LINKED LIST :" + linkedList);
		ListIterator<String> ltr = linkedList.listIterator();

		while (ltr.hasNext()) {
			String s = ltr.next();
			if (s.equals("python")) {
				ltr.remove();
			} else if (s.equals("java")) {
				ltr.add("scala");
			} else if (s.equals("machine learning")) {
				ltr.set("ruby");
			}
		}

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(
				"After removing element 'python' & adding scala when match 'java is found' and setting the value 'ruby' when element equals 'machine learning'");
		System.out.println(linkedList);

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Iterating the list in the previous order: ");
		while (ltr.hasPrevious()) {
			String s = ltr.previous();
			System.out.println(s);
		}
	}

}
