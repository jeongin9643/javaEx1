package ch02.unit4;
/*
 정수 리터널
 */
public class Ex02_Literal {

	public static void main(String[] args) {
		int a = 0b101;//숫자앞 0b 2진수,5
		System.out.println(a);
		
		a = 0101;//8진수
		System.out.println(a); //65 출력
		
		 a= 101; //10진수. 101 그대로 출력
		 System.out.println(a);
		 
		 a = 0X101; //16진수. 숫자 앞 0x는 16진수
		 System.out.println(a);
		 
//		 a = AB; //컴파일 오류
		 a = 0xAB; //16진수.
		 System.out.println(a); //171
		 
		 a= 1_0_1; //101
		 System.out.println(a); //숫자와 숫자 사이에 언더바 쓸 수 있지만 삭제 됨.
		 
		 long b = 10; // int 리터널을 long에 대입
			System.out.println(b);
			
			b = 10L; // long 리터널, 10L, 10l 모두 가능
			System.out.println(b);
		 
	}

}
