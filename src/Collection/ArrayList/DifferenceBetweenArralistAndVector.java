package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class DifferenceBetweenArralistAndVector {
	public static void main(String[] args) {
		// arralist is non-synchronized and it uses iterator to traverse arralist
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Wasim");
		arr.add("Lukman");
		arr.add("Farhan");
		arr.add("Salman");
		// to check synchroniation version
		List<String> synchronizedList = Collections.synchronizedList(arr);
		// tarverse arralist using iterartor
		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// vector is synchronized
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		Enumeration<Integer> e = vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
