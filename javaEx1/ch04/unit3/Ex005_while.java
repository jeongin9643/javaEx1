package ch04.unit3;

public class Ex005_while {

	public static void main(String[] args) {
		int s, n;
		
		//1~100 짝수합
		
		s=0;
		n=0;
		
		while(n<100) {
			n += 2;
			s += n;
		}
		System.out.println("결과: " + s);
	
		
		
		//홀수 합 구하기 
		s=0;
		n=1;
		while(n<100) {
			s += n;
			n += 2;
		}
		System.out.println("결과:"+s);
	}
	
	

}
