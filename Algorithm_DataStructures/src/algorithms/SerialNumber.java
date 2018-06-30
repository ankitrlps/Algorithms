package algorithms;

public class SerialNumber {

	public static String formatLicense(String s, int k) {
		int length = s.length();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c != '-') {
				if (count == k) {
					sb.append('-');
					count = 0;
					i++;
				} else {
					sb.append(c);
					count++;
				}
			}
		}
		return sb.reverse().toString().toUpperCase();
	}

	public static void main(String[] args) {
		String op = formatLicense("sd-swd-ed3r4-3e43-r21e3-fewf-twqre-w325-lkj8-32", 4);
		System.out.println(op);
	}
}
