package ch05.unit1;

public class Ex02_Array {

	public static void main(String[] args) {
		
		int[] a= new int[5];//배열 선언과 동시에 객체 생성
		
		int n=1;
		for(int i=0;i<a.length/*i<5 라고 써도 가능*/;i++) { //length 는 배열의 길이
			a[i]=n; //a[1]=1, a[2]=3, a[3]=5,..
			n+=2;//홀수값 저장
		}
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		//향상된 for문
		System.out.println("\n향상된 for문");
		for(int x : a){// for(자료형 변수 : 컬랙션=집합=배열=리스트 등) 
			//a가 가지고 있는 내용 5개를 한 개씩 x에 저장, x = 1, 3, 5, 7..
			System.out.print(x+" ");
		}
		System.out.println();
		
		//var(타입추론) 키워드 사용
		System.out.println("\nvar(타입추론) 키워드");
		for(var x : a){ 
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
