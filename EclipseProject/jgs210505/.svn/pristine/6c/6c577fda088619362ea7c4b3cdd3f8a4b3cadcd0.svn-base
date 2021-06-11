package org.jgs.annotation.day01;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author mosin
 * @DATE 2021年6月2日
 */
@Documented //标记该注解 在生成的api文档中显示
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})//注解的使用位置
@Retention(RetentionPolicy.RUNTIME)//注解的生效时机
public @interface MyAnnotation {

	
	//String  value();  //定义注解中的参数  如果只有一个参数 参数的名字是value 那么传参时可以直接写参数的值
	//String  name();   //使用注解时,该参数用户必须设置  因为没有设置默认值
	int age() default 0; //使用default设置默认值 参数用户不是必须要设置的  不设置则使用默认值

}
