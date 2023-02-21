package ch05.unit1;

public class Ex09_initialize {

	public static void main(String[] args) {
		int[] unit = new int[] {50000,10000,5000,1000,500,100,50,10};
		int money = 6788500;
		//이 금액을 지불하는데 필요한 화폐 개수
		
		System.out.printf("금액: %,d%n", money);
		System.out.println("화폐\t\t개수");
		for(int n : unit) {
			System.out.printf("%,d원\t\t%d%n", n, money/n);
			money %= n; //나머지를 다시 money에 저장한 다음, 다음 화폐로 나눔.
		}
		
		
	}
}
