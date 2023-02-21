package ch04.unit3.s2;

public class Ex012_for {

	public static void main(String[] args) {
		// for 속에 for문/다중for
		
		for(int i=1;i<=3;i++) {
			System.out.println("i:"+i); //1~3까지 세 번 반복. 
			
			for(int j=1; j<=2; j++) { //2번 반복. 즉 (첫번째for문)3*(두번째for문)2=6번 반복
				System.out.println("i:"+ i + " j:"+j);
				// i=1, j=1
				// i=2, j=1 j=2
				// i=3, j=1 j=2 j=3
			}
			
			System.out.println("----------"); //첫번째 for문 3번 반복
		}

	}

}
