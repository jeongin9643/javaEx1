package ch04.unit3.s2;

public class Ex011_for {

	public static void main(String[] args) {
		//무한 루프
		
		/*
		int s = 0, n=0;
		for(;;) {
			n++;
			if(n>=10)
				break;
		}
		System.out.println(s);
		*/
		
		int s = 0;
		for(int n = 1;;n++) {
			s+=n;
			if(n>=10)
				break;
		}
		System.out.println(s);
		
	}

}
