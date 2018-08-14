package algorithms;

public class ReverseInteger {

	private static int reverse(int x) {
		long reverse = 0;

		if (x > 0) {
			while (x > 0) {
				reverse = reverse * 10 + x % 10;
				x /= 10;
			}
			if (reverse > Integer.MAX_VALUE) {
				return 0;
			}
			return (int)reverse;
		} else {
			while (x < 0) {
				reverse = reverse * 10 + x % 10;
				x /= 10;
				
			}
			if (reverse < Integer.MIN_VALUE) {
				return 0;
			}
				return (int) reverse;
		}
	}

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
