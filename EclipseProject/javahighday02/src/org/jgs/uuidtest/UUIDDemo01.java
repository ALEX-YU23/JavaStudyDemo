package org.jgs.uuidtest;

import java.util.UUID;

import org.junit.Test;

public class UUIDDemo01 {

	@Test
	public void test01() {
		UUID randomUUID = UUID.randomUUID();
		
		System.out.println(randomUUID);
		
		String replace = randomUUID.toString().replace("-", "").replaceAll("\\d", "");
		String replace1 = randomUUID.toString().replace("-", "").replaceAll("[a-z]", "");
		System.out.println(replace);
		System.out.println(replace1);
	}
}
