package ch05.unit3;

import java.util.Arrays;
import java.util.Comparator;

/*
 Arrays클래스
 -java.util.Arrays 클래스
  배열을 조작할 수 있는 메소드를 가지고 있는 클래스
  모든 메소드가 static이므로 객체 생성 없이 사용 가능
  배열복사, 정렬, 검색, 비교 등의 기능을 제공
   
 */
public class Ex01_Arrays {

	public static void main(String[] args) {
		int[] num=new int[10];
		String s;
		
		for(int i =0; i<num.length;i++) {
			num[i]=(int)(Math.random()*100)+1;
			
		}
		//Arrays.toString 
		//배열의 내용을 문자열로 변환하여 반환
		System.out.print("발생한 난수: ");
		s = Arrays.toString(num);
		System.out.println(s);
		
		//오름차순 정렬
		//int[]는 오름차순만 가능.
		Arrays.sort(num);
		System.out.println("오름차순 정렬 후의 난수: "+Arrays.toString(num));
		
		//내림차순으로 하고 싶다면 Integer[]로 변환 후 내림차순 정렬.
		//int[]->Integer[]
		Integer[] aa=Arrays.stream(num).boxed().toArray(Integer[]::new);
		Arrays.sort(aa, Comparator.reverseOrder());
		System.out.print("내림차순 정렬 후의 난수: ");
		for(int a : aa) {
			System.out.print(a+" ");
		}
		System.out.println();
	}

}
