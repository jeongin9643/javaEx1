package ch02.unit3;
/*
System.out.printf("출력서식", 풀력값,출력값)
:출력 서식에 따라 값을 출력, 출력 후 라인을 넘기지 않음
:System.out.format("출력서식", 출력값, 출력값)와 동일
*/

public class Ex03_printf {

	public static void main(String[] args) {
		int a, b, c;
		a = 13;
		b = 4;
		
		c= a + b;
		
		System.out.println(a + "+" + b + "=" + c);
//		System.out.printf("%d + %d = %d%n", a, b); 
		// Runtime 에러. 컴파일은 괜낳은데 실행하면 에러 밑에 있는 코드도 실행 안됨
		System.out.printf("%d + %d = %d%n", a, b, c);
		System.out.format("%d + %d = %d%n", a, b, c);
		
		// % 형식지정 제어문자
		// %d 정수를 출력
		System.out.println();
		
		System.out.printf("%d+%d=%d\t", a, b, a+b);
		System.out.printf("%d-%d=%d%n", a, b, a-b);
		//합과 차는 한 줄에 나오지만 \t 를 통해서 탭 띄어쓰기가 됨
		
		System.out.printf("%d*%d=%d\t", a, b, a*b);
		System.out.printf("%d/%d=%d%n", a, b, a/b);
		System.out.printf("%d %% %d=%d%n", a, b, a%b);// 나머지
		// %% : %가 형식 문자가 아닌 문자 %를 출력하는 경우 사용
	}

}
