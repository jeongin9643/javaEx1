package ch05.unit1;

public class Ex01_Array {

	public static void main(String[] args) {
		int []num; //정수를 저장할 수 있는 배열 선언
		num = new int[5];//메모리 할당: 정수 5개를 저장할 수 있는 정수형 배열의 메모리 할당/ 객체 생성
		
//		int x;
//		System.out.println(x);//컴파일 에러. x가 초기화 되어 있지 않음
		
		System.out.println("num[0]="+num[0]);//컴파일 에러 발생 안 함. 초기값으로 자동적으로 int의 초기값인 0이 들어가기 때문.
		
		//배열 여소 접근: 첨자(index)를 이용
		//첨자는 0~'배열길이 -1'까지 사용 가능.
		num[0]=1; num[1]=3; num[2]=5; num[3]=7; num[4]=9;
//		num[5]=11; //에러 발생하는 곳. num[]의 길이는 index 0~4까지
		
		int s =0;
		for(int i=0; i<5; i++) {
			s+=num[i];
		}
		System.out.println("결과:" + s); //런타임 오류
	}

}
