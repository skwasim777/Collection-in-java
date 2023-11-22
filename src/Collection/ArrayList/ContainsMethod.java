package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList<String> firsrList = new ArrayList<String>(Arrays.asList("Good", "Morning", "Student"));
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Good", "Night", "Freinds"));
		// storing camparison output in thisList
		ArrayList<String> thirdLIst = new ArrayList<>();
		for (String temp : firsrList) {
			thirdLIst.add(secondList.contains(temp) ? "Yes" : "No");
			System.out.println(thirdLIst);
		}
	}
}
