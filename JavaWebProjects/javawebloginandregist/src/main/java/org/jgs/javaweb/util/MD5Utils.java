package org.jgs.javaweb.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/***
 * 使用MD5实现密码加密
 * @author AlexYU
 *
 */
public final class MD5Utils {

	private MD5Utils() {}
	
	public static String encryption(String password) {
		
		MessageDigest dg = null;
		try {
			dg = MessageDigest.getInstance("md5");
			byte[] bs = dg.digest(password.getBytes());
			
			Encoder encoder = Base64.getEncoder();
			
			return encoder.encodeToString(bs).substring(0, 22);
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
		return null;
	}
	

	public static String decryption(String password) {
		
		MessageDigest dg = null;
		try {
			dg = MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		Decoder decoder = Base64.getDecoder();
		byte[] dc = decoder.decode(password);
		
		
		return password;
		
	}
}
