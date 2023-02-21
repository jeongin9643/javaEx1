package ch05.unit1;

public class Ex14_bubble_sort {

	public static void main(String[] args) {
		//bubble sort
		//1회전 : 1번-2번, 2번-3번, 3번-4번, 4번-5번
		//2회전 : 1번-2번, 2번-3번, 3번-4번
		
		int[] num= {10, 14, 15, 4, 6, 60, 40, 87, 74, 34};
		int t;
		boolean flag;
		
		System.out.print("Sorce data: ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		

		//개선된 Bubble sort
		flag=true;
		
		for(int i=1;flag;i++) {//무한 루프
			flag=false;//초기값은 false
			
			for(int j =0; j<num.length-i; j++) {
				if(num[j]>num[j+1]) {
					t=num[j]; num[j]=num[j+1]; num[j+1]=t;
					flag=true;//값 변화가 있으면 true, 없으면 false. 
				}
			}
			//flag가 true로 나가면 정렬 안 된 것. 한 번 더 돌고 false가 나오면 정렬 끝
			System.out.print(i+"회전: "); //9회전. 근데 4회전에서 정렬 끝남. 개선된 bubble로 5회전에서 끝남.
			for(int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		System.out.print("Sort data: ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
