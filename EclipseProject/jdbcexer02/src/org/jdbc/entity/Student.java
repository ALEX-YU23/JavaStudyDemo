package org.jdbc.entity;

public class Student {

	private Integer sid ;
	private String sname;
	private Integer cid = null;
	
	// 额外的数据
	private String cname;
	private String subjectname;
	private Double grade;
	
	
	public Student() {
	}

	public Student(String sname) {
		this.sname = sname;
	}
	
	public Student(Integer sid, String sname, Integer cid) {
		this.sid = sid;
		this.sname = sname;
		this.cid = cid;
	}
	

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cid=" + cid + ", cname=" + cname + ", subjectname="
				+ subjectname + ", grade=" + grade + "]";
	}


	
	
	
}
