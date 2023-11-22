package Collection.ArrayList.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<SmartPhone> list = new ArrayList<>();
		SmartPhone p1 = new SmartPhone("Apple", "6s", 50000, 10);
		SmartPhone p2 = new SmartPhone("Samsumg", "10s", 70000, 8);
		SmartPhone p3 = new SmartPhone("MI", "Note9", 12000, 3);
		SmartPhone p4 = new SmartPhone("Vivo", "y20", 800000, 8);
		SmartPhone p5 = new SmartPhone("Oppo", "f12", 20000, 6);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println("Actual List :");
		System.out.println(list);
		System.out.println("Sorting the list as comparator :");
		Collections.sort(list, new RatingComparator());
		System.out.println(list);
		System.out.println("Reversing the comparator sorting :");
		Comparator<SmartPhone> cmp = Collections.reverseOrder(new RatingComparator());
		Collections.sort(list, cmp);
		System.out.println("Printing the list : ");
		System.out.println(list);

	}
}
