package org.jgs.enumdemo.day05;
/*
 * 性别的枚举类   引用类型的数据 
 * 男 女 其它  属性值之间使用逗号分割 
 * 枚举类中可以定义构造方法(可以有参，也可以无参) 但是必须是私有 也可以定义私有的属性
 */
public enum Gender {
	女("famal",1),
	男(), //Gender类型的对象
	其它("other",3);
	
	private String  Enname;
	private int index;
	
	
	public String getEnname() {
		return Enname;
	}
	public void setEnname(String enname) {
		Enname = enname;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	//构造方法是私有的 
	private Gender() {
		
	}
	private Gender(String Enname, int index) {
		this.Enname = Enname;
		this.index = index;
	}
	
	
	
	
	
	
}
