package org.jgs.javahigh04;

import java.util.Comparator;


public class LadyFirstComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		if (o1.getSex().equals(o2.getSex())) {
			return o1.getAge()-o2.getAge();
		}else {
			if (o1.getSex().equals('男')) {
				return 1;
			}else {
				return -1;
			}
		}
	}

}
