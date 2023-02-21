package ch04.unit5;

import java.util.Scanner;

public class Ex04_continue {

	public static void main(String[] args) {
		//5개의 홀수를 입력 받아 입력 받은 홀수의 합 구하기
		//단, 입력받은 수가 짝수이거나 0이하이면 다시 입력
		Scanner sc=new Scanner(System.in);

/*		증감식을 빼고 i++을 뒤로 넣는 경우		
		int n, sum;
		
		sum=0;
 
		System.out.print("홀수를 입력하세요");
		for(int i=1; i<=5;) {
			n=sc.nextInt();
			
			if(n%2==0 || n<=0) {
				System.out.println("입력 오류입니다");
				continue;
			}
			
			i++;
			sum+=n;
		}
		System.out.println("홀수의 합:" + sum);
	}
	
*/

/*	
		System.out.print("홀수를 입력하세요");
		for(int i=1; i<=5;i++) {
			n=sc.nextInt();
		
			if(n%2==0 || n<=0) {
				System.out.println("입력 오류입니다");
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("홀수의 합:" + sum);
	}
*/

/*while문으로 쓰는 경우		
 
		int i, n, s;
		s=0;
		i=0;
		while(i<5) {
			n=sc.nextInt();
			
			if(n<=0 || n%2==0) {
				continue;
			}
			i++;
			s+=n;
		}
		System.out.println("결과:"+s);

*/
		
//do while을 쓰는 경우		
		int n, sum;
		
		sum=0;
		
		System.out.print("홀수를 입력하세요");
		for(int i=1; i<=5; i++) {
			do {
				n=sc.nextInt();
			}while(n<=0 || n%2==0);
			
			sum+=n;
		}
		System.out.println("결과:"+sum);
		
		sc.close();
		
		
	}
}
