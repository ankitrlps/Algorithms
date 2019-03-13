package algorithms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 1;
		int sec = 2;
		int sum = 0;
		System.out.println(first);
		System.out.println(sec);
		while (sum < 1000) {
			sum = first + sec;
			if (sum < 1000) {
				System.out.println(sum);
			}
			first = sec;
			sec = sum;
		}
	}

}
