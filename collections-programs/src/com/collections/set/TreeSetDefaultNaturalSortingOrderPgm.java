package com.collections.set;

import java.util.TreeSet;

/**
 * @author MAHI
 *
 */
public class TreeSetDefaultNaturalSortingOrderPgm {

	/**
	 * Comparable(Interface):
	 * 
	 * 1)It is present in java.lang.*
	 * 
	 * 2)Only one method : public int compareTo(Object obj);
	 */

	/**
	 * obj1.compareTo(obj2)
	 * 
	 * obj1 is the element to be inserted and obj2 element is already inserted
	 * element
	 * 
	 * ->Returns negative if obj1 has to come before obj2.
	 * 
	 * ->Returns positive if obj1 has to come after obj2.
	 * 
	 * ->Returns zero if obj1 and obj2 are equal.
	 */

	/*
	 * If you are trying to add heterogeneous elements you will surely get 'CLASS
	 * CAST EXCEPTION'
	 * 
	 * If you trying to add NULL values you will surely get 'NULL POINTER EXCEPTION'
	 */

	/*
	 * NOTE : Heterogeneous elements are not allowed because we cannot compare a
	 * number and a string
	 */
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();

		/**
		 * Since its the first element it is not compared with any element,it is
		 * directly added to the TreeSet
		 */
		treeSet.add("K");
		System.out.println("Adding 'K' to the TreeSet:" + treeSet);

		/**
		 * compare "A" and "K"
		 * 
		 * "A".compareTo("K")->According to default natural sorting order it will return
		 * negative ,i.e "A" has to come before "K"
		 * 
		 * So "A" is added to the TreeSet BEFORE "K" i.e to the LEFT.
		 **/
		treeSet.add("A");
		System.out.println("Adding 'A' to the TreeSet:" + treeSet);

		/**
		 * "Z" is compared with the root of the TreeSet ,so currently "K" is at the root
		 * with "A" to its left node and none at the right node
		 * 
		 * "Z".compareTo("K")->According to default natural sorting order it will return
		 * positive ,i.e "Z" has to come after "K"
		 * 
		 * So "Z" is added to the TreeSet AFTER "K" i.e to the RIGHT.
		 */
		treeSet.add("Z");
		System.out.println("Adding 'Z' to the TreeSet:" + treeSet);
	}
}
