package ch05.unit1;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		int sum, max, min;
		int[] num=new int[5];
		
		sum=0;
		
		System.out.print("점수를 입력하세요");
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
			System.out.printf("%d번째 점수: %d&n", i+1, num[i]);
			for(int j=0;j<i;j++) {
				if(num[i]>num[j]) {
					max=num[i];
				}else if(num[i]<num[j]) {
					min=num[i];
				}
				for(int x : num) {
					System.out.print(x+" ");
					System.out.printf("취득 점수: %d", sum-max-min);
			}
			sum+=num[i];
			
			System.out.println();
			*/
		
		int[] score=new int[5];
		int tot, max, min;
		
		tot=0;
		for(int i=0;i<score.length;i++) {
			do {
				System.out.println((i+1)+"번째 점수: ");
				score[i]=sc.nextInt();
			}while(score[i]<0 || score[i] > 10);
			
			tot+=score[i];
		}
		
		max=min=score[0];
		for(int i=1;i<score.length;i++) { //자기 자신과 비교할 필요 없으니 index1부터 비교
			if(max < score[i]) {
				max = score[i];
			}else if(min>score[i]) {
				min=score[i];
			}
		}
		
		int result= tot - max - min;
		System.out.print("점수 리스트: ");
		for(int n : score) {
			System.out.print(n +" ");
		}
		System.out.println("취득 점수: "+result);
		
		sc.close();
		
	}

}
