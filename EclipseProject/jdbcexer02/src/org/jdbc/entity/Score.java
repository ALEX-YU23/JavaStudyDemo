package org.jdbc.entity;

public class Score {

	private Integer scoreid;
	private Integer sid ;
	private Integer subjectid;
	private Double garde;
	public Score() {
	}
	public Score(Integer sid, Integer subjectid, Double garde) {
		this.sid = sid;
		this.subjectid = subjectid;
		this.garde = garde;
	}
	public Score(Integer sid, Integer subjectid) {
		this.sid = sid;
		this.subjectid = subjectid;
	}
	public Integer getScoreid() {
		return scoreid;
	}
	public void setScoreid(Integer scoreid) {
		this.scoreid = scoreid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}
	public Double getGarde() {
		return garde;
	}
	public void setGarde(Double garde) {
		this.garde = garde;
	}
	@Override
	public String toString() {
		return "Score [scoreid=" + scoreid + ", sid=" + sid + ", subjectid=" + subjectid + ", garde=" + garde + "]";
	}
	
	
	
}
