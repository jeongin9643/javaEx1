package ch04.unit3;

public class Ex010_while {

	public static void main(String[] args) {
		// 1/2 + 2/3 + .....9/10
		
		int n;
		double s;
		
		n=0;
		s=0;
		
		while (n<9) {
			n++;
			s += (double)n/(n+1); // int + int = int라서 형변환 필요
			
			System.out.println(s);
			
		}
		System.out.println("결과 :" + s);
		
	}

}
