package ch03.unit1;

public class Ex06_String {

	public static void main(String[] args) {
		String s;
		
		s = "Korea" + 9 + 3;
		System.out.println(s); //Korea12
		
		s = 9 + 3 + "korea";
		System.out.println(s);//12Korea
		
		s='A'+3+"korea";
		System.out.println(s);//68korea
		
		s='0'+3+"Korea";
		System.out.println(s);//51korea
		
		//문자열('')이 먼저 와서 유니코드로 전환된 후 계산
		
		s="Korea" + 'A' + 3;
		System.out.println(s);//koreaA3
		
		s="Korea" + 'A' + 3;
		System.out.println("\"korea\" + 'A' + 3 ="+s);
	}

}
