package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class retainAllMethod {
	public static void main(String[] args) {
		List<String> firstList = new ArrayList<>(Arrays.asList("M", "W", "J", "K", "T"));
		System.out.println("first list : " + firstList);
		List<String> secondList = new ArrayList<>(Arrays.asList("M", "W", "E", "K", "T"));
		System.out.println("second list : " + secondList);
		// return the common elements from both list
		secondList.retainAll(firstList);
		System.out.println("common elements : " + secondList);

		/*
		 * // containse metho use List<String> thirdList = new ArrayList<>(); for
		 * (String temp : firstList) { thirdList.add(secondList.contains(firstList) ?
		 * "Yes" : "No"); System.out.println(thirdList); }
		 */
	}
}
