package ch05.unit1;

public class Ex06_Array {
/*
 1~100 사이의 '서로 다른 난수'를 10개 발생하여 출력
 */
	public static void main(String[] args) {
		
		int[] a=new int[10];
/*		
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100)+1;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//얘는 중복이 나올 수 있음, 중복값이 출력
*/
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100)+1;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {   //i번째 index 전에 같은 값을 가지고 있는지 확인.
					i--;           //있으면 i 반환
					break;         //그리고 break;
				}
			}
		}
		
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
