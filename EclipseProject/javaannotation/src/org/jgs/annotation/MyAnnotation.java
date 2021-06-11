package org.jgs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author AlexYU
 * @date 2021年6月2日上午9:49:37
 */
@Documented
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	//String  value();  //定义注解中的参数  如果只有一个参数 参数的名字是value 那么传参时可以直接写参数的值
	//String  name();
	int num() default 60;
}
