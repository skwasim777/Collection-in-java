package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RenoveAllElementsFromTwoLIst {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Wasim");
		arr1.add("Salman");
		arr1.add("Lukman");
		arr1.add("Farhan");
		System.out.println(arr1);
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("Wasim");
		arr2.add("Salman");
		arr2.add("Lukman");
		arr2.add("Sofiyan");
		arr2.removeAll(arr1);
		System.out.println(arr2);

		// find common element from two list
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println("First Array List : ");
		System.out.println(a);
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("Second Array List :");
		System.out.println(a1);
		// return the common elements from both
		a.removeAll(a1);
		System.out.println("Common Elements from both list..");
		System.out.println(a);
	}
}
