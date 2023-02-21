package ch02.unit4;

public class Ex05_Precision {

	public static void main(String[] args) {
		//정밀도
		int a1 = 2_000_000_000;
		int a2 = 2_000_000_050;

		float b1 = 2_000_000_000;
		float b2 = 2_000_000_050;
		
		double c1 = 2_000_000_000;
		double c2 = 2_000_000_050;
		
		System.out.println("int1:"+a1+", int2:"+a2);
		System.out.println("float1:"+b1+", float2:"+b2);
		System.out.printf("float: %.2f %.2f%n", b1, b2);
		System.out.println("double1:"+c1+", double2:"+c2);
		System.out.printf("double: %.2f %.2f%n", c1, c2);
		
		System.out.println(a1 == a2);
		System.out.println(b1 == b2);
		System.out.println(c1 == c2);
	}

}
