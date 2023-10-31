package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArralList {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("wasim");
		a.add("ashraf");
		a.add("shaikh");
		a.add("husain");
		Collections.sort(a);
		// tarversing arraylist onjects
		for (String str : a) {
			System.out.println(str);
		}
		ArrayList<Integer> i = new ArrayList<>();
		i.add(5);
		i.add(1);
		i.add(2);
		i.add(4);
		i.add(3);
		Collections.sort(i);
		for(Integer t : i) {
			System.out.println(t);
		}
	}
}
