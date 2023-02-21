package ch04.unit3;

public class Ex13_while {

	public static void main(String[] args) {
		//1 + (1+2) +(1+2+3)...(1+2+..10)
		
		int i, sum, sum2;
		
		i = 0;
		sum =0;
		sum2 =0;
		
		while (i<10) {
			i++;
			sum+=i;
			sum2+=sum;
		}
		
		System.out.println(sum2);
	
	}

}
