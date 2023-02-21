package ch04.unit3.s2;

public class Quiz_hard_03 {

	public static void main(String[] args) {
		
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				for(int c=1; c<10; c++) {
					if(a+b+c==25) {
						System.out.printf("%d + %d + %d = 25%n", a, b, c);
					}
				}
			}
				
		}
	}

}
