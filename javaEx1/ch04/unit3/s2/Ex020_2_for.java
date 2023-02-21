package ch04.unit3.s2;
/*
 
 총 9줄
 
     *          공백까지 5칸(공백4+별1)
    ***         공백까지 6칸(공백3+별3)
   *****        공백까지 7칸(공백2+별5)
  *******
 *********      별이 늘어남
  *******       별이 줄어들기 시작함
   *****         
    ***
     *
 
 */
public class Ex020_2_for {

	public static void main(String[] args) {
		
		int size = 9; //총 9줄
		int n;
		
		n = size/2; //4 공백 수
		
		for(int i=0; i<size;i++) {
			for(int j=0; j<size-n; j++) {
				System.out.print((j>=n)? "*" : " "); //별수>=공백 이면 "*" 아니면 " "
			
			}
			n= i<(size/2)? n-1 : n+1;
			System.out.println();
		}
		
		
		// i  "*"반복 
		//i=0; j=0~4 n = 4
		//i=1; j=0~5 n = 3
		//i=2; j=0~6 n = 2
		//i=3; j=0~7 n = 1
		//i=4; j=0~8 n = 0
		//i=5; j=0~7 n = 1 별 줄어들기 시작
		//i=6; j=0~6 n = 2
		//i=7; j=0~5 n = 3
		//i=8; j=0~4 n = 4
	}

}
