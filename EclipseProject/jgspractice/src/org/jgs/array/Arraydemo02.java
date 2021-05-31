package org.jgs.array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraydemo02 {

	public static void main(String[] args) {
		
		// 初始化存储3个班的成绩数组
		int[][] scores = new int[3][3];
		// 创建扫描器
		Scanner scan = new Scanner(System.in);
		
		// 初始化每个班的总成绩
		int sum = 0;
		int[] sumScore = new int[3];
		// 外层循环接受每个班级的成绩
		for (int i = 0; i < scores.length; i++) {
			// 内层接受一个班每个学生的成绩
			System.out.println("请输入"+(i+1)+"班学生的成绩");
			for (int j = 0; j < scores.length; j++) {
				System.out.println("请输入第"+(j+1)+"个学生的成绩");
				// 键盘读入学生成绩
				scores[i][j] = scan.nextInt();
				// 计算每个班学生总成绩
				sum += scores[i][j];
			}
			System.out.println((i+1)+"班总成绩为："+sum);
			sumScore[i] = sum;
			// 算完一个班的总成绩之后，sum归0；
			sum = 0;
			scan.close();
		}
		System.out.println(Arrays.toString(sumScore));

	}

}
