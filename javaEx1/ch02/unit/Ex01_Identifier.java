package ch02.unit;

public class Ex01_Identifier {
	public static void main(String[] args) {
		String name = "홍길동";
//		String #name = "김자바"; 
		/*
		컴파일 에러, 식별자는 기본적으로 자바유니코드레터(A-Z, a-z, 각국 언어, _, $)로 시작
		숫자를 포함할 수 있음
		예역어는 불가
		*/
//		String int 예역어도 불가. int가 예역어
//		String 3abc 숫자로 시작 불가
		
		int $age = 10; //$는 자바 유니코드레터
		int a = 20;
//		double a = 10.5; //a라는 동일명의 변수가 존재하기 때문에 불가
		
		String 주소 = "서울";
		
		System.out.println(name);
		System.out.println($age);
		System.out.println(a);
		System.out.println(주소);
	}

}
