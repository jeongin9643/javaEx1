package ch05.unit3;

public class Ex03_Arrays_copy {

	public static void main(String[] args) {
		String[] s1=new String[] {"자바", "서블릿", "스프링"};
		String[] s2 = new String[s1.length+3];
		//String 배열은 메모리를 할당 받으면 null(" "과 다름)로 초기화가 이루어짐
		
		     //(원본배열, 소스시작위치, 복사할 배열, 복사시킬위치, 복사할길이)
		System.arraycopy(s1, 0, s2, 1, s1.length-1);
		//(s1에서, index 0부터, s2에서 , index 1부터, s1.length-1 만큼 복사)
		
		System.out.println("s1 배열...");
		for(String s:s1) {
			System.out.print(s+" ");
		}
		System.out.println();

		System.out.println("s2 배열...");
		for(String s:s2) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
