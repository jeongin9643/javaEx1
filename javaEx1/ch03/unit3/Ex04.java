package ch03.unit3;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		
		a = 128;
		b = a << 3; // a * 2의 3승 MSB에 0으로 채워짐
		System.out.printf("%d << 3 = %d%n",a , b);

		a = 128;
		b = a >> 3; // a / 2의 3승, MSB에 부호로 채워짐
		System.out.printf("%d >> 3 = %d%n",a , b);
	
		a = -128;
		b = a >> 3; // a / 2의 3승 MSB에 부호로 채워짐
		System.out.printf("%d >> 3 = %d%n",a , b); //음수 출력
		
		a = 128;
		b = a >>> 3; // a / 2의 3승 MSB에 0으로 채워짐
		System.out.printf("%d >> 3 = %d%n",a , b);
		
		a = -128;
		b = a >>> 3; // a / 2의 3승 MSB에 0으로 채워짐
		System.out.printf("%d >> 3 = %d%n",a , b); //양수 출력
		
		
		
	}

}
