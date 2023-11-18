package Collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DifferenceBetweenArrayListandLinkedLIst {
	public static void main(String[] args) {
		// if our freqent operation is random access then we should go for arraylist

		List<String> list = new ArrayList<>();
		list.add("Wasim");
		list.add("Salman");
		list.add("Lukman");
		list.add("Farhan");
		System.out.println("Tarversing arraylist...");
		for (String str : list) {
			System.out.println(str);
		}

		// if our frequent operation is insertion and deletion then we sould go for
		// linkedlist
		List<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		System.out.println("After adding list :" + l);
		l.remove(0);
		System.out.println("After removing list :" + l);
		l.add(0, 1);
		System.out.println("After changing list : " + l);
	}
}
