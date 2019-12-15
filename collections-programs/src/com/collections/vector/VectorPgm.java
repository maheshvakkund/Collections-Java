package com.collections.vector;

import java.util.Vector;

/**
 * @author MAHI
 *
 */
public class VectorPgm {

	public static void main(String[] args) {

		/***
		 * Vector Specific methods
		 */

		/**
		 * 1) public addElement(Object o);
		 */

		/**
		 * 2) public removeElement(Object o);
		 */

		/**
		 * 3) public remove(int index);
		 */

		/**
		 * 4) public removeAllElements();
		 */

		/**
		 * 5) public removeElementAt(int index);
		 */

		/**
		 * 6) public void clear();
		 */

		/**
		 * 7) Object elementAt(int index);
		 */

		/**
		 * 8) Object firstElement();
		 */

		/**
		 * 9) Object lastElement();
		 */

		/**
		 * 10) public int size();
		 */

		/**
		 * 11) public int capacity();
		 */

		/**
		 * 12) Enumeration elements();
		 */

		Vector<Object> v = new Vector<>();

		v.add("java");
		v.add(null);
		v.add(30);
		v.add("python");
		v.add("java");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(
				"In Vector duplicates are allowed ,insertion order is preserved,Heterogeneous object are allowed,Null insertion is possible :"
						+ " " + v);

		/**
		 * public removeAllElements() : Removes all components from this vector and sets
		 * its size to zero.
		 * 
		 */
		v.removeAllElements();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After executing removeAllElements : " + v);

		/**
		 * public addElement(Object o) : Adds the specified component to the end of this
		 * vector, increasing its size by one.
		 */
		v.addElement("Java");
		v.addElement("Python");
		v.addElement("Artificial Intelligence");
		v.addElement("machine learning");

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("The elements of the vector : " + v);

		/**
		 * Object firstElement() : Returns the component at the specified index.
		 * 
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("The first element of the vector : " + v.firstElement());

		/**
		 * Object lastElement() : Returns the last component of the vector.
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("The last element of the vector : " + v.lastElement());

		/**
		 * public int size():Returns the number of components in this vector.
		 * 
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("The size of the vector : " + v.size());

		/**
		 * public int capacity() : Returns the current capacity of this vector.
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("The initial capacity of the vector :" + v.capacity());

		/**
		 * Object elementAt(int index): Returns the component at the specified index.
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Find the element at second index : " + v.elementAt(2));

		/**
		 * public remove(int index):Removes the element at the specified position in
		 * this Vector. Returns the element that was removed from the Vector.
		 */
		v.remove(0);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After Removing the element at index 0 : " + v);

		/**
		 * public removeElement(Object o): Removes the first (lowest-indexed) occurrence
		 * of the argument from this vector.
		 */
		v.removeElement("Artificial Intelligence");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After Removing the element Artificial Intelligence : " + v);

		/**
		 * public removeElementAt(int index):Deletes the component at the specified
		 * index.
		 */
		v.removeElementAt(1);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After Removing the element at index 1 : " + v);

		System.out.println("-----------------------------------------------------------------------------------------");
		v.addElement("Java");
		v.addElement("Python");
		v.addElement("Artificial Intelligence");
		v.addElement("machine learning");

		System.out.println("Adding the elements to the vector : " + v);
		System.out.println("-----------------------------------------------------------------------------------------");

		/**
		 * public void clear():Removes all of the elements from this Vector. The Vector
		 * will be empty after this call returns
		 */
		v.clear();
		System.out.println("Vector after clearing" + v);

	}

}
