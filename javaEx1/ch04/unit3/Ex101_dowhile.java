package ch04.unit3;

public class Ex101_dowhile {

	public static void main(String[] args) {
		//dowhile: 조건을 나중에 비교
		
		//1~10까지 합 구하기
		/*
		int n,s;
		n=0;
		s=0;
		while(n<10) {
			n++;
			s+=n;
		}
		System.out.println(s);
		*/
		
		int n,s;
		n=0;
		s=0;
		do {
			n++;
			s+=n;
		} while (n<10); //조건이 밑으로 내려옴
		System.out.println(s);
		
	}

}
