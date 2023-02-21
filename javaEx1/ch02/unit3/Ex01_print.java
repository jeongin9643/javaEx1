package ch02.unit3;
/*
 System.out.print(인수)
=인수의 내용을 출력 장치를 통해 출력하며, 라인을 넘기지 않는다. 
 */
public class Ex01_print {

	public static void main(String[] args) {
//		System.out.print(); //컴파일 오류. 괄호안에 인수가 필요
		System.out.print("HTML5, ");
		System.out.print("CSS3, ");
		System.out.print("javascript");
		//java와 javascript의 사이를 벌리고 싶을 때 
//방법1		System.out.print("\n");
		System.out.print("Java");
		
		System.out.print("Java\n\nJsp\nServlet");
		System.out.print("\nSpring\n\n"); //\n\n은 한줄의 공백이 생김
		
		System.out.print("국어\t");// \t: 탭 간격
		System.out.print("영어\t");
		System.out.print("수학\n");

		System.out.print(80 + "\t");
		System.out.print(90 + "\t");
		System.out.print(85 + "\n");
		
//방법2		System.out.print("javascript\njava");
		//한줄로 출력. 
	}

}
