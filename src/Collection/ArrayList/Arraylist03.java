package Collection.ArrayList;

import java.util.ArrayList;

//iterarting arraylist object by using foreach loop

public class Arraylist03 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		// traversing list through for each loop
		for (String str : a) {
			System.out.println(str);
		}
	}
}
