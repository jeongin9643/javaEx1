package ch03.unit4;

public class Ex02 {

	public static void main(String[] args) {
		int a;
		
		a = (+-+-+-((5%3)* (4/2))); //괄호 안에는 4. +는 의미 없음 -만 세 번. 
		System.out.println(a);//-4 출려
		
		int x=2, y=5, z=0;
		
		x += 3 + 2;//좌변에서 우변으로 연산
		System.out.println(x+","+y+","+z); // 7 5 0 
		
		x += y -= z = 4; //우변에서 좌변으로 연산
		System.out.println(x+","+y+","+z); //8 1 4
		
	}

}
