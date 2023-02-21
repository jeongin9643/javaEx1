package ch04.unit3.s2;

public class Quiz_hard_07 {

	public static void main(String[] args) {
		//구구단 출력하기 
		
		
		/* for문 두 번 쓸 경우
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%d * %d = %d%n", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =1; i<=9; i++) {
			for(int j=6; j<=9; j++) {
				System.out.printf("%d * %d = %d%n", j, i, j*i);
			}
			System.out.println();	
		}
        */      
 
		
//for문장 세 번 쓸 경우 
			
		int dan;
		
		for(int k =0; k<2; k++) { //k=0, 1
			for(int i=1; i<=9; i++) {
				for(int j=2; j<=5; j++) {
					dan=k * 4 + j; // k=0일 때는 dan=j k=1 dan=6 7 8 9 
					System.out.printf("%d * %d = %d\t", dan, i, dan*i);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
