package org.jgs.collection.day01;

public class Point implements Comparable<Point> {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		
		if(this==obj) {
			return true;
		}
		
		if(obj instanceof Point) {
			Point point = (Point)obj;
			return this.x==point.getX()&&this.y==point.getY();
		}
		
		return false;
		
	}
	
	public int compareTo(Point point) {
//		return (this.x*this.x+this.y*this.y)-(point.x*point.x+point.y*point.y);
		return this.y - point.y ;
	}


}
