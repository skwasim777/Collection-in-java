package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Amit");
		pq.add("vijay");
		pq.add("karan");
		pq.add("Jai");
		pq.add("Rahul");

		System.out.println("Head : " + pq.peek());
		System.out.println("Head : " + pq.element());

		// iterating queue
		Iterator<String> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("remove : " + pq.remove());
		System.out.println(pq);
		System.out.println("remove : " + pq.poll());
		System.out.println(pq);
	}
}
