package org.jgs.javahigh02.comparator;

import java.util.Comparator;

import org.jgs.javahigh02.Student;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
	
}
