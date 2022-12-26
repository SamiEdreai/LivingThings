package LivingThing;

import java.util.Comparator;

public class CompareThivesByNumOfSteals implements Comparator<Thief> {

	@Override
	public int compare(Thief t1, Thief t2) {
		if(t1.getNumOfSteals() >t2.getNumOfSteals())
			return 1;
		else if (t1.getNumOfSteals() < t2.getNumOfSteals())
			return -1;
		else
			return 0;
	}

}
