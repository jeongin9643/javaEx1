package ch04.unit3.s2;

public class Ex002_for {

	public static void main(String[] args) {
		int a;
		for(a=1; a<=10; a++) {
			System.out.print(a + " ");
			if(a%3==0) {
				a += 5;//반복 횟수에 사용된 변수를 변경하면 반복 횟수가 달라짐 a가 3이면 8에서 올라감. a++ 9
				       //a가 9가 되면 14로올라감 a++ 15
			}
		}
		System.out.println("\n밖:"+a);
	}

}
