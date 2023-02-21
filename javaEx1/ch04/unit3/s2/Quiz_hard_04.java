package ch04.unit3.s2;

public class Quiz_hard_04 {

	public static void main(String[] args) {
		int n, sum;
		
		sum=0;
		
		for(int i = 1; i<=10; i++) {
			n = i%2==0 ? -i : i;
			sum+=n;
			if(i==1) {
				System.out.print(n);
			} else {
				System.out.print(n==1? n: (n>0? "+"+n : n));
			}
		}
		System.out.print("=" + sum);
	}

}
