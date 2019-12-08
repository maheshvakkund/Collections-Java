package com.collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author MAHI
 *
 */
public class IteratorPgm {
	/**
	 * 1)Iterator is applicable for any collection object and hence it is a
	 * universal cursor
	 *
	 * 2)By using iterator we can perfrom both read and remove objects
	 * 
	 * Methods Specific to Iterator:
	 * 
	 * ============================
	 * 
	 * 1)public boolean hasNext();
	 * 
	 * 2)public Object next();
	 * 
	 * 3)public void remove();
	 * 
	 * Limitations of Iterators:
	 * 
	 * ============================
	 * 
	 * 1)We can always move towards the forward direction and we cant move towards
	 * the backward direction,these are single direction cursors and not
	 * bi-directional
	 * 
	 * 2)By using iterator we can perform only read and rename operations and we
	 * cant perform replacement and addition of new objects
	 * 
	 * 3)To overcome these limitations we should go for listIterator
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		for (i = 0; i <= 10; i++) {
			list.add(i);
		}
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer I = itr.next();
			if (I % 2 == 0) {
				System.out.println("Elements divisible by 2 :" + I);
			} else {
				itr.remove();
			}

		}

		System.out.println("Elements in the list: " + list);
	}
}
