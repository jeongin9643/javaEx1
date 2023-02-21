package ch03.unit2;

public class Es04_Logical {

	public static void main(String[] args) {
		int a, b;
		boolean c;
		
		a=20; b=20;
		c = ++a > 20 && ++b > 20;                              
		System.out.println(a+","+b+","+c); // 21 21 true
		
		a=20; b=20;
		c = a++ > 20 && ++b > 20; //a=20으로 false 값 나오고 뒤에 연산 할 필요 없어서 b는 20으로 나옴
		System.out.println(a+","+b+","+c); //21 20 false
	
		a=20; b=20;
		c = ++a > 20 && b++ > 20;
		System.out.println(a+","+b+","+c);//21 20 false
		
		a=20; b=20;
		c = ++a > 20 || ++b > 20;
		System.out.println(a+","+b+","+c);//21 20 true
	}

}
