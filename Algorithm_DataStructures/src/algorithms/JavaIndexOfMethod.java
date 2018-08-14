package algorithms;

public class JavaIndexOfMethod {
	public static int strStr(String haystack, String needle) {

		if (needle.length() == 0) {
			return 0;
		}

		if (haystack.equals(needle)) {
			return 0;
		}

		int haylength = haystack.length();
		int neelength = needle.length();

		int j = 0;
		int k = 0;
		int res = 0;

		for (int i = 0; i < haylength; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (neelength == 1) {
					return i;
				} else {
					j = i + 1;
					k = 1;
					res = i;
					while (j < haylength && k < neelength) {
						if (haystack.charAt(j) == needle.charAt(k)) {
							if (k == (neelength - 1)) {
								return res;
							}
							j++;
							k++;
						} else {
							break;
						}
					}
				}
				/*
				 * if (res.length() == neelength) { System.out.println("len " +
				 * res.length()); return 0; }
				 */
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "pi"));
	}

}
