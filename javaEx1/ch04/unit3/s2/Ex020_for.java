package ch04.unit3.s2;
/*
 
     *
    ***
   *****
  *******
 *********
 
 */
public class Ex020_for {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i*2-1;j++) { //j<i*2 도 가능
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>=1; i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i*2-1;j++) { //j<i*2 도 가능
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
