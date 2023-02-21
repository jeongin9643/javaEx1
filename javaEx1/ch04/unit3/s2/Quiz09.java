package ch04.unit3.s2;

public class Quiz09 {

	public static void main(String[] args) {
		
		/*
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println(sum); //1~10, 1~20, 1~30 ... 이렇게 계산
				
			}
		}
		System.out.printf("1~10까지의 합: %d%n", sum);
		*/

		/*
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println((i-9)+"~"+ i +"까지의 합:" + sum);
				sum=0; //0값 초기화 하면서 다음 11~20, 21~30 으로 계산
				
			}
		}
		System.out.printf("1~10까지의 합: %d%n", sum);
		*/
		
		/*
		int sum;
		
		for(int i=1; i<=10; i++) {
			sum = 0;
			for(int j = (i-1)*10+1; j<=(i*10);j++) {
				sum+=j;
				
			}
			System.out.printf(((i-1)*10+1)+"~"+(i*10)+":"+sum);
		}
		*/
		
	
		int sum;
		
		for(int i=1; i<=100; i+=10) {
			sum = 0;
			for(int j =i; j<=(i-1)+10;j++) {
				sum+=j;
				
			}
			System.out.printf(i+"~"+((i-1)+10)+":"+sum);
		}
		
		
	}
}
