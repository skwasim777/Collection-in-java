package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConertArrayLIstToArray {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("wasim");
		arr.add("shaikh");
		arr.add("salman");
		arr.add("farhan");
		// convert arralist to array
		String[] str = arr.toArray(new String[arr.size()]);
		for (String atr1 : str) {
			System.out.println(atr1);
		}
		// conert array to array list
		List<String> l2 = new ArrayList<>();
		l2 = Arrays.asList(str);
		System.out.println(l2);
	}
}
