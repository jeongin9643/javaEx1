package ch04.unit3.s2;

public class Ex008_for {

	public static void main(String[] args) {
		/*
		int s, n;
		s=0;
		for(n=1; n<=10;n++) {
			s+=n;
		}
		System.out.println("결과:"+s); //55
		*/
		
	
		int s=0;
		for(int n = 0; n <=10; n++) {
			s+=n;
		}
		System.out.println("결과:"+s);//55
		
		
		/*
		int s, n;
		for(n=1, s=0; n<=10; s+=n, n++) { //초기값을 for문 안에서 주고 증감식을 두 개. 
			;
			System.out.println("결과:"+s);
		}
		*/
			
	}

}
