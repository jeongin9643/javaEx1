package ch04.unit3;

public class Ex014_while {

	public static void main(String[] args) {
        //무한 루프
		
		int n, s;
		
		n = s = 0;
		while(true) { //계속 반복
			n++;
			s+=n;
			if(n == 100) { // n이 100이 되면
				break; //무한 루프 빠져나감
			}
		}
		
		System.out.println("결과 :" + s);//무한 루프 빠져나가서 출력되는 문장
		
	}

}
