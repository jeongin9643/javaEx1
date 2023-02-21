package ch03.unit1;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km;
		int kh;
		
		System.out.print("주행 거리(Km)를 입력하세요.");
		km=sc.nextInt();
		System.out.print("시속(km/h)을 입력하세요.");
		kh=sc.nextInt();
		
		int h;
		int m;
		double s;
		double t;
		
		t =(double)km/kh;
		h = (int) t;
		m = (int)(t*60%60); 
		//남은 n.nn시간을 분으로 고쳐야 함
		//그 남은 시간을 분으로 고친 다음에 (t*60) 그걸 다시 시간으로 남은 나머지(%60)으로 구함
		// 예) t= 3.5 3.5*60=210분 210분%60 = 남은 분
		s = (t*3600)%60; 
		//전체 시간을 초로 치환(*3600) 한다음에 60분으로 나눔
		s =(int)(s*1000)/1000.;//소수점 셋째 자리에서 버림
		
		
		System.out.printf(" 총 주행 시간은 %d 시간, %d 분, %.2f초 입니다%n", h, m , s);
		//double이나 float는 %f로 실행!
		// %f = 그대로 출력  %.2f = 세번째에서 반올림해서 두번째까지 출력
		
		sc.close();
		
	}

}
