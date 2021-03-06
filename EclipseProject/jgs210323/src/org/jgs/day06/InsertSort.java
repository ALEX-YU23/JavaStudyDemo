package org.jgs.day06;
/**
 * 插入排序
 * 1.把当前的数组看成一个有序序列和一个无序序列
 * 2.从无序序列中依次取值，插入到有序的序列中
 * @author mosin
 * @DATE 2021年4月7日
 */
public class InsertSort {

	public static void main(String[] args) {
		int[]  num = {10,2,30,13,20,15};
		
		for (int i = 1; i < num.length; i++) {
			
			int temp = num[i];
			int index = i-1;
			
			while (index>=0&&num[index]>temp) {
				num[index+1] = num[index];
				index--;
			}
			num[index+1] = temp;
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		

	}

}
