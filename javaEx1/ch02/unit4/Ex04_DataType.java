package ch02.unit4;
/*
 실수 관련 데이터 타입
  */
public class Ex04_DataType {

	public static void main(String[] args) {
		//byte<short<int<long<float<double
		//      char<int<long<float<double
		
		// float : 단정도형 실수 차닙
		
		float f;
		f=0;
		System.out.println(f);
//		f=0.5; //컴파일 오류. 배정도형 리터널은 float에 대입 불가
		//0.5는 double
		f=0.5f;
		//0.5f는 단정도형
		System.out.println(f);
		
		f=1.2e04f;
		System.out.println(f);
		
		f= 'A';
		System.out.println(f);
		
		double d; //배정도형 실수타입
		d=0.5;
		System.out.println(d); 
		d=0.5d;
		System.out.println(d);
		
		//f없으면 배정도형. 
				
		
		
	}

}
