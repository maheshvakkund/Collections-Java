package com.collections.set;

import java.util.TreeSet;

/**
 * @author MAHI
 *
 */
public class TreeSetPgm {

	/**
	 * 1) Underlying Data Structure is Balanced Tree.
	 * 
	 * 2) Duplicates are not allowed.
	 * 
	 * 3) Heterogeneous objects are not allowed .(If trying to insert will get class
	 * cast exception)
	 *
	 * 4) Insertion order is not preserved
	 *
	 * 5) Null insertion possible only once till java 1.8 and that too at first
	 * place and after that no element can be added
	 * 
	 * 6) All elements will be inserted based on sorting order.If no sorting order
	 * defined it will be default natural sorting order ,if one defines it would
	 * customized sorting order
	 * 
	 */

	/*
	 * SINCE NO SORTING ORDER IS PROVIDED ALL ELEMENTS ARE SORTED BASED ON DEFAULT
	 * NATURAL SORTING ORDER.
	 * 
	 * FOR NUMBERS IT IS 0-9
	 * 
	 * FOR ALPHABETS IT IS A-Z
	 */
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("java");
		treeSet.add("Java");
		treeSet.add("artificial inteligence");
		treeSet.add("python");
		treeSet.add("Ruby");
		System.out
				.println("Insertion order not preserved,heterogeneous elements not allowed,null insertion not possible"
						+ treeSet);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Trying to add a duplicate 'Java' " + treeSet.add("java"));
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Tree Set after adding a duplicate" + treeSet);
	}

}
