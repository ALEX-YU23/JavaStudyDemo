package org.jgs.javahigh07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1.创建一个会员类 Member
 * 属性:姓名(String)、ID(Integer)、账户余额(Double)
 * 2.使用List集合存放多个会员对象
 * 3.使用collections的sort方法对该集合进行排序
 * 1.先按照ID进行排序,ID位数越少越靠前
 * 2.再按照账户余额进行排序,余额越多越靠前
 */
public class Demo01 {

	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<>();
		
		memberList.add(new Member(10000, "夏磊磊", 5690d));
		memberList.add(new Member(10009, "胡发超", 2312.3d));
		memberList.add(new Member(10023, "李辉", 1444.2d));
		memberList.add(new Member(10010, "徐强", 99889.3d));
		memberList.add(new Member(10003, "田卫星", 8943.3974d));
		//1.先按照ID进行排序,ID位数越少越靠前
		Collections.sort(memberList, (m1,m2)->{
			if (m1.getId()>m2.getId()) {
				return 1;
			}
			return -1;
		});

		memberList.forEach(x->System.out.println(x));
		
		System.out.println("********************");
		
		//2.再按照账户余额进行排序,余额越多越靠前
		Collections.sort(memberList, (m1,m2)->{
			if (m1.getBalance()>m2.getBalance()) {
				return -1;
			}
			return 1;
		});

		memberList.forEach(x->System.out.println(x));
	}
}
