package algorithms;

public class Solution {
	public static String solution(String s, int k) {

		int len = s.length();
        StringBuilder res = new StringBuilder();

        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if (count == k) {
                    res.append("-");
                    count = 0;
                    i++;
                } else {
                    res.append(c);
                    count++;
                }
            }
        }

        return res.reverse().toString().toUpperCase();
	}
	public static void main(String[] args) {
		String output = solution("2-4A0r7-4k", 4);
		System.out.println(output);
	}
}