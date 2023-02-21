package ch03.unit1;

public class Ex11_IncDec {

	public static void main(String[] args) {
		//증감 연산자(++, --)
		// 더하거나 빼는 것. ++는 원래 a에 1씩 증가. --는 원래 a에 1씩 감소
		
		int a, b;
		
		a = 10;
		System.out.println("a 초기값: "+ a);
		a++; //a= a+1; 결과가 같은 것 수직은 다른 수식임.
		     // ++a 와 동일
		     //단독으로 사용하는 경우는 ++위치 영향 받지 않음 
		System.out.println("a++ 후 : "+ a);
		
		a = 10;
		b = ++a;
		// a=a+1, b=a; 와 결과가 동일
		// 계산이 먼저 일어나서 그 a 값이 b에 들어감
		System.out.println("b = ++a 연산 후:" + a + "," + b);
		
		a = 10;
		b= a++;
		//b=a, a= a+1 와 결과가 동일
		//b에 먼저 대입한 뒤에 a가 계산. 즉 b=10, a=11
		System.out.println("b = a++ 연산 후:" + a + "," + b);
		
		a = 10;
		b = --a;
		System.out.println("b = --a 연산 후:" + a + "," + b);
		
		a = 10;
		b = a--;
		System.out.println("b = a-- 연산 후:" + a + "," + b);
		
		double c = 3.5;
		c++;
		System.out.println(c); //4.5
		
		
	}

}
