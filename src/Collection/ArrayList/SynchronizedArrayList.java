package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		// non-synchronized arraylist
		List<String> list = new ArrayList<>();
		list.add("wasim");
		list.add("shaikh");
		list.add("sofiyan");
		list.add("salamn");

		// synchronize arraylist
		List<String> synchronizedList = Collections.synchronizedList(list);
		boolean isSynchronized = synchronizedList instanceof RandomAccess;

		System.out.println("Is the list synchronized? " + isSynchronized);

		synchronized (synchronizedList) {
			Iterator<String> itr = synchronizedList.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
