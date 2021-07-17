package jgs.javaweb.servlet.test;

import org.junit.Test;

import jgs.javaweb.servlet.util.MD5Utils;

public class MD5UtilTest {

	@Test
	public void testMD5() {
		String encryption = MD5Utils.encryption("12iu3456");
		System.out.println(encryption);
		System.out.println(encryption.length());
	}

}
