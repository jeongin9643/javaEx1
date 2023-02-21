package ch03.unit2;

public class Ex02_Logical {
/*
 논리 연산자
 && and 
 || or
 ! not 
 */
	public static void main(String[] args) {
		boolean a = true, b= false;
		
		System.out.printf("%b && %b = %b%n", a, b, a&&b );
		System.out.printf("%b || %b = %b%n", a, b, a||b );
		System.out.printf("! %b%n", !a);
	}

}
