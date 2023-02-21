package ch04.unit3;

public class Ex102_dowhile {

	public static void main(String[] args) {
		
		//while문
		int n;
		n=10;
		while(n<10) {
			System.out.println(" while 안 :"+n); // 조건이 거짓이기 때문에 한 번도 실행되지 않음.
		}
		System.out.println("while 밖 :"+n); //이것만 출력 n=10
		
		System.out.println("-----------------------------------");
		
		//dowhile문
		int a;
		a=10;
		do { //조건이 거짓이어도 적어도 한 번은 실행 함. 
			a++;
			System.out.println("do~while 안:" +a); //a=11
		}while (a<10);
		System.out.println("do~while 밖:" +a);//a=11
	}

}
