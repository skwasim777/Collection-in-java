package LlinkedList;

import java.util.LinkedList;

public class LinkedList02 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("wasim");
		list.add("sofiyan");
		list.add("salman");
		list.add("lukman");
		list.add("farhan");
		System.out.println("After invoking add method : " + list);
		// adding a element at specified possition
		list.add(1, "ubed");
		System.out.println("after adding elemen at sepcified possition : " + list);
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("moeen");
		list2.add("kasim");
		// adding second list element to the first list
		list.addAll(list2);
		System.out.println("After invoking addall method : " + list);
		LinkedList<String> list3 = new LinkedList<>();
		list3.add("rahul");
		list3.add("arbaz");
		list.addAll(1, list3);
		System.out.println("after invoking add all method : " + list);
		// adding element at first possition
		list.addFirst("Umar");
		System.out.println("after invoking addfirst method : " + list);
		// adding elements at last index
		list.addLast("arishfa");
		System.out.println("after invoking addlast metghod : " + list);
	}
}
