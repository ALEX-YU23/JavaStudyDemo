package org.jgs.pra01;

import org.junit.Test;

public class TestPra1 {

	@Test
	public void testEml() {
		Manger manger = new Manger("张祥", 30,'男',"经理", 120020.890);
		Clerk clerk = new Clerk("李四", 20, '女', "人事部", 6000.0);
		System.out.println(manger.showInfo());
		System.out.println(clerk.showInfo());
	}

}
