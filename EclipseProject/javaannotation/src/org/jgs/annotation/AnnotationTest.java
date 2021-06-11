package org.jgs.annotation;

class AnnotationTest {

	int a = 90;

	@MyAnnotation
	public AnnotationTest() {
	}
	
	@MyAnnotation(num = 100)
	@SuppressWarnings("unused")
	private void biubiu() {
		int a = 90;
	}

	@SuppressWarnings("unused")
	@Deprecated
	private void biubiu1() {
		int a = 90;
	}
	
}
