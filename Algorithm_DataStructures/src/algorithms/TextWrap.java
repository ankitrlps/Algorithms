package algorithms;

public class TextWrap {

	/*
	 * Text Wrap: Given a string and an integer with column width. Align the
	 * given string according to the column width given. 
	 * 
	 * This functionality is similar to how text wrap option of notepad/notepad++ works or how
	 * Microsoft's Word Processor manipulates the strings when margins are
	 * modified.
	 */
	public static String wrapper(String s, int col) {

		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int rem = col;
		boolean newWord = false;
		boolean spaces = false;
		StringBuilder sub = new StringBuilder();
		
		if(col < 1) return "Column width must be one or more.";
		
		if (col == 1) {
			int z = 0;
			while (z < s.length()) {
				sb.append(s.charAt(z) + "\n");
				z++;
			}
		} else {

			for (int i = 0; i < ch.length; i++) {
				if (rem > 1 && rem <= col) {

					if (ch[i] != ' ') {
						newWord = true;
					} else {
						spaces = true;
						newWord = false;
						if (sub.length() != 0) {
							sb.append(sub.toString());
							sub = new StringBuilder();
							rem = Math.abs(rem - sub.length());
						}
						if (rem != col) {
							sb.append(ch[i]);
							rem--;
						}
					}

					if (newWord) {
						if (spaces) {
							sub.append(ch[i]);
							rem--;
						} else {
							sb.append(ch[i]);
							rem--;
						}
					}

					if (i == s.length() - 1) {
						if (newWord && spaces) {
							sb.append(sub.toString());
							rem = Math.abs(col - sub.length());
						}
					}

				} else {
					if (newWord && spaces) {
						if (ch[i] == ' ') {
							if (sub.length() != 0) {
								sb.append(sub.toString() + "\n");
								sub = new StringBuilder();
								rem = col;
							}
						} else if (i == ch.length - 1) {
							sb.append(sub.toString() + ch[i]);
						} else if (i + 1 < ch.length && ch[i + 1] == ' ') {
							sb.append(sub.toString() + ch[i] + "\n");
							sub = new StringBuilder();
							rem = col;
							spaces = false;
						} else {
							if (sub.length() + 1 < col) {
								sb.append("\n" + sub.toString() + ch[i]);
								rem = Math.abs(col - (sub.toString().length() + 1));
							} else {
								int j = 0;
								rem = col;
								String temp = sub.toString();
								while (j < temp.length() && rem > 0) {
									sb.append(temp.charAt(j));
									rem--;
									if (rem == 0) {
										sb.append("\n");
										rem = col;
									}
									j++;
								}
								if (rem >= 1) {
									sb.append(ch[i]);
									rem--;
									if (rem == 0) {
										sb.append("\n");
										rem = col;
									}
								} else {
									sb.append("\n" + ch[i]);
									rem = col - 1;
								}
							}
							sub = new StringBuilder();
						}
						spaces = false;
					} else {
						if (i - 1 >= 0 && i + 1 < ch.length && ch[i - 1] == ' ' && ch[i + 1] != ' ') {
							sb.append("\n" + ch[i]);
							rem = Math.abs(col - 1);
							spaces = false;
						} else {
							sb.append(ch[i] + "\n");
							rem = col;
							spaces = false;
						}
					}
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "Ankit is a bad boy. This is very true.";
		System.out.println(wrapper(s, 100));
	}
}
