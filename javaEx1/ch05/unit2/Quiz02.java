package ch05.unit2;
/*
 -열 우선
 
  E J O T S
  D I N S X
  C H M R W
  B G L Q V
  A F K P U
 */
public class Quiz02 {

	public static void main(String[] args) {
		char[][] ch = new char[5][5];
		
		char a='A';
		
		for(int j=0;j<ch.length;j++) {
			for(int i=4; i>=0;i--) {
				ch[i][j]=a++;
			}
			System.out.println();
		}
/*
		for(int i=0; i<ch.length;i--) {
			for(int j=0;j<ch[i].length;j++) {
				ch[4-j][i]=a++;
			}
			System.out.println();
		}
*/	
		
		for(char[] x : ch) {
			for(char y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
