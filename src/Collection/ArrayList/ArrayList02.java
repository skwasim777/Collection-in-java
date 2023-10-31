package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList02 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();

		a.add("Wasim");
		a.add("Shaikh");
		a.add("Asharf");
		a.add("Husain");

		// traversing list through iterato
		Iterator itr = a.iterator();
		while (itr.hasNext()) {// checks if iterartot has next element
			System.out.println(itr.next());// printing the elements and move to next
		}
	}
}
