package algorithms;

import java.util.Arrays;

public class StringRelated {
	private static StringBuilder doesExist(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < c1.length; i++){
			s.append(c1[i]);
		}
		for(int j = 0 ; j < c2.length; j++){
			s.append(c2[j]);
		}
		
		return s;
	}
	public static void main(String[] args) {
		String s1 = "program";
		String s2 = "grapo";
		
		StringBuilder s = doesExist(s1, s2);
		System.out.println(s);
	}
}
