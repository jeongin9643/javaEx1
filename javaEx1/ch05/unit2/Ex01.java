package ch05.unit2;

public class Ex01 {

	public static void main(String[] args) {
		//배열의 배열: 2차원 배열
		int[][] a= new int[3][4];
		
		System.out.println("전체행수: "+a.length);
		System.out.println("0행의 열수: "+a[0].length);
		
		System.out.println("a배열의 참조위치: "+ a);
		System.out.println("0행의 참조위치: "+ a[0]);
		System.out.println("1행2열의 값: "+ a[1][2]);//0
	}

}
