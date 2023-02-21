package ch04.unit3.s2;

public class Quiz_hard_06 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=4; i<=30;i++) {
			for(int p=1;p<i;p++) {
				if(i%p==0) {
					sum+=p;
				}
			}
			System.out.println(i+", "+sum);
			if(i==sum) {
				System.out.print(i);
			}
			
		}
	}

}
