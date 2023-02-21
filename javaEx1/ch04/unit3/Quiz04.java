package ch04.unit3;

public class Quiz04 {

	public static void main(String[] args) {
		int i, cnt, sum;
		
		i = 0;
		sum = 0;
		cnt = 0;
		
		while(i<100) {
			i++;
			if(i%3 == 0 || i%5 ==0) {
				sum +=i;
				cnt++;
			}
		}
		System.out.printf("합계 : %d, 평균 : %d%n", sum, sum/cnt);
	}

}
