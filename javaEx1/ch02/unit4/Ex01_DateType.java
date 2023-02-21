package ch02.unit4;
/*
 정수 관련 데이터 타입
 * */
public class Ex01_DateType {

	public static void main(String[] args) {
		byte b1; //선언만
		byte b2 =10; // 선언과 동시에 초기화
//		byte b3 =130; //컴파일 오류, 표현 범위를 벗어남
		
//		System.out.println(b1); //컴파일 오류 발생, 초기화가 되어 있지 않음
		System.out.println(b2); //출력 가능
		
		b2 = 30; //프로그램 실행 중 값 변경. 10은 이전값. 다시 가져올 수 없게 됨. 잊어버림
		System.out.println(b2);
		
		short s1, s2 = 100;
		//short는 2byte 표현할 수 있는 값은 -32768 +32757)
		s1 = 'A'; //'A'는 문자 리터널. 문자는 컴퓨터 안에 ASCII코드로 저장되어 있음. 'A'는 65로 저장
		
		System.out.println(s1+","+s2); //s1은 65로 출력
		
		int i = 200;
		int i2 = 'a'; //소문자 a는 ASCII코드 값이 97, 실행시 대입 됨
		int i3;
		
		i3= '1'+'3';
		//'1'은 문자 1 숫자가 아님. 문자 1은 ASCII로 49의 값을 가짐. 49+51
		
		System.out.println(i+","+i2+","+i3);
		
		b1 = 'a'; //컴파일 가능. a는 97이기 때문에 범위에 포함
//		b1 = i2; //컴파일 오류. i2에 지정된 값을 모르기 때문에 컴파일 오류. 큰 자료형을 적은 자료형에 대입 불가
		b1=(byte)i2; //형변환 큰자료형을 적은 자료형으로 형을 변환하여 대입
		System.out.println(b1);
		b1=(byte)i; //200=>1100 1000 2진법에서 맨 앞에 1은 음수. 
		System.out.println(b1);//마이너스 음수로 출력 오버플로우 발생. 
		
		long l1, l2;
		l1 =100; //int 리터널을 long에 대입
		l2 =i; //int변수를 long 변수에 대입. 적은 자료형은 큰 자료형에 형변환 없이 저장 가능
		System.out.println(l1+","+l2);
		
//		l2 = 2200000000; //컴파일 오류 int리터럴에는 22억이 없음
		l2 = 2200000000L; //long형 리터널은 접미사 l이나 L을 써줘야 함 
		
		
/*
 byte는 음수 가질 수 있지만 char는 음수를 가지지 않음. 그래서 int에 대입 가능 long<float<double 크기 순
 double=0;은 int 형이 아닌 double형에 저장 0.0으로 
 * */		
		
		
		
		
	}

}
