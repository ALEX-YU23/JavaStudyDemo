package org.jgs.jdbc.entity;
/**
 * 班级的实体类
 * @author mosin
 * @date 2021年6月15日
 */
public class Classes {
	
	private  int  id;
	private String classname;
	
	public Classes() {
	}
	public Classes(int id, String classname) {
		super();
		this.id = id;
		this.classname = classname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", classname=" + classname + "]";
	}

}
