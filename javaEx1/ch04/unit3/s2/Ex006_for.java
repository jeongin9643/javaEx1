package ch04.unit3.s2;

public class Ex006_for {

	public static void main(String[] args) {
		int s, n;
		s=0;
		n=1;
		for(; n<=10; ) {//초기식이나 증감식 필요 없음. ; 두 번만 들어가면 됨.
			s += n;
			n++;
		}
		System.out.print(s);
	}

}
