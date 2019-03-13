package algorithms;

public class DesignDiamond {

	public static void diamond(int lines) {
		int i = 1;
		int j = 0;
		final String f = "/";
		final String b = "\\";

		int n = lines / 2;
		while (i <= lines / 2 && n > 0) {
			System.out.format("%" + n + "s", "");
			j = 1;
			while (j <= i) {
				System.out.print(f);
				j++;
			}
			j = 1;
			while (j <= i) {
				System.out.print(b);
				j++;
			}
			i++;
			System.out.println();
			n--;
		}
		
		i = lines / 2;
		n = j = 1;

		while (i > 0 && n <= lines / 2) {
			System.out.format("%" + n + "s", "");
			j = 1;
			while (j <= i) {
				System.out.print(b);
				j++;
			}
			j = 1;
			while (j <= i) {
				System.out.print(f);
				j++;
			}
			i--;
			System.out.println();
			n++;
		}
	}

	public static void main(String[] args) {
		diamond(16);
	}
}
