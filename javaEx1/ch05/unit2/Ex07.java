package ch05.unit2;

public class Ex07 {

	public static void main(String[] args) {
		//2차원 배열의 초기화
		int[][] a= new int[][] {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
		int[][] b= new int[][] {{1, 2, 3},{4, 5, 6, 7, 8},{9, 10}};
		
		System.out.println("배열a...");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n배열b...");
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}
	}

}
