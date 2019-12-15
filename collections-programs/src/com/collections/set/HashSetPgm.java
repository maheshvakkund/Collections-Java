package com.collections.set;

import java.util.HashSet;

/**
 * @author MAHI
 */
public class HashSetPgm {
	/**
	 * 1) Underlying DataStructure of Hashset is HASHTABLE.
	 *
	 * 2)Duplicate Objects are not allowed.
	 * 
	 * 3)Insertion order is Not preserved.
	 * 
	 * 4) All objects will be inserted based on the Hashcode of the objects.
	 * 
	 * 5)Null insertion is possible.
	 * 
	 * 6)Heterogeneous objects are allowed.
	 * 
	 * 7)If frequent operation is Search then Hashing related data Structure is the
	 * best.
	 * 
	 */

	/*
	 * NOTE : HASHSET AND LINKEDHASHSET :NO MAJOR DIFFERENCE
	 * 
	 * 1)In linked LinkedHashset underlying data structure is linked list + hash
	 * table.
	 * 
	 * 2)Insertion order is preserved in LinkedHashset.
	 * 
	 * 3)Introduced in 1.4 Version
	 * 
	 * 4) There are no specific methods to LinkedHashset (ALL METHODS USED IN
	 * LinkedHashset ARE INHERITED FROM COLLECTION INTERFACE just like HASHSET)
	 */

	/**
	 * There are no specific methods to HASHSET (ALL METHODS USED IN HASHSET ARE
	 * INHERITED FROM COLLECTION INTERFACE)
	 */

	public static void main(String[] args) {
		HashSet<Object> hashSet = new HashSet<>();

		hashSet.add("Java");
		hashSet.add("Artificial Intelligence");
		hashSet.add(null);
		hashSet.add(10);
		System.out.println(
				"Heterogeneous elements are allowed,Null insertion is possible,Insertion order is not preserved:"
						+ hashSet);
		System.out
				.println("Trying to add a duplicate value 'Java' it will not show any error but it will not add to set:"
						+ hashSet.add("Java"));
		System.out.println("My main set after adding a duplicate 'Java'" + hashSet);
	}
}
