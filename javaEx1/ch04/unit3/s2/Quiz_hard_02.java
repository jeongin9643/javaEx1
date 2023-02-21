package ch04.unit3.s2;

public class Quiz_hard_02 {

	public static void main(String[] args) {
		
		for(int i=0; i<=10;i++) {
			for(int j=0; j<=10;j++) {
				if(3*i+6*j==27) {
					System.out.printf("[%d, %d]%n", i, j);
				}
			}
		}
	}

}
