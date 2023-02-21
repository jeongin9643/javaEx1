package ch03.unit1;

public class Ex01_Arithmetic {
//refactor -> rename (대소문자 변경은 x)
	public static void main(String[] args) {
		
		byte b1, b2, b3;
		b1=10;
		b2=20;
//		b3=b1+b2; //컴파일 오류. 자바에서는 정수에서 기본 연산은 int. 컴파일러가 자동으로 int + int로 형변환
		//int를 byte에 대입할 수 없기때문에 컴파일 오류 발생
		b3 = (byte)(b1+b2); //int를 byte로 형변환
		System.out.println(b3);
		
		b1 = 100;
		b2 = 120;
		b3 = (byte)(b1+b2);
		System.out.println(b3);
		
		char ch = 'A';
//		ch = ch+10; //오류
		ch = (char)(ch+10);
		System.out.println(ch);
		
		int n= 'A'+'B';
		System.out.println(n);
		n = 'A'+10;
		System.out.println(n);
		
		n=011 + 20; //011은 8진수, 10진수로 9
		System.out.println(n);
		
		n=0b101 + 20; //2진수
		System.out.println(n);
		
		
		double a;
		a = 1/2 + 3/2;
		System.out.println(a); //1.0
		
		a= 1/2.+3/2;
		System.out.println(a); //1.5
		
	}
	

}
