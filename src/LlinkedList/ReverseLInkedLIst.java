package LlinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLInkedLIst {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("wasim");
		list.add("sofiyan");
		list.add("ashraf");
		System.out.println("list in initial state : " + list);
		Iterator<String> itr = list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
