package collections;

import java.util.Stack;

public class Stackpro {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.empty());
		System.out.println(s.search(10));
	}

}
