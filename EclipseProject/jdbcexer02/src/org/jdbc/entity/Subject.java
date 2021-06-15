package org.jdbc.entity;

public class Subject {

	private Integer subjectid;
	private String subjectname;
	
	public Subject() {
	}
	public Subject(String subjectname) {
		this.subjectname = subjectname;
	}
	public Subject(Integer subjectid, String subjectname) {
		this.subjectid = subjectid;
		this.subjectname = subjectname;
	}

	public Integer getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
	}
	
	
	
	
}
