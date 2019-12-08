package com.collections.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPgm {
	/**
	 * 1)We can use Enumeration to get the objects one by one from the legacy
	 * collection object 2)We can use/Create Enumeration object by using elements
	 * methods of vector class.
	 *
	 * Specific methods in Enumeration
	 * ========================================================
	 * 
	 * 1)public boolean hasMoreElements();
	 *
	 * 2)public Object nextElement();
	 *
	 * Limitations of Enumeration
	 * ==========================================================
	 * 
	 * 1)Enumeration is applicable only for legacy class not for all classes,hence
	 * it is legacy cursor.
	 *
	 * 2)Enumeration has only Read Access and has no remove capability
	 *
	 */
	public static void main(String[] args) {
		int i = 0;
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("-----------------------------------------------------------------------------------------");
		for (i = 0; i <= 10; i++) {
			v.addElement(i);
			System.out.println("Elements in the vector : " + i);
		}

		Enumeration<Integer> e = v.elements();
		System.out.println("-----------------------------------------------------------------------------------------");
		while (e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();
			if (I % 2 == 0) {
				System.out.println("Elements divisible by 2 : " + I);
			}
		}
	}

}
