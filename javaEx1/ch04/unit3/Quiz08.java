package ch04.unit3;

public class Quiz08 {

	public static void main(String[] args) {
		int i, sum, sum2;
		
		i = 0;
		sum=1;
		sum2 = 0 ;
		
		while(i<20) {
			sum+=i;
			sum2+=sum;
			i++;
		}
		System.out.println(sum2);
	}

}
/*
 * 1 +1  +2  +3  +4
 *
 * 
 * 
 */

