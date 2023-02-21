package ch02.unit3;

public class Ex04_printf {
	public static void main(String[] args) {
		System.out.printf("%d%n", 12345);
		System.out.printf("%d%n", -12345);
		System.out.printf("%,d%n", 12345);
		System.out.printf("%,d%n", 123456789);
		
		//12345 세 자리마다 , 를 찍고 싶음 => %,d

		System.out.printf("%d%n", 220000000);
		//22000000괜찮. 2200000000은 오류. 정수의 범위를 벗어났기 때문 21억보다 조금 더 큰값까지만 가능

		System.out.printf(",%d%n", 2200000000L); //long형 리터널
		System.out.println();
		
		System.out.printf("%d%n", 123);
		System.out.printf("%10d%n", 123); //10자리로 출력. 앞에 7자리 공백
		System.out.printf("%-10d%n", 123);//10자리로 출력. 뒤에 7자리 공백
		System.out.printf("%010d%n", 123); //앞에 0으로 채우로 10자리로 출력
		System.out.printf("%2d%n", 1234); //정수는 자릿수가 부족하면 자릿수 무시
		System.out.println();
		
		System.out.printf("%d%n", 123); //123
		System.out.printf("%d%n", -123); //-123
		System.out.printf("%+d%n", 123); //+123
		System.out.printf("%+d%n", -123); //-123
		System.out.printf("%(d%n", 123); // 123
		System.out.printf("%(d%n", -123); //(123)
		System.out.println();
		
		System.out.printf("%c%n", 'A'); //A
		System.out.printf("%c%n", 'a'); //a
		//%c는 한 문자 출력
		System.out.printf("%C%n", 'A'); //A
		System.out.printf("%C%n", 'a'); //A
		
		System.out.printf("%c%n", 65); //A=65
		System.out.printf("%c%n", 97); //a=97
//		System.out.printf("%c%n", 'a' );
		//문자는 %C로 출력 불가, 숫자는 %C로 출력 가능. 
	}

}
