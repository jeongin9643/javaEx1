package ch03.unit1;

public class Ex04_Arithmetic {

	public static void main(String[] args) {
		double a = 59.9999998;
		System.out.println(a);
		System.out.printf("%f%n",a);
		//%f는 반올림을 함
		System.out.printf("%.2f%n",a);
		
		int n = (int)(a*100);
		System.out.println(n);//5999
		System.out.println(n/100.);//5999
		
		//소수점 셋째 자리 버림
		System.out.println((int)(a*100)/100.);
	}

}
