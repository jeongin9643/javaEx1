package ch04.unit3;

public class Ex015_while {

	public static void main(String[] args) {
		int dan, n;
		
		dan = 2;
//		n=0;//n 초기화를 밖에서 하면 3단부터 출력되지 않음. 
		while(dan <= 9) {
			System.out.println("**"+ dan + "단 **");
			n=0; //n 다시 초기화해줘야 함
			while(n<9) { //while 안에 while
				n++;
				System.out.printf("%d * %d = %d%n", dan, n, dan*n);
			} //여기서 n이 2단 한 번 돌고 9인 상태로 출력. 
			System.out.println();
			
			dan++;
		}
	}

}
