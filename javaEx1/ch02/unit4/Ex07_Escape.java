package ch02.unit4;

/*
 확장열 Escape
 */
public class Ex07_Escape {

	public static void main(String[] args) {
		System.out.println("a\tb\tc"); //tab 뛰기
		System.out.println("x\ny\nz"); //줄 바꿈
		System.out.println("1\\2"); // \를 문자로 출력하고 싶을 때는 두번 반복
		System.out.println('\101'); //8진수 101 => 65 => A
		System.out.println('\u0041'); //유니코드 16진수 => 65 => A
	}

}
