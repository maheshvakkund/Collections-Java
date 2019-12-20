package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MAHESH
 *
 */
public class MapInfMethods {

	public static void main(String[] args) {

		/**
		 * Methods available in Map Interface
		 */

		/**
		 * 1) Object put(Object key,Object value):
		 * 
		 * To Add a key-value pair to the Map,if key already present then old value will
		 * be replaced with new value and returns old value
		 *
		 */

		/**
		 * 2)void putAll(Map m):
		 * 
		 * Copies all of the mappings from the specified map to existing map
		 *
		 **/

		/**
		 * 3) Object get(Object key):
		 * 
		 * Return the value associated with the specified with the key ,gets the value
		 * if key is available else if key not available returns null
		 */

		/**
		 * 4)Object remove(Object key):
		 * 
		 * Removes the mapping for a key from this map if it is present
		 */

		/**
		 * 5)boolean containsKey(Object key):
		 * 
		 * Returns true if this map contains a mapping for the specified key else
		 * returns false
		 */

		/**
		 * 6)boolean containsValue(Object value):
		 * 
		 * Returns true if this map maps one or more keys to the specified value else
		 * return false
		 */

		/**
		 * 7)boolean isEmpty():
		 * 
		 * Returns true if this map contains no key-value mappings.
		 */

		/**
		 * 8)int size():
		 * 
		 * Returns the number of key-value mappings in this map
		 */

		/**
		 * 9)void clear():
		 * 
		 * Removes all of the mappings from this map (optional operation). The map will
		 * be empty after this call returns.
		 */
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(101, "java");
		map.put(102, "python");
		map.put("java", "oops");
		map.put("java", "oops");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Contents of first Map :" + map);

		Map<Object, Object> secondMap = new HashMap<Object, Object>();
		secondMap.put(103, "artificial intelligence");
		secondMap.put(104, "machine learning");
		System.out.println("Contents of second Map:" + secondMap);

		map.putAll(secondMap);

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Adding contents of second map to first map:" + map);

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Value assosciated with key 101:" + map.get(101));

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Value assosciated with key 107:" + map.get(107));

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Remove the entry with key 'java' :" + map.remove("java"));

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Check key 104 available in Map or not:" + map.containsKey(104));

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Check 'java' value available or not :" + map.containsValue("java"));

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Check if map is empty or not?:" + map.isEmpty());

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Size of the map : " + map.size());

		System.out.println("-----------------------------------------------------------------------------------------");
		map.clear();
		System.out.println("After clearing the map" + map);
	}
}
