package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayLIstInMultipleWay {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Wasim");
		a.add("Salman");
		a.add("Ubed");
		a.add("Lukman");
		System.out.println("Traversing list through listiterator");
		ListIterator<String> list = a.listIterator(a.size());
		while (list.hasPrevious()) {
			String str = list.previous();
			System.out.println(str);
		}
		System.out.println("Tarvering list through for loop");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("Tarversing list through for each methdo");
		for (String s : a) {
			System.out.println(s);
		}
		System.out.println("Traversing list through the forEach method");
		a.forEach(f->{
			System.out.println(f);
		});
		System.out.println("Traversing list object using forEcahRemaining method");
		Iterator<String> itr = a.iterator();
		itr.forEachRemaining(r->{
			System.out.println(r);
		});
	}
}
