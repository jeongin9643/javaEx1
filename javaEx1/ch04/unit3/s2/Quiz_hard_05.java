package ch04.unit3.s2;

public class Quiz_hard_05 {

	public static void main(String[] args) {
		
		int cnt, cnt2=0;
		
		
		for(int i=2; i<=100; i++) {
			cnt=0;
			for(int n=2; n<=i; n++) {
				if(i%n==0) {
					cnt++;
			  }
				
			}
			
			if(cnt==1) {
				System.out.print(i+" ");
				cnt2++;
			}
			if(cnt2%10==0) {
				System.out.println();
			}
		}
		System.out.println("\n소수의 개수: "+ cnt2);
		
	}

}
