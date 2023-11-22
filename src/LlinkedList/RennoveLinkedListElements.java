package LlinkedList;

import java.util.LinkedList;

public class RennoveLinkedListElements {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("wasim");
		list.add("sofiyan");
		list.add("adnan");
		System.out.println(list);
		list.remove("wasim");
		System.out.println(list);
		// remove elements on the basis of specified possition
		list.remove(0);
		System.out.println(list);
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("salman");
		list1.add("farhan");
		list.addAll(list1);
		System.out.println(list);
		// removing first accurancy og elements
		list.removeFirstOccurrence("adnan");
		System.out.println(list);
		// removing last accurancy of elements
		list.removeLastOccurrence("farhan");
		System.out.println(list);
		// rmoveing all elements avialble in the list 
		list.clear();
		System.out.println(list);
	}
}
