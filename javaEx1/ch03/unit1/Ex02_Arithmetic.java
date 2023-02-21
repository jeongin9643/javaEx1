package ch03.unit1;

public class Ex02_Arithmetic {

	public static void main(String[] args) {
		int 
		a;
		a = 3/2 + 1/2 + 1/2; //1.5 근데 int는 정수값. 즉 1+0+0
		System.out.println(a); //1.0
		
		double b;
		b=3/2 + 1/2 + 1/2;//1+0+0 (정수 + 정수 + 정수)
		System.out.println(b); //1.0

		//정수 (연산자) 실수 =실수
		b=3/2. + 1/2 + 1/2.;// 1.5 + 0 + 0.5 (실수 + 정수 + 실수)
		System.out.println(b); //2.0
	}

}
