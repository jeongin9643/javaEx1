package ch04.unit3;

public class Quiz05 {

	public static void main(String[] args) {
		int i, sum;
		
		i=0;
		sum=0;
		
		while(sum<100) {
			i++;
			sum += i;
		}
		System.out.printf("최소의 i: %d%n합 : %d%n", i, sum);
	}

}
