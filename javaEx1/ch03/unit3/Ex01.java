package ch03.unit3;
//비트단위 연산자
public class Ex01 {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = ~a; //a의 반대
		System.out.println(a + "," +b); //10, -11
		
		a = -10;
		b = ~a;
		System.out.println(a + "," +b); //-10 9
		
		a = 13; //0000 1101
		b=7; //0000 0111
		System.out.printf("%d & %d = %d%n", a, b, a&b); // 0101 => 5
		//둘 다 1이어야 1 그 외 다 0
		System.out.printf("%d | %d = %d%n", a, b, a|b); //1111 => 15
		// 둘 중 하나만 1이거나 둘 다 1이면 1
		System.out.printf("%d ^ %d = %d%n", a, b, a^b); //1010 => 10
		// 두개가 0 1, 1 0 일 때만 1, 같으면 0
		
		
	}

}
