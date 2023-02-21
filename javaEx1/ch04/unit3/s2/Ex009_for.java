package ch04.unit3.s2;

public class Ex009_for {

	public static void main(String[] args) {
		//1~100까지 수 중 3의 배수를 한 줄에 10개씩 출력하고 
		//마지막에 3의 배수의 평균을 출력
		
		/*
		int i, sum=0, cnt=0;
		
		for(i=1; i<100; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
				cnt++;
				sum+=i;
				if(cnt%10==0) {
					System.out.println();
				}
			}
			
		}
		System.out.println("\n평균:"+sum/cnt);
		*/
		
		
		 int cnt=0, s=0;
		 for(int n = 3; n<=100; n+=3) {
			 System.out.print(n + " ");
			 cnt++;
			 s+=n;
			 if(cnt%10==0) {
				 System.out.println();
			 }
		 }
		 
		 System.out.println("\n평균" + s/cnt);
	}

}
