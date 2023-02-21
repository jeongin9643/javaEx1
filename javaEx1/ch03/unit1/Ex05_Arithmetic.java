package ch03.unit1;

public class Ex05_Arithmetic {

	public static void main(String[] args) {
		char a ='0', b;
//		b=a + '1';//변수 + 리터널 컴파일 오류.
		b=(char)(a + '1'); //a=98 계산한 값이 char에 들어감
		System.out.println(b); //a 출력
		
		char ch;
		ch = '0'+'1'; //리터널 + 리터널 = 형변환 일어나지 않음.
		System.out.println(ch);
		
		byte x;
		x = 10 + 5;
		System.out.println(x); //리터널 + 리터널 이라 형변환 일어나지 않음. 
	}

}
