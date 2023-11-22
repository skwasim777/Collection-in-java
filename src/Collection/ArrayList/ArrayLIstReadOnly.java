package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIstReadOnly {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("Wasim");
		array.add("Shaikh");
		array.add("Sofiyan");
		array.add("Ubed");
		List<String> unmodifiableList = Collections.unmodifiableList(array);
		unmodifiableList.add("Salman");
		System.out.println(array);
	}
}
