package com.collections.stack;

import java.util.Stack;

/**
 * @author MAHI
 *
 */
public class StackPgm {

	public static void main(String[] args) {

		/**
		 * 1) public void push(Object o);
		 * 
		 * 2) public Object pop();
		 * 
		 * 3) public Object peek();
		 * 
		 * 4) public boolean empty();
		 * 
		 * 5) public int search(Object o);
		 */
		Stack<Object> s = new Stack<>();

		/**
		 * public void push(Object o) : Pushes an item onto the top of this stack.
		 */
		s.push("Java");
		s.push("Artificial intelligence");
		s.push("machine learning");
		s.push("pyhton");

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("The elements in the stack : " + s);

		/**
		 * public Object pop(): Removes the object at the top of this stack and returns
		 * that object as the value of this function.g
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Remove element and return the top of the stack : " + s.pop());

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("After removing the element from the top of the stack : " + s);

		/**
		 * public Object peek() : Looks at the object at the top of this stack without
		 * removing it from the stack.
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Only view the last element (Top Element): " + s.peek());

		/**
		 * public int search(Object o) : Returns the 1-based position where an object is
		 * on this stack.
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Search for the given object and return the element:" + s.search("machine learning"));

		/**
		 * public boolean empty() : Tests if this stack is empty.
		 */
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Check if the stack is empty or not :" + s.empty());

	}

}
