package ch05.unit2;

/*
 -행 우선
  1  2  3  4  5
 10  9  8  7  6
 11 12 13 14 15
 20 19 18 17 16
 */
public class Ex06 {

	public static void main(String[] args) {

/*		
		int[][] a= new int[5][5];
		int n=0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				n++;
				if(i%2==0) { //짝수일 때는 j가 증가
					a[i][j]=n; //j=0 1 2 3 4  n= 1 2 3 4 5 
				}else { //홀수 일때는 j가 감소
					a[i][4-j]= n; // 4 3 2 1 0 n= 6 7 8 9 10
				}
				
			}
		}
		
		//향상된 for문으로 2차원 배열 출력
		for(int[] x : a ) {
			for(int y : x) {
				System.out.printf("%3d", y);
			}
			System.out.println();
		}
*/
		
		int[][] a=new int[5][5];
		int n;
		
		n=0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				n++;
				if(i%2==0) {
					a[i][j]=n;
				}else {
					a[i][4-j]=n;
				}

			}
		}
		for(int[] x : a) {
			for(int y : x) {
				System.out.printf("%3d", y);
			}
			System.out.println();
		}
		
		
	}

}
