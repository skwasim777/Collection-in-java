package LlinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIst01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("wasim");
		list.add("sofiyan");
		list.add("wasim");
		list.add("sofiyan");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
