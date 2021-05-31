package org.jgs.day06;

class Item {
	private long iid ;
	private String  title ;
	// 一个分类下要有多个子分类
	private Subitem subitem [] ;
	public Item(long iid,String title) {
		this.iid = iid ;
		this.title = title ;
	}
	public void setSubitem(Subitem[] subitem) {
		this.subitem = subitem;
	}
	public Subitem[] getSubitem() {
		return subitem;
	}
	public String getInfo() {
		return " 【分类信息】iid = " + this.iid + "、 title" + this.title ;
	}
}
class Subitem {
	private long sid ;
	private String title ;
	private Item item ;
	public Subitem(long sid, String title) {
		this.sid = sid ;
		this.title = title ;
	}
	public String getInfo() {
		return " 【子分类信息】iid = " + this.sid + "、 title" + this.title ;
	}
}



public class JavaDemo {

	public static void main(String[] args) {

	}

}
