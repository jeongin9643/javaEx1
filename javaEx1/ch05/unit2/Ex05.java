package ch05.unit2;

/*
 -행 우선
  1  2  3  4
  5  6  7  8
 13 14 15 16
 17 18 19 20 
 */
public class Ex05 {

	public static void main(String[] args) {

/*		
		int[][] a= new int[5][4];
		int n=0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j]=++n;
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
*/
		
		int[][] a= new int[4][4];
		int n;
		
		n=0;
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				n++;
				a[i][j]=n;
			}
		}
		for(int[] x : a) {
			for(int y : x) {
				System.out.printf("%4d", y);
			}
			System.out.println();
		}
		
	}

}
