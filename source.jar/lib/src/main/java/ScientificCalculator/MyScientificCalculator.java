package ScientificCalculator;

public class MyScientificCalculator {

	private Integer a;
	
	private Integer b;
	
	MyScientificCalculator(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	
	public Integer doSum(Integer a, Integer b) {
		return a + b;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}
	
	
	
}

