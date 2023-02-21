package ch02.unit4;

public class Ex03_DataType {

	public static void main(String[] args) {
		byte b = (byte)0b10000000;
		System.out.println(b);//-128
		
		b=-128;
		System.out.printf("%#X%n",b);//16진수로 출력 0x80 음수
		
		b= -84;
		System.out.printf("%#X%n",b); //0XAC=1010 1100
		
		b= 0b0011_0011;
		System.out.println(b);
		
		int a = '대'; //문자, 한 문자는 가능함
		char c = '대';
		System.out.println(a);//45824 
		System.out.println(c);//45824 
		
		short s = 'A';
		System.out.println(s); //65
		
		c = 'A';
//		s = c;//오류 char를 short는 크기 비교가 불가능. 컴파일 오류 발생
		s= (short)c;// 형변환 필요
		System.out.println(s);
		
		byte b1 = (byte)129;
		byte b2 = (byte)385;
		System.out.println(b1 == b2); // true 나옴 
		System.out.println(b1+"," +b2); // 오버플로우 발생 
		
		
		
		
		/*
		 맨 앞 byte는 부호 음수이면 1 양수면 0. 10000000 은 음수
		 즉 보수로 저장. 
		 1 000 0000 => 이미 보수처리를 한 상태로 들어간 것 
		 다 시 보수 구하면 1000 0000=>-128
		 데이터를 저장할 때 부호 처리하고, 그 뒤에 데이터를 처리. 
		 1010 1100 => 0101 0011 1+2+16+64 : -84
		 0011 0011 : 51
		 음수는 보수를 구하고 양수는 보수를 구하지 않음.
		 */
		
	}

}
