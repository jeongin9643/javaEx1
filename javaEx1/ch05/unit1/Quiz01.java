package ch05.unit1;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y;
		String[] tti=new String[]{"원숭이", "닭", "개", "돼지","쥐", "소", "범", "토끼", "용", "뱀", "말", "양"};
		//원숭이가 12로 나누면 나머지가 0이기 때문에 index0번으로 줘야 함
		
		do {
			System.out.print("년도를 입력하세요");
			y=sc.nextInt();
		}while(y<1900);
		
		System.out.println(y+"년도는 "+tti[y%12]+"띠의 해입니다.");
	
		sc.close();
	}

}
