package milestone135;

import java.util.Comparator;

public class ComparatorName implements Comparator<BaseContact> {

	@Override
	public int compare(BaseContact o1, BaseContact o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
