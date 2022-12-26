package LivingThing;

import java.util.Comparator;

public class CompareThivesByHeight implements Comparator<Thief> {

	@Override
	public int compare(Thief t1, Thief t2) {
		if(t1.getHeight() >t2.getHeight())
			return 1;
		else if (t1.getHeight()< t2.getHeight())
			return -1;
		else
			return 0;
	}

}
