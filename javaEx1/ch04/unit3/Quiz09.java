package ch04.unit3;

public class Quiz09 {

	public static void main(String[] args) {
		int index1, index2, index3, cnt, sum;
		
		index1=0;
		index2=1;
		index3=0;
		sum=1;
		cnt=0;
		// (0+)1+1+2+3+5...
		while(cnt<7) {
			cnt++;
			index3=index1+index2;
			sum+=index3;
			index1=index2;
			index2=index3;
		}
		System.out.println(sum);
	}
/*
 a=1
 b=1
 s=2
 n=2
 while(n<8) {
    c = a+b;
    s+=c;
    a=b;
    b=c;
    n++;
 }
 */
}
