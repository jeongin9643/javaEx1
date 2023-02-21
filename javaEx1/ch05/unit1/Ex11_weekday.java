package ch05.unit1;

import java.util.Scanner;

/*
 -년 월 일을 입력 받아 입력 받은 날짜의 요일 출력 프로그램 작성
 */
public class Ex11_weekday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		int[] days=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//1월 2월 3월 4월..
		String[] week=new String[] {"일", "월", "화", "수", "목", "금", "토"};
		int total;
		
		
		do {
			System.out.print("년도를 입력하세요");
			y=sc.nextInt();
		}while(y<100); //100년 전 달력은 안 구할래
		
		do {
			System.out.print("월을 입력하세요");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//2월 계산
		//2월 날짜 days[1] 구해주고 날짜를 입력 받아야 함.
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		//y년 m월 d일까지 날수 구하기
		do {
			System.out.print("일을 입력하세요");
			d=sc.nextInt();
		}while(d < 1||d> days[m-1]);
	
		//
		total = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		for(int i=0;i<m-1;i++) {
			total+=days[i];
		}
		
		//전 월까지 의 날짜 + d일까지
		total+=d;
		
		
		int w=total%7;
		
		System.out.println(y+"년"+m+"월"+d+"일은"+ week[w]+ "요일입니다.");
		
		

		
		sc.close();
	}

}
