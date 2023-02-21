package ch04.unit3;

public class Quiz03 {

	public static void main(String[] args) {
//		char a;
//		
//		a = 'A'; //65
//		
//		while(a<='Z');{
//			System.out.printf("%c", a++);
//		}	
		
		int cnt, i;
		
		i = 65;
		cnt = 0;
		
		while(i<=90) {
			System.out.print((char)i+"\t");
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
			i++;
		}
	}
}


