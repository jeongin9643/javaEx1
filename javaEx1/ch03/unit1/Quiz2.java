package ch03.unit1;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.print("초를 입력하세요");
		i=sc.nextInt();
		
		int h;
		int m;
		int s;
		
		h = i/3600;
//		h = (i/60)/60;
		m = (i/60)%60;
		//t/60=>분 전체 초를 분으로 변경. 그 분을 60분(1시간)으로 나눈 것의 나머지
		s = i%60;
		
		System.out.println("입력하신"+i+"초는"+h+"시간"+m+"분"+s+"초 입니다.");
		System.out.printf("%d 초는 %d시간 %d분 %d초 입니다.\n", i, h, m, s);
		
		sc.close();
	}

}
