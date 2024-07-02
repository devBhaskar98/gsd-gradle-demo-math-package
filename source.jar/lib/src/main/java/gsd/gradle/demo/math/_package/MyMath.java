package gsd.gradle.demo.math._package;

public class MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My Math Caculator");
		
		MyMathV1 math = new MyMathV1(20, 40);
		
		System.out.println("Lombok getter is working: " + math.getB());
	}

}
