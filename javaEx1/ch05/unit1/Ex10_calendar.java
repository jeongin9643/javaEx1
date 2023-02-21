package ch05.unit1;

import java.util.Scanner;

/*
 -1년 1월 1일: 월요일
 -년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면
  윤년으로 2월이 29일(366일)이고 그렇지 않으면 2월이 28일(365일)이다.
  
 -2023년 8월 달력
  1) 8월의 마지막 일자=> 31일/ 1.1~8월 날짜
  2) 1.1.1~2023.8.1의 전체 날수(일수) 계산
     전년도*356 + (366일이었던 년도 몇번인지 구해서 1일씩 더해줘야 함)
     2022*356 + 2022/4 -2022/100 + 2022/400 + 2023년 1월, 2월, 3월... 
  3) 전체 일수%7 =>0이면 8월 1일은 일요일
                 1이면 8월 1일은 월요일
                 2이면 8월 1일은 화요일
  
 */
public class Ex10_calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m;
		int[] days=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//1월 2월 3월 4월..
		int total;
		
		do {
			System.out.print("년도를 입력하세요");
			y=sc.nextInt();
		}while(y<100); //100년 전 달력은 안 구할래
		
		do {
			System.out.print("월을 입력하세요");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//y년도 2월의 마지막 날짜 구하기
		//윤년이면 29일로 입력
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
			
		//1년 1월 1일에서 y-1년 12월 까지의 날짜 수 구하기
		//2023년 8월이라면 2022년 12월까지의 날짜를 구한 뒤에 2023년 8월까지의 날짜를 더해줘야 함
		//1.1.1~2022.12.31 + 2023.1.1~2023.8.23

		//1.1.1~y-1.12.31
		total = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		//366일인 년도를 계산해서 1일씩 늘어난 일수를 계산해줌.
		//(y-1)/4은 더하고 (y-1)/100 은 빼고 (y-1)/400은 더함
		
		//1월 m-1 날수 더하기
		for(int i=0;i<m-1;i++) {
			total+=days[i];
			//1월=days[0], 1월까지의 날짜 total+=days[0] i는 0를 넘어가면 안됨 그래서 i<m-1
			//2월=days[1], 2월까지의 날짜 total=days[0]+days[1] i는 1를 넘어가면 안됨 그래서 i<m-1
		}
		
		//1일을 더한다.
		total++;
		
		//y년 m월 1일의 요일 구하기;
		int w=total%7; //0이면 일요일
	
		System.out.printf("\n\t%d년 %d월\n", y, m);
		System.out.println("    일    월    화    수     목     금      토");
		System.out.println("==========================================");
		
		//1일 앞에 공백
		for(int i =0;i<w;i++) {
			System.out.print("      ");
		}
		
		//1~해달월의 마지막 일자까지 출력
		for(int i =1; i<=days[m-1];i++) {
			System.out.printf("%6d", i);
			
			if(++w % 7==0) {
				System.out.println();
			}
		}
		
		if(w%7 != 0) {
			System.out.println();
		}
		
		sc.close();
	}

}
