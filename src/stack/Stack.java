package stack;

import java.util.*;

public class Stack {
	public static void main(String[] args) {
		java.util.Stack<Integer> st = new java.util.Stack<>();
		boolean result = st.empty();
		System.out.println(result);
		// pushing elements into stack
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		result = st.empty();
		System.out.println(result);
	}
}
