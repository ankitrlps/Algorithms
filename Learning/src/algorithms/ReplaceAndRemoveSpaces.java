package algorithms;

//Question - Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters. and that you are given the "true" length of the string. (Use character array)

public class ReplaceAndRemoveSpaces {

	public static StringBuilder removeSpace(String str) {
		String input = str.replace(" ", "%20");
		char[] ch = input.toCharArray();
		StringBuilder s = new StringBuilder();
		for (int i = 0; i <= 16; i++) {
			s.append(ch[i]);
		}
		
		return s;
	}

	public static void main(String[] args) {
		StringBuilder s1 = removeSpace("Mr Ankit RLPS                                       ");
		System.out.println(s1);
	}
}