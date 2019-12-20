package com.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author MAHI
 *
 */
public class TreeSetPrintStringDescOrder {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>(new PrintStringReverseOrder());
		treeset.add("java");
		treeset.add("JAVA");
		treeset.add("PYHTON");
		treeset.add("machine learning");
		treeset.add("artificial intelligence");
		System.out.println(treeset);
	}
}

/**
 * Arrange the elements in descending Order
 */
class PrintStringReverseOrder implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		String I1 = (String) o1; //TypeCasting to String type by type reference
		String I2 = o2.toString(); //TypeCasting to string type by using toString()

		return I2.compareTo(I1);

		/**
		 * To print in ascending Order
		 **/
		/*
		 * return I1.compareTo(I2);
		 */

	}

}
