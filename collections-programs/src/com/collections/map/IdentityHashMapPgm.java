package com.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * @author MAHI
 *
 */
public class IdentityHashMapPgm {
	/**
	 * In general == operator is meant for reference comparison (Address comparison)
	 * whereas .equals() meant for content comparison BUT in case oF IdentityHashMap
	 * its inverse.
	 */
	public static void main(String[] args) {
		IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);

		identityHashMap.put(I1, "JAVA");
		identityHashMap.put(I2, "PYTHON");
		/**
		 * JVM uses == in case of IdentityHashMap to find duplicate Key entry
		 */
		System.out.println(identityHashMap);

		HashMap<Integer, String> hashMap = new HashMap<>();
		Integer I3 = new Integer(10);
		Integer I4 = new Integer(10);

		hashMap.put(I3, "JAVA");
		hashMap.put(I4, "PYTHON");
		/**
		 * JVM uses .equals() in case of IdentityHashMap to find duplicate Key entry
		 */
		System.out.println(hashMap);
	}
}
