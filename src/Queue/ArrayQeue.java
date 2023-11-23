package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQeue {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		// adding elements
		dq.add("wasim");
		dq.add("salman");
		dq.add("lukman");
		dq.offerFirst("farhan");
		// tarversing elements
		for (String str : dq) {
			System.out.println(str);
		}
		dq.pollLast();
		System.out.println("after invoking polllast method ");
		for (String str : dq) {
			System.out.println(str);
		}
	}
}
