package ch05.unit3;

public class Ex02_Arrays_copy {

	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30};
		int[] b = a; //a와 b는 동일한 배열 객체를 참조. 같은 주소값을 공유.
		
		int[] c = new int[a.length];
		
		      //(원본배열, 소스시작위치, 복사할 배열, 복사시킬위치, 복사할길이)
		System.arraycopy(a, 0, c, 0, a.length);
		
		System.out.println(a == b);//true //배열에서의 ==은 값이 아닌 참조값(주소값)을 비교
		System.out.println(a == c);//false
		
		System.out.println("b배열..");
		for(int n:b) {
			System.out.print(n+" ");
		}
		System.out.println();

		System.out.println("c배열..");
		for(int n:c) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
		a[1] += 100;
		System.out.println(a[1]+ ":"+ b[1]+ ":"+ c[1] );//120:120:20 //c는 새로운 배열을 생성하여 복사한 것이기 때문에 변화 없음.
		

	}

}
