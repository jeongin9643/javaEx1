package ch05.unit3;
/*
배열의 배열 복사              
 */
public class Ex05_Arrays_copy {

	public static void main(String[] args) {
		// 2차원 배열 copy
		int[][] a = {{10, 20, 30},{40, 50, 60}};
		int[][] b = new int[a.length][a[0].length]; //new int[2][3]
		
		for(int i=0;i<a.length;i++) {
			System.arraycopy(a[i], 0, b[i], 0, a[i].length);
		}
		
		System.out.println("a 배열...");
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("b 배열...");
		for(int i =0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		a[1][1]=500;
		System.out.println(a[1][1]+":"+b[1][1]); //500 50

	}

}
