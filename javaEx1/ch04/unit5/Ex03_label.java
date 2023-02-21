package ch04.unit5;

public class Ex03_label {
	//continue label
	
	public static void main(String[] args) {
	
	/*	
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) { //i+j가 4가 아닌 애들만 출력 , for(int j=1;j<=3;j++)로 이동
					continue;
				}
				System.out.println("i:"+i+", j:"+j);
			}
	*/		
//				i:1, j:1
//				i:1, j:2
//				i:2, j:1
//				i:2, j:3
//				i:3, j:2
//				i:3, j:3
			
			jump:
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					if(i+j==4) { //i+j가 4가 아닌 애들만 출력 , for(int j=1;j<=3;j++)로 이동
						continue jump;
					}
					System.out.println("i:"+i+", j:"+j);
//					i:1, j:1
//					i:1, j:2
//					i:2, j:1
				}
			}
	}

}
