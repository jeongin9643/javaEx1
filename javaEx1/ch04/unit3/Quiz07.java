package ch04.unit3;

public class Quiz07 {

	public static void main(String[] args) {

		int x= 100;
		int y=0;
		int cnt = 0;
		
		while(x >= y) { //따라 잡는다...차이가 별로 안 난다... 비슷해진다...흠..
			x+=2;
			y+=5;
			cnt++;
		}
		System.out.printf("x: %d, y: %d%n걸린시간: %d", x, y, cnt);
		
//		do {
//			x+=2;
//			y+=5;
//			cnt++;
//		} while (y);
//		System.out.println(cnt);
	}

}
