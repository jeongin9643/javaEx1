package ch05.unit1;

import java.util.Scanner;

public class Ex05_Array {

	public static void main(String[] args) {
		//5명의 이름과 점수를 입력 받아 이름과 각 점수의 편차(수-평균)출력하고 
		//마지막에 전체 총점 및 편균을 출력하는 프로그램 작성
		Scanner sc= new Scanner(System.in);
		
		String[] name= new String[5];
		int[] n=new int[5];
		double avg=0;
		double s;
		int total=0;
		
		for(int i=0;i<5;i++) {
			System.out.print("이름을 입력하세요");
			name[i]=sc.next();
			System.out.print("점수를 입력하세요");
			n[i]=sc.nextInt();
			total+=n[i];
		}
		avg=(double)total/n.length;
		
		System.out.println("이름\t점수\t편차");
		System.out.println("------\t-----\t-----");
		
		for(int i =0; i<name.length;i++) {
			s = n[i]-avg; //편차
			System.out.println(name[i]+"\t"+n[i]+"\t"+s);
		}
		System.out.println("----------------");
		System.out.println("총합: "+total+", 전체평균: "+avg);
		System.out.println("----------------");
		
		sc.close();
		
	}

}
