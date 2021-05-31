package org.jgs.day06;

import java.util.Scanner;

public class TestPets {

	public static void main(String[] args) {
		System.out.println("欢迎您来到宠物店!");
		
		Scanner scan = new Scanner(System.in);
		
		Pets pets = new Pets();
		System.out.print("请输入要领养宠物的名字:");
		pets.setName(scan.next());
		
		System.out.print("请选择要领养的宠物类型: (1. 狗狗2、企鵝):");
		pets.setType(scan.nextByte());
		System.out.print("请选择企鹅的性别: (1、 Q仔2、Q妹) :");
		pets.setGender(scan.nextByte());
		System.out.print("请输入企鹅的健康值(1~100之间) : ");
		pets.setHealthScore(scan.nextByte());
		
		System.out.println("健康值应该在0至100之间，默认值为60.");
		System.out.println("宠物的自白:");
		
		String name = pets.getName();
		String gender = (pets.getGender()==1)?"Q仔":"Q妹";
		
		System.out.println("我的名字叫"+name+"，健康值是"+
		pets.getHealthScore()+",和主人的亲密度是0,我的性别是"+gender+"。");
	}

}
