package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class contentEquals {
	public static boolean compareList(ArrayList li1, ArrayList li2) {
		return li1.toString().contentEquals(li2.toString()) ? true : false;

	}

	public static void main(String[] args) {
		ArrayList<String> firstList = new ArrayList<>(Arrays.asList("Java", "Python"));
		ArrayList<String> secondList = new ArrayList<>(Arrays.asList("Java", "Python"));
		System.out.println("When list are same : " + compareList(firstList, secondList));
		secondList.add("go");
		System.out.println("When List are not same : " + compareList(firstList, secondList));
	}
}
