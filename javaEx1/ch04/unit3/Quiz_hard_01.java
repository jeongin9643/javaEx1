package ch04.unit3;

public class Quiz_hard_01 {

	public static void main(String[] args) {
		int n, s;
		
		n=0;
		s=1;
		
		while (s>0) {
			s+=n-(n+1);
			n+=2;
			if(s>100) {
				System.out.println("n:"+ n + "s"+ s);
			}
		}
		System.out.println("결과:"+s);
		
		/*
		n = s = 0;
		while(s < 100) { //s>=100이 되는 순간 while 문 출력
			n++;
			s = n%2 == 1 ? s + n : s - n;
		}
		System.out.println(n + "," + s);
	    */
	}
	

}
