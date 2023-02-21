package ch04.unit3;

public class Ex002_while {

	public static void main(String[] args) {
		//1~10 짝수
		
		int n = 0;
		while(n<10) {
			n+=2;
			System.out.print(n+ " ");// 2 4 6 8 10
		}
		
		System.out.println("\n밖 :" + n);//10
	}

}
