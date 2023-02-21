package ch04.unit3.s2;

public class Ex004_for {

	public static void main(String[] args) {
		int a;
		
		/*
		for(a=10;a<=1;a--) {
			System.out.println(a+ " "); //실행되지 않음. 조건식을 만족하지 못했기 때문에.
		}
		System.out.println("\n밖:"+a);//10
		*/
		
		for(a=10;a>=1;a--) {
			System.out.println(a+ " "); //10 9 8 7 6 5 4 3 2 1
		}
		System.out.println("\n밖:"+a);//0
		
	}

}
