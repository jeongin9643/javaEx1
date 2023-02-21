package ch04.unit3;

public class Quiz02 {
    //1-2+3-4+...-10값을 출력하라
	public static void main(String[] args) {
		int n, s;
		
		n=0;
		s=1;
		
		while (n<=10) {
			s+=n-(n+1);
			n+=2;
		}
		System.out.println("결과:"+s);
	}

}
