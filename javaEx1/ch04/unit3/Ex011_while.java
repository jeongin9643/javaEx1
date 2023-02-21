package ch04.unit3;

public class Ex011_while {

	public static void main(String[] args) {
		//1~100까지 수중 3의 배수를 한 줄에 5개씩 출력하고 마지막에 3의 배수의 합 출력
		
//		int n =0;
//		
//		while(n<100) {
//			n+=3;
//			System.out.println(n+" ");

		int n =3;
		int cnt =0;
		int s =0;

		while(n<100) {
			s+=n;
			System.out.print(n+"\t");
			cnt++;
			if(cnt%5==0) {
				System.out.println();//라인 넘김
			}
			n+=3;
		}
		
		System.out.println("\n결과:"+s);
	}

}
