package org.jgs.day10;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test() {
		Student student = new Student("张小华", "翻斗花园", '男', 10, 70, 80);
		student.showInfo();
	}

}
