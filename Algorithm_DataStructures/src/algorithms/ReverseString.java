package algorithms;

public class ReverseString {

	public static String reverseUsingReverseMethod(String s) {

		if (s.length() == 0) {
			return "";
		}

		String[] split = s.split(" ");

		String rev = new String();

		for (int i = 0; i < split.length; i++) {
			StringBuffer res = new StringBuffer();
			rev += res.append(split[i]).reverse() + " ";
		}

		return rev;
	}

	public static String reverseWithoutReverseMethod(String s) {

		if (s.length() == 0) {
			return "";
		}

		String[] split = s.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < split.length; i++) {
			char[] ch = split[i].toCharArray();
			String str = null;
			int j = 0;
			int k = ch.length - 1;
			while (j < ch.length / 2) {
				char temp = ch[k];
				ch[k] = ch[j];
				ch[j] = temp;
				j++;
				k--;
			}
			str = String.valueOf(ch);
			sb.append(str + " ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "Hello World";
		// System.out.println(reverseUsingReverseMethod(s));
		System.out.println(reverseWithoutReverseMethod(s));
	}
}
