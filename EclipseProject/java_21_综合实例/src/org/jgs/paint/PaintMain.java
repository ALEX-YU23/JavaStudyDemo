package org.jgs.paint;

interface IGraphical{    // 制定绘图标准
	public void paint(); // 绘图
}

class Point {
	private double x ;
	private double y ;
	public Point(double x,double y) {
		this.x = x ;
		this.y = y ;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

class Triangle implements IGraphical {
	private Point [] a;  // 保存第一条边的坐标
	private Point [] b;  // 保存第二条边的坐标
	private Point [] c;  // 保存第三条边的坐标
	public Triangle(Point [] a,Point [] b,Point [] c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public void paint() {
		System.out.println("绘制第一条边，开始坐标：["+this.a[0].getX() +","+ this.a[0].getY() +"],结束坐标：["+this.a[1].getX() +","+ this.a[1].getY() +"]");                            
		System.out.println("绘制第二条边，开始坐标：["+this.b[0].getX() +","+ this.b[0].getY() +"],结束坐标：["+this.b[1].getX() +","+ this.b[1].getY() +"]");                            
		System.out.println("绘制第三条边，开始坐标：["+this.c[0].getX() +","+ this.c[0].getY() +"],结束坐标：["+this.c[1].getX() +","+ this.c[1].getY() +"]");                            
	}
}
class Circular implements IGraphical {

	private Point center;
	private double radius ;
	
	public Circular(Point center,double radius) {
		this.center = center;
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public Point getCenter() {
		return center;
	}
	@Override
	public void paint() {
		
		System.out.println("开始绘制以坐标为：" + center + "半径为"+ this.radius + "的圆形");
		
	}
	
}



public class PaintMain {

}
