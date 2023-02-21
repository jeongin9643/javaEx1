package ch05.unit3;
/*
 자바는 2차원 배열이 아닌 배열의 배열.
 a |주소1|   --------------> a[0] |주소2| -----------> |10|20|30|
                            a[1] |주소3| -----------> |40|50|60|      
                            
 따라서 a배열을 b배열에 복사하면 값을 복사하는 것이 아니라 a배열이 가지고 있는 주소 2개가 복사             
 a 배열의 원소의 값을 변경하면 b 배열 원소의 값이 변경 된다.               
 */
public class Ex04_Arrays_copy {

	public static void main(String[] args) {
		// 2차원 배열 copy
		int[][] a = {{10, 20, 30},{40, 50, 60}};
		int[][] b = new int[a.length][a[0].length]; //new int[2][3]
		
		System.arraycopy(a, 0, b, 0, b.length);
		//a라는 배열 index 0 부터 b 배열 index 0부터 b.length(행)만큼 복사 즉 2개만 복사
		//결국 b배열에는 a[0] a[1]의 주소가 복사됨
		
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
		System.out.println(a[1][1]+":"+b[1][1]); //500 500

	}

}
