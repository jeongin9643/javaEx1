package ch05.unit1;

public class Ex08_initialize {

	public static void main(String[] args) {
		int[] num = new int[] {2,4,6,8,10};
//		int[] num = new int[5] {2,4,6,8,10}; //컴파일 오류.초기화 할 때는 index 지정 불가
//		int[] num = {2,4,6,8,10}; //가능. 선언과 초기화 동시에 할 때는 new 자료형[] 생략 가능
		
		int[] a;
		//a={1,3,5,7,9} //컴파일 오류
		a=new int[] {1,3,5,7,9,}; //배열 선언과 초기화를 따로 할 때는 new 자료형[] 생략 불가
		
		System.out.println("num배열 요소 개수:"+num.length);
		System.out.println("a배열 요소 개수:"+a.length);
		
		int total=0;
		for(int n : num) {
			total+=n;
		}
		System.out.println("num 배열 요소의 합:"+total);
	}
}
