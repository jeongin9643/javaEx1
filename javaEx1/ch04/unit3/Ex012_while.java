package ch04.unit3;

public class Ex012_while {

	public static void main(String[] args) {
//1~100까지 수중 3 또는 5의 배수를 제외한 수를 한 줄에 5개씩 출력하고 마지막에 3의 배수의 합 출력

		int n =0;
		int cnt =0;

		while(n<100) {
			n++;
			if (!(n%3 ==0 || n%5 ==0)) {
				System.out.print(n + "\t");
				cnt++;
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}
		
	}

}
