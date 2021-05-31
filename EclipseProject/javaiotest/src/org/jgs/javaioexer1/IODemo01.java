package org.jgs.javaioexer1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import org.junit.Test;

public class IODemo01 {

	/*
	 * 加密图片
	 */
	@Test
	public void imageEncryption() {
		// 造流
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(new File("小姐姐.jpg")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("小姐姐_copy1.jpg")));
			
			byte[] data = new byte[1024];
			int len;
			while ((len=bis.read(data))!=-1) {
				data[0]+=67;
				bos.write(data, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void imagedecryption() {
		// 造流
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(new File("小姐姐_copy1.jpg")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("小姐姐_copy2.jpg")));

			byte[] data = new byte[1024];
			int len;
			while ((len = bis.read(data)) != -1) {
				data[0] -= 67;
				bos.write(data, 0, len);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//3.获取文本上每个字符出现的次数
	@Test
	public void countFileChars() {
		// 造流
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("hello.txt")));
			
			char[] data = new char[10];
			int len ;
			StringBuilder sb = new StringBuilder();
			while ((len = br.read(data))!=-1) {
				sb.append(data,0,len);
			}
			countStringChars(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// https://blog.csdn.net/qq_41264055/article/details/81101116
	public void countStringChars(String str) {
		char[] strArray = str.toCharArray();
		// 新建一个hashmap
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		// 遍历字符数组
		for (char c : strArray) {
			hashMap.put(c, hashMap.containsKey(c) ? hashMap.get(c)+1 : 1 );
		}
		// 换行和回车的显示是一样的,但是ASCII不一样,10和13
		for (char c : hashMap.keySet()) {
			System.out.print("字符:"+c+"\t"+(int)c+"\t--->");
			System.out.println("出现次数:"+hashMap.get(c));
			
		}
	}
	
	@Test
	public void test1() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str = input.nextLine();
		
		// 字符串转字符数组
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			System.out.println(c);
		}
		// 新建一个hashmap
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		// 遍历字符数组
		for (int i = 0; i < strArray.length; i++) {
			Character c = strArray[i];
			if (hashMap.containsKey(c)) {
				Integer count = hashMap.get(c)+1;
				hashMap.replace(c, count);
			} else {
				hashMap.put(c, 1);
			}
			
		}
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		input.close();
		
	}
}
