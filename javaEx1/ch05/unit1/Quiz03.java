package ch05.unit1;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//로또 짜기
		//1~45의 숫자 중 서로 다른 6개의 수를 맞히는 게임.
		//1~5장까지 구매. 장수만큼 로또 출력
		Scanner sc=new Scanner(System.in);

/*		
		int cnt, num;
		int[] rt=new int[6];
		
		do {
			System.out.print("구매 장수[1~5]를 입력하세요");
			cnt=sc.nextInt();
		}while(cnt<1 || cnt>5);
		
		
		for(int i=0;i<=cnt-1;i++) {
			for(int j=0; j<rt.length;j++) {
			num=(int)(Math.random()*45)+1;
			rt[j]=num;
			
			
			}
			System.out.print(i+1+"번째 로또: ");
			
			for(int x:rt)
			System.out.print(x+" ");
			
			System.out.println();
		}
		System.out.println();

*/		
		
		
		int[] lotto=new int[6];
		int count;

		
		
		do {
			System.out.print("구매 장수[1~5]를 입력하세요");
			count=sc.nextInt();
		}while(count<1 || count>5);
		
		
		for(int k=0;k<=count-1;k++) {
			
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}	
		
		Arrays.sort(lotto);//정렬
		
		System.out.print("\n"+(k+1)+"번째: ");
		for(int i=0;i<lotto.length;i++)
			System.out.printf("%3d", lotto[i]);
		}
		System.out.println();
	
		sc.close();
	}

}

