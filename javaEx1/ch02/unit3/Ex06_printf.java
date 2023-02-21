package ch02.unit3;

public class Ex06_printf {

	public static void main(String[] args) {
		String s = "Seoul Korea";
		System.out.printf("%s%n", s);
		//%s문자열 출력
		System.out.printf("%S%n", s); //전부 대문자로 출력
		System.out.printf("%.5s%n", s); //s의 문자열 중에 5글자
		System.out.println();
		
		int a=10, b=5;
		System.out.printf("%d %d %d %d %d%n", a, b, a, a, b); //중복
		System.out.printf("%1$d %2$d %1$d %1$d %2$d%n", a, b); //중복을 간단하게
		//%1$ 첫번째 변수, %2# 두번째 변수
	}

}
