package Collection.ArrayList.Sort;

import java.util.Comparator;

public class RatingComparator implements Comparator<SmartPhone> {

	@Override
	public int compare(SmartPhone o1, SmartPhone o2) {
		return (o1.rating < o2.rating) ? -1 : (o1.rating > o2.rating) ? 1 : 0;
	}

}
