package ch03.unit2;

public class Ex01_Relational {

	public static void main(String[] args) {
		int a = 10, b =5;
		boolean c;
		
		c = a>b; //관계 연산자의 결과는 true or false로 출력. 논리형.
		System.out.printf("%d> %d> %d>%n", a, b, c );
		System.out.printf("%d>= %d> : %d%n", a, b, a>=b );
		System.out.printf("%d< %d : %d%n", a, b, a<b );
		System.out.printf("%d<= %d : %d%n", a, b, a>=b );
		System.out.printf("%d == %d : %d%n", a, b, a==b );
		System.out.printf("%d != %d : %d%n", a, b, a!=b );
	}

}
