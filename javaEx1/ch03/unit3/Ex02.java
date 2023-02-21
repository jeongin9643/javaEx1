package ch03.unit3;

public class Ex02 {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = 5;
		
		//방법1
		int tmp;
		
		tmp = b;
		a = tmp;
		b = a;
		System.out.println(a + "," + b);
		
		a = 10;
		b = 5;
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a + "," + b);
		
	}

}
