package ch04.unit3;

public class Ex003_while {

	public static void main(String[] args) {
		//A-Z
//		char ch = 'A';
		
//		while(ch<='Z') {
//			System.out.print(ch+" "); //A출력 인됨
//			ch++;

//		char ch = 'A'-1; //이렇게 하면 A부터 출력
//		while(ch++<='Z') {
//			System.out.print(ch+" ");
//			ch++;

//		char ch = 64;
//		while(ch++<'Z') {
//			System.out.print(ch+" ");
//			ch++;
		
		//한 줄에 7개씩 영문자를 출력
//		char ch = 'A';
//		int n = 0;
//		while(ch<='Z') {
//			System.out.print(ch + " ");
//			n++;
//			if(n%7 == 0) {
//				System.out.println();
//			}
//			ch++;
//		}
//		System.out.println();
		
		char ch = 'A';
		int n = 0;
		while(ch<='Z') {
			n++;
			System.out.print(ch + (n%7==0?"\n": " "));
			ch++;
		}
		System.out.println();
	}

}
