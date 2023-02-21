package ch04.unit3;

public class Ex004_while {

	public static void main(String[] args) {
		int s, n;
		
		/*
		s = 0;
		n = 0;
		while(n<100) {
			n++;
			s+=n;
		}
		System.out.println("결과 :"+s); //1~100까지 합
		*/
		
		/*
		s = 0;
		n = 0;
		while(n++<100) {
			s+=n;
		}
		System.out.println("결과 :"+s); //n=100에서 false나와서 n++인 101이 나옴 총합은 똑같이 5050
		*/
		
		s = 0;
		n = 0;
		while(++n<=100) { //100
			s+=n;
		}
		
		System.out.println(n); 
		System.out.println("결과 :"+s); //4950(1~99) n은 99까지 대입되어서 100으로 나옴
		
	}

}
