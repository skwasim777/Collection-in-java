package Collection.ArrayList;

import java.util.ArrayList;

public class CompareTwoArrayList {
	public static void main(String[] args) {
		// we can compare two araylist by using equals method which retunse true or
		// false
		// first list
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Wasim");
		arr1.add("Lukman");
		arr1.add("Salman");
		arr1.add("Farhan");
		System.out.println(arr1);
		// second list
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("Wasim");
		arr2.add("Lukman");
		arr2.add("Salman");
		arr2.add("Farhan");
		System.out.println(arr2);
		boolean b = arr1.equals(arr2);
		System.out.println(b);
		// adding another element to list
		arr2.add("Sofiyan");
		boolean b1 = arr1.equals(arr2);
		System.out.println(b1);

	}
}
