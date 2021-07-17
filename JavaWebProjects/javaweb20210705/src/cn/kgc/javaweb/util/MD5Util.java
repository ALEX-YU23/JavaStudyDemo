package cn.kgc.javaweb.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Encoder;

/*
 * 使用MD5实现密码的加密
 * 
 */
public final class MD5Util {

	private MD5Util() {}
	
	public static  String encryptPassword(String password) {
		
		MessageDigest dt = null ;
		try {
			dt = MessageDigest.getInstance("md5");
			byte[] digest = dt.digest(password.getBytes());
			Encoder encoder = Base64.getEncoder();
			String encodeToString = encoder.encodeToString(digest);
			return encodeToString.substring(0,encodeToString.length()-2);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
}
