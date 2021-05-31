package org.leetcode.day01;

/**
 * 
 * @Description 1011. 在 D 天内送达包裹的能力
 * 传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
 * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，
 * 我们都会按给出重量的顺序往传送带上装载包裹。
 * 我们装载的重量不会超过船的最大运载重量。
 * 返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
 * 请注意，货物必须按照给定的顺序装运
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月26日下午5:04:36
 */
public class Solution1011 {
	public static int shipWithinDays(int[] weights, int D) {
		
		int len = weights.length;
		// 要保证每天都有货物运，所以货物数必须大于天数，天数至少大于一
		if (D < 1 || weights.length < D) {
			return 0;
		}
		// 求出货物中最大的重量:即为最大运载重量的下限
		int min = 0;
		// 求出货物总重量:即为最大运载重量的上限
		int max = 0;
		for (int i = 0; i < len; i++) {
			if (min<weights[i]) {
				min = weights[i];
			}
			max += weights[i];
		}
//		int day ;
		// 用二分查找
		while (min<max) {
			
			int mid = (min+max)/2; //表示当前运货量
			
			int temp = 0;
			
			int day = 1;
			
			for (int weight : weights) {
				temp += weight;
				if (temp>mid) {
					day++;
					temp = weight;
				}
				
			}
			
			
			if (day>D) {
				min = mid + 1; 
			} else {
				max = mid;
			}
		}
		
		
		
		return min;

    }
}
