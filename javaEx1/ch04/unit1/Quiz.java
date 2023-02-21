package ch04.unit1;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ch가 영문이 아닐 때 true
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("영문자를 입력하세요");
		ch = sc.next().charAt(0);
		
		if(!('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z' )) {
			System.out.println("false");
		}
		if('A' <= ch && ch <= 'Z') {
			System.out.println("false");
		}
		
		System.out.println("true");
		
		sc.close();
	}
	
	
	
/*	
	if(n>=10 && n<20)
	if(n%3==0 || n%4==0)
	if(ch != ' ' && ch != \t)
	if(ch =='x' && ch == 'X')
	if(y%4 ==0 && y %100 != 0 || y%400==0)
	if(ch != 'Y'&& ch != 'y')
	if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z')

	if(!('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z' ))
	if(!('a' <= ch && ch <= 'z')&&!('A' <= ch && ch <= 'Z'))
	if(ch < 'A' || (ch >'Z'&& ch<'a')|| ch>'z')
	
	if(b==false)
	if(!b)
	if(b = false)//항상 거짓. 
*/
}
