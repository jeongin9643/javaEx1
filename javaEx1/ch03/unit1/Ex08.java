package ch03.unit1;

public class Ex08 {

	public static void main(String[] args) {
		int a;
		double b;
		
		a=3456;
		a= a/10*10;
		System.out.println(a); //3450 출력 
		
		a= (a+5)/10*10;//반올림하여 출력
		System.out.println(a);

		
		b=126.4563;
		System.out.printf("%.2f%n", b); //소수점 셋째 자리에서 반올림 하여 두자리까지
		
		b= (int)(b*100)/100.0;
		System.out.printf("%.2f%n", b); //반올림 안 하고 두자리까지만 출력
	}

}
