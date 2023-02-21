package ch04.unit5;

public class Ex01_continue {

/*
continue: while, do while, for에서 사용 가능.
	
continue만나면 
while, do while: 조건식으로 올라감
for: 증감식으로 이동
*/
	public static void main(String[] args) {
		
		int n, s;
		n=s=0;
		
		// 2또는 3의 배수를 제외한 수의 합
		while(n<10) {
			n++;
			if(n%2==0 || n%3==0) {
				continue;// 2 또는 3의 배수가 나오면 조건식으로 이동
			}
			
			s+=n;
		}
		System.out.println("결과:"+s);
	}

}
