package ch02.unit4;
/*
 char 는 2byte 부호없는 정수형, 양수만 가능
 * */
class Ex06_DataType {

	public static void main(String[] args) {
		char c1 ='A', c2;
		c2='\u0041'; //유니 코드 10진수로 65 즉A
		System.out.println(c1 + "," + c2);
		
//		c1 =''; 컴파일 오류. 빈 문자열을 받아들이지 않음
//		c1 = 'AB'; 문자는 한 글자로 구성. 두 글자는 안됨
//		c1 = "A"; 컴파일 오류. 문자열은 char은 대입 불가 "" 은 문자연
		
		c1 = '대';
		System.out.println(c1);
		
		int n = c1; //char<int 적은 자료형은 큰 자료형에 대입 가능
		System.out.println(n); //'대'를 int 형으로 대입
		n = '한';
		System.out.println(n);
		
		c1= 54620;
		System.out.println(c1); //한
		
		n=0;
		System.out.println(n);
		
		n='0';
		System.out.println(n); //문자열 0
		
		double x = 'K';
		System.out.println(x); //75.0
	}

}
