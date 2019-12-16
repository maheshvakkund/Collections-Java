package com.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author MAHI
 *
 */
public class TreeSetCustomizedSortingOrder {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>(new MyComparator());
		treeset.add(10);
		treeset.add(0);
		treeset.add(15);
		treeset.add(5);
		treeset.add(20);
		treeset.add(20);
		System.out.println(treeset);
	}
}

/**
 * Arrange the elements in descending Order
 * */
class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;

		if (I1 < I2) {
			return +1;

		} else if (I1 > I2) {
			return -1;
		}
		return 0;
	}

}
