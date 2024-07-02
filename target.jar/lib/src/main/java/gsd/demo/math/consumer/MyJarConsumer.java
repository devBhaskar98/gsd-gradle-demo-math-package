package gsd.demo.math.consumer;

import gsd.gradle.demo.math._package.MyMathV1;

public class MyJarConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jar Consumer");
		MyMathV1 math = new MyMathV1(50,100);
		System.out.println("My Math sum is " + math.getA());
	}

}
