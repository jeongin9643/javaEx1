package ch05.unit2;

public class Ex02 {

	public static void main(String[] args) {
		//배열의 배열: 2차원 배열과 다름
		int[][] a= new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[5];
		
		System.out.println("전체행수: "+a.length);
		System.out.println("0행의 열수: "+a[0].length);
		System.out.println("1행의 열수: "+a[1].length);
		System.out.println("2행의 열수: "+a[2].length);
		
	}

}
