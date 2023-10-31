package Collection.ArrayList;

import java.util.ArrayList;

public class GetandSetArrayList {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		System.out.println(a.get(1));
		a.set(1, "b");
		for (String str : a) {
			System.out.println(str);
		}
	}
}
