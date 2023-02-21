package ch05.unit2;

/*
 -행 우선
  1  6  11  16
  2  7  12  17
  3  8  13  18
  4  8  15  19
  5  9  16  20
 */
public class Ex04 {

	public static void main(String[] args) {
/*		
		int[][] a= new int[5][4];
		int n=0;
		
		for(int i=0; i<a[i].length;i++) { //행
			for(int j=0; j<a.length;j++) { //열
				a[j][i]= ++n;
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
*/
		
		int[][] a= new int[5][4];
		int n;
		
		n=0;
		for(int i=0; i<a[i].length;i++) { //열 i<4
			for(int j=0;j<a.length;j++) { //행 j<5
				n++;
				a[j][i]=n;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
	}

}
