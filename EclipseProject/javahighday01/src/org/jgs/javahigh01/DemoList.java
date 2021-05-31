package org.jgs.javahigh01;

import java.util.ArrayList;

import org.junit.Test;

@SuppressWarnings("serial")
public class DemoList extends ArrayList<String>{
	@Test
	public void Test01() {
		
		DemoList demoList1 = new DemoList();
		demoList1.add("0你是哪的？");
		demoList1.add("1VN女？");
		demoList1.add("2你是哪的？");
		demoList1.add("3你是哪的？");
		demoList1.add("4都是哪的？");
		demoList1.add("5你是哪的？");
		demoList1.add("6你哪的？");
		demoList1.add("7哪的？");
		demoList1.add("8你的？");
		
		demoList1.removeRange(2, 4);
		demoList1.stream().forEach(x->System.out.println(x));
		
	}
}