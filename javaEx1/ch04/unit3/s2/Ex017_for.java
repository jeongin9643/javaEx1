package ch04.unit3.s2;
/*
 
     *
    **
   ***
  ****
 *****
 
 */
public class Ex017_for {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}//j 죽음
			
			//j 다시 초기화
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
