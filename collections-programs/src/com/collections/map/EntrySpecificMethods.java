package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author MAHI
 *
 */
public class EntrySpecificMethods {

	/**
	 * Method available in interface Entry<K,V>
	 */

	/**
	 * 1)Object getKey():
	 * 
	 * Get the Key Values present in the map during iteration
	 */

	/**
	 * 2)Object getValue():
	 * 
	 * Get the Values present in the map during iteration
	 */

	/**
	 * 3)Object setValue():
	 * 
	 * Set the new values at the given key location
	 */
	public static void main(String[] args) {

		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(101, "java");
		map.put(102, "python");
		map.put(103, "machine learning");
		map.put(104, "artificial intelligence");

		System.out.println("Elements of the map : " + map);
		System.out.println("-----------------------------------------------------------------------------------------");

		/***
		 * COLLECTION VIEW OF THE MAP
		 */

		/**
		 * Set entrySet():
		 * 
		 * To get the set of entries{entries means the key values pair} and to add it in
		 * the SET
		 */

		/**
		 * 
		 * Set keySet():
		 * 
		 * To get the set of keys {values are excluded} and to add it in the SET
		 */

		Set<Entry<Object, Object>> set = map.entrySet();

		Iterator<Entry<Object, Object>> itr = set.iterator();

		while (itr.hasNext()) {

			Entry<Object, Object> map1 = (Map.Entry<Object, Object>) itr.next();

			System.out.println("The elements as KEY--VALUE pair : " + map1.getKey() + " --" + map1.getValue());

			if (map1.getKey().equals(102)) {
				map1.setValue("Ruby");
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After Setting the element at key 102 to Ruby:" + map);

	}

}
