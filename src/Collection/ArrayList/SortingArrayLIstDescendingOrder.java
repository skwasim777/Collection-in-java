package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayLIstDescendingOrder {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Wasim");
		arr.add("Salman");
		arr.add("Farhan");
		arr.add("Lukman");
		// prinitng unsorted array
		System.out.println(arr);
		// after sorting in descendong oreder
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("After Sorting " + arr);
	}
}
