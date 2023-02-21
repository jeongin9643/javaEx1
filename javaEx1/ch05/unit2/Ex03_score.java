package ch05.unit2;

import java.util.Scanner;

/*
 -인원수(1 이상)을 입력 받아 입력 받은 인원수의 
  이름, 국어, 영어, 수학을 입력받아 총점과 평균, 석차를 출력하는 프로그램 작성
  
 -석차
  총점으로 계산
  
  점수  초기석차  비교석차
  80     1      1+1(90과 비교)+1(86과비교)+1(100점과비교)=4등 
  90     1      1+1(100과 비교) 
  86     1      1+1(90과 86 비교에서)
  100    1
  80     1      1+1+1+1 4등
 */
public class Ex03_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

/*		
		String[] name; //배열 선언
		int[][] score; //2차원 배열. 
		int[] tot;
		int[] rank;
		int count;
		
		String[] subject = {"국어","영어", "수학"};
		
		//1 이상의 인원수를 입력 받는다
		do {
			System.out.print("인원수를 입력하세요");
			count = sc.nextInt();
		}while(count<1);
		
		//입력 받은 인인원수만큼 배열의 메모리를 할당
		name=new String[count];
		score=new int[count][3]; //열은 과목 수 
		tot=new int[count];
		rank=new int[count];
		
		//인원수만틈 이름, 국어, 영어, 수학을 입력 받고 개인의 총합을 계산
		for(int i =0; i<count;i++) {
			System.out.print((i+1)+"번째 이름");
			name[i]=sc.next();
			
			//각 개인의 국어, 영어, 수학 점수를 입력 받는다
			for(int j=0;j<score[i].length;j++) { //score[i].length=3
				System.out.print("    "+subject[j]+"? ");
				score[i][j]=sc.nextInt();
				
				//총점 계산
				tot[i]+=score[i][j];
				//tot[0]=score[0][0]+score[0][1]+score[0][2]. 즉 한 행의 과목 점수의 합
			}
		}

		
		//석차 계산
		
		//우선 모든 석차를 1로 초기화
		for(int i=0;i<count;i++) {
			rank[i]=1;
		}
		
		//계산
		for(int i=0;i<count;i++) {
			for(int j=i+1; j<count;j++) {
				if(tot[i]>tot[j]) {
					rank[j]++;
				}else if(tot[i]< tot[j]) {
					rank[i]++;
				}
			}
				
				
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("====================================================");
		
		//출력
		for(int i=0;i<count;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(tot[i]+"\t"); //총점
			System.out.print(tot[i]/3+"\t"); //평균
			System.out.println(rank[i]); //석차-총점으로 계산, 석차에는 무조건 1등은 존재하지만 4등이 두 명이어서 5등이 있는 경우도 있음 
		}
*/
		String[] name;
		String[] subject={"국어", "영어", "수학"};
		int[][] score;
		int[] tot;
		int[] rank;
		int cnt;
		
		do {
			System.out.print("인원수를 입력하세요");
			cnt=sc.nextInt();
		}while(cnt<1);
		
		
		name=new String[cnt];
		score=new int[cnt][3];
		tot=new int[cnt];
		rank=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			System.out.print("이름을 입력하세요");
			name[i]=sc.next();

			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"점수를 입력하세요");
				score[i][j]=sc.nextInt();
				
				tot[i]+=score[i][j];
			}
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("===================================================");
		
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
		}
		
		for(int i=0;i<rank.length;i++) {
			for(int j=i+1;j<rank.length;j++) {
				if(tot[i]>tot[j]) {
					rank[j]++;
				}else if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
			
		}
		
		for(int i =0; i<cnt; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<subject.length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(tot[i]+"\t");
			System.out.print(tot[i]/3+"\t");
			System.out.println(rank[i]+"\t");
		}
		

		sc.close();
		
	}

}
