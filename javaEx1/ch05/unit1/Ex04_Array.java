package ch05.unit1;

public class Ex04_Array {

	public static void main(String[] args) {
		//일반 변수
		int x = 10;
		int y = x; //x라는 변수가 가지고 있는 값을 y 변수에 대입. 둘은 관련성이 없음. 
		y+=20;//x가 변하는 것이 아니라 y값만 변함
		System.out.println(x+", "+y); //10, 30
		System.out.println();
		
		//배열
		int[] a = new int[3];
		a[0]=10; a[1]=20; a[2]=30; 
		
		System.out.println("초기 a배열...");
		
		for(int n : a) {
			System.out.print(n+" "); //10 20 30 
		}
		System.out.println();
		
		int[] b=a;//a라는 변수가 가지고 있는 값을 b에 대입. 
		//하지만 a는 참조변수이기 때문에 주소값을 가지고 있음. a가 참조하는 배열의 주소를 b에 대입
		//a라는 배열과 b라는 배열은 동일한 배열을 참조. 즉 a와 b가 같은 주소(하나의 배열)을 공유.
		a[0]=500;
		b[1]+=100;
		b[2]+=100;
		
		System.out.println("a배열...");

		for(int n : a) {
			System.out.print(n+" "); //10 120 130 
		}
		System.out.println();

		System.out.println("b배열...");

		for(int n : b) {
			System.out.print(n+" "); //10 120 130 
		}
		System.out.println();
		

	}

}
