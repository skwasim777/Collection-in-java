package stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class PeekMethodStack {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("wasim");
		st.push("salman");
		st.push("farhan");
		System.out.println(st);
		String s = st.peek();
		System.out.println(s);
		int location = st.search("salman");
		System.out.println(location);
		int size = st.size();
		System.out.println(size);
		/*
		 * Iterator<String> itr = st.iterator(); while (itr.hasNext()) { Object obj =
		 * itr.next(); System.out.println(obj); } st.forEach(n -> {
		 * System.out.println(n); });
		 */
		ListIterator<String> list = st.listIterator();
		while (list.hasPrevious()) {
			String i = list.previous();
			System.out.println(i);
		}
	}
}
