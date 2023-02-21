package ch05.unit1;

public class Ex03_Array {
/*
 -배열은 크기를 변경 할 수 없다.
 -배열의 크기를 변경하면 이전 배열은 위치를 참조할 수 없으며,
  이전 배열은 가비지 컬렉터(garbage collector)의 대상이 된다. => 0으로 출력.
 -크기를 변경하여 만든 배열은 새로운 위치에 메모리를 할당 받는다.  
 */
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		
		System.out.println("a="+a);//[I@58ceff1 =>hashcode
		
		System.out.println("크기가 3인 배열을 선언 후 값을 할당 한 후");
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i]+" ");//10 20 30
		}
		System.out.println();
		
		a= new int[5]; //배열 크기 변경 후
		a[3]=40; a[4]=50; // 객체 초기화
		//a[0] = 10; a[1] = 20; a[2] = 30 상실.
		
		System.out.println("a="+a);//[I@7c30a502 =>hashcode
		
		System.out.println("\n배열의 크기를 5로 변경한 후");
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i]+" "); //0 0 0 40 50
		}
		System.out.println();
	}

}
