package org.jgs.array;

class util {  // 是一个操作工具的类
	private int sum ;  // 保存总和
	private double avg ;  // 保存平均值
	private int max ;  // 保存最大值
	private int min ;  // 保存最小值
	
	public util (int data[]) {
		this.max = this.min = data[0];
		for (int i = 0; i < data.length; i++) {
			this.sum += data[i];
			if (data[i] > this.max) {
				this.max = data[i];
			}
			if (data[i] < min) {
				this.min = data[i];
			}
		}
		this.avg = this.sum / data.length;
	}
	
	public int getSum() {
		return this.sum;
	}
	public double getAvg() {
		return this.avg;
	}
	public int getMax() {
		return this.max;
	}
	public int getMin() {
		return this.min;
	}
	
}
public class ArrayDemo04 {
	public static void main(String[] args) {
        int data [] = new int [] {1,2,3,4,5}; // 通过方法可以获得数组内容
        util util = new util(data);
        System.out.println("数组内容最大值：" + util.getMax());
        System.out.println("数组内容最小值：" + util.getMin());
        System.out.println("数组内容总和：" + util.getSum());
        System.out.println("数组内容平均值：" + util.getAvg());
	}
}