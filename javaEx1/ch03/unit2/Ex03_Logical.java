package ch03.unit2;

public class Ex03_Logical {

	public static void main(String[] args) {
		int a;
		boolean b1, b2;
		
		a = 100;
		b1 = false;
		b2 = a > 20 && (b1 = true); //좌변은 true 우변도 true
		System.out.println(b1 + "," +b2); //true true
		b2 = a < 20 && (b1 = true); //단축 연산, 앞이 false이므로 뒤쪽 연산을 하지 않음
		System.out.println(b1 + "," +b2); //true false
		
		a = 100;
		b1 = false;
		b2 = a > 20 || (b1 = true); //단축 연산, 앞이 true이므로 뒤쪽 연산을 하지 않음 
		System.out.println(b1 + "," +b2); //false true
		
		a = 100;
		b1 = false;
		b2 = a < 20 || (b1 = true); 
		System.out.println(b1 + "," +b2); //true true
		
	}

}
