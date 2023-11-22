package stack;

import java.util.Stack;

public class PushPopStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println(st);
		pushEl(st, 1);
		pushEl(st, 2);
		pushEl(st, 3);
		pushEl(st, 4);
		pushEl(st, 5);
		pushEl(st, 6);
		pushEl(st, 7);
		// poping elements form stack
		popEl(st);
		popEl(st);
		popEl(st);
	}

	public static void popEl(Stack stk) {
		System.out.println("Pop-> ");
		Integer i = (Integer) stk.pop();
		System.out.println(i);
		System.out.println("stack : " + stk);
	}

	public static void pushEl(Stack<Integer> stk, int x) {
		stk.push(new Integer(x));
		System.out.println("Push->" + x);
		System.out.println("stack : " + stk);
	}
}
