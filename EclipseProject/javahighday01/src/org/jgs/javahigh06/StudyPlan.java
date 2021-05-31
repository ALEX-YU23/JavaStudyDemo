package org.jgs.javahigh06;

public enum StudyPlan {

	L1("java开发工程师"),
	L2("大数据开发工程师"),
	L3("大数据挖掘工程师");
	
	private String phase;
	
	StudyPlan(String phase) {
		this.phase = phase;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}
	
	
}
