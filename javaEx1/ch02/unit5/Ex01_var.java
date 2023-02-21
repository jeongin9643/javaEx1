package ch02.unit5;

public class Ex01_var {

	public static void main(String[] args) {
		//지역 변수 유형 추록: var keyword, JDK 10 이상 가능
//		var x; 컴파일 오류, 반드시 초기화 필수. 즉 변수를 선언만 하면 안됨. 초기화를 해야 추론이 가능. 
		
		var n = 10;
		
		//n은 정수형 변수로 추론이 가능. 이럴 때 var 사용 가능. 
		
		int a = n; //오류 없음
		System.out.println(a);
		
		var s = "java";
		System.out.println(s instanceof String);//s는 스트링
		//instanceof : 변수가 해당 클래스의 타입이면 true 반환
		//지역 변수에서만 사용 가능. 
		
		
	}

}
