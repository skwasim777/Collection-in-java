package Collection.ArrayList;

import java.util.ArrayList;

public class MergeToList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);

		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
		System.out.println("Megre List  " + list1);
	}
}
