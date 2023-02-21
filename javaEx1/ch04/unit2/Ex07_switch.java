package ch04.unit2;
/*
switch 수식
반환값은 -> 이나, yield를 통해서 반환. 
yield는 case : 에서도 사용 가능
yield는 제한된 식별자로 var 처럼 변수로 사용 가능
     ex) int float 에러. 예약어는 변수명으로 사용 불가
         int var 은 가능. 
JDK12, 13에서는 preview로 제공, 14부터는 표준화.
수식이기 때문에 변수에 넣어주거나 메서드 안에 넣어줘야함
        
*/
import java.util.Scanner;

public class Ex07_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y, m;
		
		System.out.print("년도를 입력하세요");
		y = sc.nextInt();
		
		System.out.print("월을 입력하세요");
		m = sc.nextInt();
		
		/*switch 수식
		실행된 결과를 되돌려 받을 수 있음. 
		var 는 default에서 String을 받고 있어서 int로 불가
		-> 화살표 라벨 뒤에 반환할 값을 입력, 단 구문이나 명령문은 들어가지 못한 '값'만 돌려 줄 있기 때문. 
	    */
		var s = switch(m) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		case 2 -> {
			int d = y%4 ==0 && y%100 != 0 || y%400 == 0 ? 29 : 28;
			yield d;//반환되는 값	
		      }
		default -> "입력 오류입니다.";
		}; //switch 부터 하나의 구문이기 때문에 구문이 끝나서 ; 써줘야 함. 
		
		System.out.println(y + "년도" + m + "월의 마지막 일자는" + s + "입니다.");
		
		sc.close();
	}

}
