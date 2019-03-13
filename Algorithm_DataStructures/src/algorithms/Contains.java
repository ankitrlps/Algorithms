package algorithms;

public class Contains {

	/*
	 * Given two lowercase strings, S1 and S2, sort S1 in same order as S2. If a
	 * character in S1 doesn't exist in S2, put them at the end. If S1 is
	 * "program" and S2 is "grapo", then return "grrapom".
	 * 
	 */

	public static void main(String[] args) {
		String s1 = "program";
		String s2 = "grapo";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		boolean flag = false;
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c2[i] == c1[j]) {
					s.append(c2[i]);
				}
			}
		}
		
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				s.append(c1[i]);
			}
		}
		System.out.println(s);
	}
}
