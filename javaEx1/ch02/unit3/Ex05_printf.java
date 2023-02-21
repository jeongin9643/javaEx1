package ch02.unit3;

public class Ex05_printf {

	public static void main(String[] args) {
		System.out.println(123.236); //123.236
		System.out.printf("%f%n", 123.236); //123.236000 -> 기본적으로 소수점 이하 6자리 출력
		System.out.printf("%8.2f%n", 123.236);
		//전체 8자리 중 소수점 한 자리, 소수이하 2자리, 정수는 5자리 출력 
		//앞에 두 자리 공백
		System.out.printf("%8.2f%n", 123.234); //123.23
		System.out.printf("%3.2f%n", 123.234); // 123,24
		System.out.printf("%3.1f%n", 123.234); // 123,24
		//정수자리는 자릿수가 부족하면 무시하고 다 출력
		System.out.printf("%.2f%n", 123.234); //123.24
		//정수 무시하고 소수점 이하 2자리
		System.out.printf("%5.0f%n", 123.234); //123 
		System.out.printf("%5.0f%n", 123.534);  //124
		
		//123.45 => 1.2345 * 10의 2승
		//지수: n.nnnnnn+nn, n.nnnnnn-nn 형식으로 출력
		//1.234500+02
	System.out.printf("%e%n", 123.45); //1.234500e+02
	System.out.printf("%10.3e%n", 123.45); // 1.235e+02
	System.out.println();
	
	//2진수 : 0, 1
	//8진수 : 0~7
	//10진수 : 0~9
	//16진수 : 0~9, A, B, C, D, E, F
	System.out.printf("%x%n", 162); // a2
	System.out.printf("%X%n", 162); // A2
	//%x나 %X는 16진수
	System.out.printf("%#x%n", 162); //0xa2
	System.out.printf("%#X%n", 162); //0XA2
	System.out.printf("%o%n", 162);// 242
	System.out.printf("%#o%n", 162); //0242
	//%o는 8진수
	System.out.println();
	
	System.out.println(017); //15, 8진수 = 8진수 017은 15
	System.out.println(17); //17, 10진수
	System.out.println(0X17); //23, 16진수 16진수 17은 23
	System.out.println();
	
	
 	}

}
