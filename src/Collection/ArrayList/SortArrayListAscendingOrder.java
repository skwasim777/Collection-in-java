package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListAscendingOrder {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Wasim");
		arr.add("Shaikh");
		arr.add("From");
		arr.add("Maharashtra");
		arr.add("India");
		// priniting the unsorted array
		System.out.println(arr);
		// sorting array list in ascending order
		Collections.sort(arr);
		System.out.println("After sorting " + arr);
	}
}
