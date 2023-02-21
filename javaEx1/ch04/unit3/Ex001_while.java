package ch04.unit3;

public class Ex001_while {

	public static void main(String[] args) {
		int n = 0;
		
//		while(n<10) {
//			n++; //n 초기화 안 하면 컴파일 오류 남
//			System.out.println(n + " "); //0~9까지 10번 실행
//		}
//		System.out.println("\n밖:" + n +"\n");

//		while(n>10) {//n=0으로 초기화 되어 있기 때문에 조건이 false가 나와서 연산이 되지 않음. 밖은 0으로 출력
//			n++; //n 초기화 안 하면 컴파일 오류 남
//			System.out.println(n + " "); 
//		}
//		System.out.println("\n밖:" + n +"\n");
		
//		while(++n<10) { //1~9까지
//			System.out.println(n + " "); //9번 반복
//		}
//		System.out.println("\n밖:" + n +"\n"); //10 출력

//		while(n++<10) { //1~9까지
//			System.out.println(n + " "); //10번 반복
//		}
//		System.out.println("\n밖:" + n +"\n"); //11 출력
		
		while(n++<10) { 
			n++; //n++ 반복으로 실행 횟수가 10번->5번 됨
			System.out.println(n + " "); //5번 출력 2, 4, 6, 8, 10
		}
		System.out.println("\n밖:" + n +"\n"); // 11출력
		
		
		
	}

}
