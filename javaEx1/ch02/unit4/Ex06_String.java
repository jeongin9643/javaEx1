package ch02.unit4;

public class Ex06_String {

	public static void main(String[] args) {
		// String: 문자열을 나타내는 클래스
		
		String s1, s2, s3;
		
		s1="Seoul";
		s2= "Korea";
		s3= s1+s2;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s3="";
		System.out.println(s3);
		
		s3="X"+'A'+10; //=> 문자열 + 기본 자료형 = 문자열로 결합
		System.out.println(s3); //XA10
		
		s3='A'+10+"X"; //=> 대문자 A는 65로 치환. 65+10 
		System.out.println(s3); //75X

		//문자열이 앞에 있는지 뒤에 있는지에 따라 결과값이 다르게 나옴. 문자열이 앞에 있으면 뒤에까지 문자열로 저장

	}

}
