package ch05.unit2;

/*
 -행 우선
  1  2  3  4
  5  6  7  8
 13 14 15 16
 17 18 19 20 
 */
public class Quiz01 {

	public static void main(String[] args) {
		int[][] a= new int[5][4];
		int n=0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j]=++n;
				
			}
		}
		
		//향상된 for문으로 2차원 배열 출력
		for(int[] x : a ) {
			for(int y : x) {
				System.out.printf("%3d", y);
			}
			System.out.println();
		}
		
	}

}
