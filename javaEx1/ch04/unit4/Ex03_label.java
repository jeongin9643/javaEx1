package ch04.unit4;

public class Ex03_label {

	public static void main(String[] args) {
		//break label

/*		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) { for(int j=1; j<=3; j++) 문장을 빠져나감
					break;
				}
				System.out.println("i: "+i+", j: "+j);
				//i: 1, j: 1
				//i: 1, j: 2
				//i: 2, j: 1
			}
		}
*/
		gogo: //label이름 + :
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break gogo; //for(int i=1; i<=3; i++) 을 벗어남
				}
				System.out.println("i: "+i+", j: "+j);
				//i: 1, j: 1
				//i: 1, j: 2
			}
		}
		
	}

}
