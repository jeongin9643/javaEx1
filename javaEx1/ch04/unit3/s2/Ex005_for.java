package ch04.unit3.s2;

public class Ex005_for {

	public static void main(String[] args) {
		//while
		int s, n;
		
		n=0;//초기값
		s=0;
		while(n<10) {
			n++;
			s += n;
		}
		System.out.print("합:"+ s + ", n:" + n); //n 10
	
		//for
		int s2, n2;
		s2=0;
		for(n2 =1; n2 <= 10; n2++) { //초기값
			s2+=n2;
		}
		System.out.print("\n합:"+s2+", n2:"+ n2);//n 11
	}
	
	

}
