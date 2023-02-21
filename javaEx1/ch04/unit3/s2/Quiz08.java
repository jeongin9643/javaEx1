package ch04.unit3.s2;

public class Quiz08 {

	public static void main(String[] args) {
		//주사위를 던저 두 주사위의 눈의 합이 9가 되는 경우
		
		for(int i = 1; i<=6; i++) {
			for(int j =1; j<=6; j++) {
				if(i+j==9) {
					System.out.printf("[%d, %d%n]", i, j);
				}
			}
		}
	}
}
