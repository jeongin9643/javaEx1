package ch05.unit1;

public class Ex13_bubble_sort {

	public static void main(String[] args) {
		//bubble sort
		//1회전 : 1번-2번, 2번-3번, 3번-4번, 4번-5번
		//2회전 : 1번-2번, 2번-3번, 3번-4번
		
		int[] num= {12, 15, 4, 8, 29, 3, 7, 34, 23, 45};
		int t;
		
		System.out.print("Sorce data: ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//Sort
		//1회전 : 1번-2번, 2번-3번, 3번-4번, 4번-5번
		//index: 0번-1번, 1번-2번, 2번-3번, 3번-4번 
		
		for(int i=1;i<num.length;i++) {//회전
			for(int j =0; j<num.length-i; j++) {//i=1, j=0~3 | i=2, j=0~2
				if(num[j]>num[j+1]) {
					t=num[j]; num[j]=num[j+1]; num[j+1]=t;
				}
			}
		}
		
		System.out.print("Sort data: ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
