package Collection.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Mango");
		arr.add("Apple");
		arr.add("Mango");
		arr.add("Apple");
		System.out.println(arr.toString());
		Set<String> s = new HashSet<>(arr);
		System.out.println(s);
	}
}
