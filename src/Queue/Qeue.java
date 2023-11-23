package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Qeue {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.offer("Amit");
		q.offer("Vijay");
		q.offer("Karan");
		q.offer("Rahul");
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
	}
}
