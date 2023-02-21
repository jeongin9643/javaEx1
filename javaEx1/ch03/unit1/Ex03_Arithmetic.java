package ch03.unit1;

public class Ex03_Arithmetic {

	public static void main(String[] args) {
		int a =3, b=2;
		double c;
		
		c=a/b + a/b; //정수 + 정수. 후에 계산 결과를 실수(double)에 대입
		System.out.println(c); // 1+1=2=>2.0
		
		c=(double)a/b + a/b; 
		//형변환. 1.5 + 1 = 2.5
		System.out.println(c);
		
		c=(double)(a/b) + a/b;
		//(a/b)로 이게 먼저 연산. a/b인 1을 double로 넣은 거라 1.0이 됨. 1.0+1=2
		System.out.println(c);
		
		c=(double)a/b + (double)a/b;
		//1.5+1.5=3.0
		System.out.println(c);
		
		c=3.7 % 1.3;
		//자바는 실수에서 %연산 가능
		//몫:2 나머지:1.1
		System.out.println(c);
		
		c='A'+10;
		//A는 65+10 75.0
		System.out.println(c);
		
		c = 'X'/'A';
		//X=88. 88/65 몫:1
		System.out.println(c);
		
		c = (double)'X'/'A';
		//X=88. 88.0/65 몫:1.353846153846154
		System.out.println(c);
	}

}
