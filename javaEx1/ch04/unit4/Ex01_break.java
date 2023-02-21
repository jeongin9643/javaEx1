package ch04.unit4;

import java.util.Scanner;

//while, for, do while, switch 문장에서 사용 가능
public class Ex01_break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int n, s;
		int start, step;
		
		
		while(true) { //무한루프
			do {
				System.out.print("1.합 2.짝수합 3. 홀수합 4. 종료 =>");
				ch=sc.nextInt();
			} while(ch<1||ch>4);
			
			if(ch==4) { //4. 종료. while문을 빠져나감
				break;
			}
			
			System.out.println("수 ?");
			n = sc.nextInt();
			
			if(ch==1) {//모든 수의 합
				start = 1; step = 1;
			}else if(ch==2) { //짝수 합
				start=2; step=2;
			}else {//홀수합
				start=1; step=2;
			}
			
			s=0;
			for(int i =  start; i<=n; i+=step) {
				s+=i;
			}//1~n까지의 합. 
			System.out.println("결과:"+s+"\n");
		}
		
		sc.close();
				
	}

}
