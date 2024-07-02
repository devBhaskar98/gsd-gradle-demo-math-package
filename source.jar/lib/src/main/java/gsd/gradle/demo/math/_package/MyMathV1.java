package gsd.gradle.demo.math._package;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class MyMathV1 {

	private Integer a;
	
	private Integer b;
	
	public MyMathV1(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
		
}
