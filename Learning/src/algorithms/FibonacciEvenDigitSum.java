package algorithms;


public class FibonacciEvenDigitSum {
	public static void main(String[] args) {
		int fNum = 1;
		int sNum = 2;
		int tNum = 0;
		int sum = 2;
		int limit = 4000000;
		
		while(tNum<limit) {
			tNum = fNum + sNum;
			if ((tNum % 2) == 0) {
				sum = sum + tNum;
			}
			fNum = sNum;
			sNum = tNum;
		}
		System.out.println(sum);
		
	}
}
