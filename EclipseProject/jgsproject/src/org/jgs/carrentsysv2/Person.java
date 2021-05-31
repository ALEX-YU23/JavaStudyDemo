package org.jgs.carrentsysv2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Person {
	private String name ;
	private String id ;
	private double money ;
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", money=" + money ;
	}
	
}
