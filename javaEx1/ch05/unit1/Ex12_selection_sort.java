package ch05.unit1;

public class Ex12_selection_sort {

	public static void main(String[] args) {
		//Selection sort
		//1회전 : 1번-2번, 1번-3번, 1번-4번, 1번-5번
		//2회전 : 2번-3번, 2번-4번, 2번-5번
		
		int[] num= {12, 15, 4, 8, 29, 3, 7, 34, 23, 45};
		int t;
		
		System.out.print("Sorce data: ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//Sort
		//1회전 : 1번-2번, 1번-3번, 1번-4번, 1번-5번
		//index: 0번-1번, 0번-2번, 0번-3번, 0번-4번 
		for(int i=0;i<num.length-1;i++) {//회전
			for(int j =i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					t=num[i]; num[i]=num[j]; num[j]=t;
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
