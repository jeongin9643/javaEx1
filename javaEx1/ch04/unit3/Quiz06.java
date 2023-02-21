package ch04.unit3;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, sum;
		
		System.out.print("두 정수를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sum=0;
		
		System.out.println("두 정수:" + a + "," + b);
		
		if(a<b) {
			while(a<=b) {
				sum+=a;
				a++;
			}
		}else if(a>b) {
			while(b<=a)
				sum+=b;
				b++;
		}
		System.out.println("입력한 두 정수까지의 합:" +sum);
		
		/*
		int a, b, c;
		int n, s;
		
		a= sc.nextInt();
		b= sc.nextInt();
		
		if(a>b) {
			c=a; a=b; b=c; //크기 작은 거랑 큰 거 위치를 바꿈
		}
		
		s = 0;
		n = a;
		while (n<=b) {
			s += n;
			n++;
		}
		System.out.printf("%d부터 %d까지 합 : %d%n", a, b, s);
		*/
		
		sc.close();
	}
	



}
