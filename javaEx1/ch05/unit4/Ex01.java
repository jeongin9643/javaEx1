package ch05.unit4;
/*
 명령행 인수
  실행 예)
  cmd> java Ex01 aa bb cc
       java 클래스이름 명령행 인수.
  
 명령행 인수는
  args라는 배열에 들어감
  args[0]<-"aa", args[1]<- "bb", args[2]<- "cc"
  
  명령행 인수는 왼쪽 Ex01 클래스에서 마우스 우측->Run as->Run configurations->Arguments
  띄어쓰기에 한 단위로 인식. abc java는 두 단어 a b c 는 세 단어
  
 */
public class Ex01 {

	public static void main(String[] args) { 
		System.out.println("명령행 인수의 개수: "+ args.length);
		
		System.out.println("명령행 인수 값...");
		for(int i=0;i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
		
/*		
		 for(String s:args){
			 System.out.print(s+" ");
		 }
		 System.out.println();
*/	
	}

}
