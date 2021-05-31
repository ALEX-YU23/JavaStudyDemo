package org.jgs.javafiletest01;

import java.io.File;

import org.junit.Test;

public class FileTest {

	@Test
	public void test() {
		// 空文件夹的length为0
		File file = new File("E:\\temp - 副本\\e");
		System.out.println(file.length());
	}

}
