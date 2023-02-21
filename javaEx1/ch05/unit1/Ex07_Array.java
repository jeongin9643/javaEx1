package ch05.unit1;

public class Ex07_Array {
/*
 1과 10사이 난수를 100개 발생하여 각 숫자가 몇개씩 발생되었는지 출력
 */
	public static void main(String[] args) {
	
		int[] cnt=new int[10];
		int n;
		
		
		for(int i=0;i<100;i++) {
			n=(int)(Math.random()*10)+1;

			cnt[n-1]++; //1-10까지의 수를 각각 0-9까지의 방으로 배정해서 cnt index 넘버-1의 숫자가 나오면 그 방에 저장.
			//cnt[0]=숫자 1의 방 1 나오면 카운트
			//cnt[1]=숫자 2의 방 2 나오면 카운트
			//cnt[2]=숫자 3의 방 3 나오면 카운트
			//cnt[3]=숫자 4의 방 4 나오면 카운트
			
			if(i!=0 && i%10==0) {   
				System.out.println();
			}
			
			System.out.printf("%5d", n);//%5는 띄어쓰기
		}
		System.out.println();
		
		for(int i=0; i<10;i++) {
			System.out.println((i+1)+":"+cnt[i]);
		}
	}

}
