package org.jgs.apidemo.day01;

import java.util.UUID;

import org.junit.Test;

/*
 * UUID  通用唯一识别码  8-4-4-4-12
 * 
 */
public class UUIDDemo {
	@Test
	public void test01() {
		//c5659103-c50e-4a41-a789-c4cd78850f47
		UUID randomUUID = UUID.randomUUID();
		System.out.println(randomUUID);
		//将uuid转换成String字符串
		String struuid= randomUUID.toString();
		System.out.println(struuid);
		//去除中间的连接符
		String replace = struuid.replace("-", "");
		System.out.println(replace);
	}

}
