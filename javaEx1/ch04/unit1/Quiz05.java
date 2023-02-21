package ch04.unit1;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, result;
		int k, m, e, avg;
		
		System.out.print("이름을 입력해주세요.");
		name = sc.next();
		
		System.out.println("과목 점수를 입력해주세요.");
		
		System.out.print("국어: ");
		k = sc.nextInt();
	
		System.out.print("수학: ");
		m = sc.nextInt();
		
		System.out.print("영어: ");
		e = sc.nextInt();
		
		avg = (k+m+e)/3;
		
		System.out.println("평균: "+avg);
				
		if(k>=40 && m>=40 && e>=40 && avg>=60) {
			result = "합격";
		} else if(avg>=60 /*&& (k<40 || m<40 || e<40)*/) { 
			//&& (k<40 || m<40 || e<40) 생략 가능 위에 조건을 충족하지 못해서 내려왔기 때문
			result = "과락";
		} else {
			result = "불합격";
		}
		
		System.out.println(name+"님은 [" + result + "]입니다.");
		
		sc.close();
	}

}
