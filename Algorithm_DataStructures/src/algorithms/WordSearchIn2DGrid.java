package algorithms;

public class WordSearchIn2DGrid {

	static int rowNum[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int colNum[] = { -1, 0, -1, -1, 1, 1, 0, 1 };

	static Boolean found = false;
	
	static int Rows = 0;
	static int Cols = 0;

	private static Boolean search(char board[][], String word, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				searchUtil(board, word, i, j);
			}
		}
		return found;
	}

	private static Boolean searchUtil(char board[][], String word, int i, int j) {
		if (board[i][j] != word.charAt(0)) {
			return false;
		}

		for (int temp = 0; temp < 8; ++temp) {
			int rd = i + rowNum[temp];
			int cd = j + colNum[temp];

			String s = board[i][j] + "(" + i + ", " + j + ")";
			int next = 1;
			for (next = 1; next < word.length(); next++) {
				if (!isSafe(rd, cd)) {
					break;
				}
				
				if(board[rd][cd] == word.charAt(next)){
					s = s.concat(" " + board[rd][cd] + "(" + rd + ", " + cd + ")");
				}else{
					break;
				}
				rd = rd + rowNum[temp];
				cd = cd + colNum[temp];
			}
			if(next == word.length()){
				found = true;
			}
		}

		return found;
	}

	private static Boolean isSafe(int rd, int cd) {

		if (rd >= 0 && rd < Rows && cd >= 0 && cd < Cols) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		char board[][] = { { 'f', 'n', 'a', 'e', 'h', 'w', 'f' }, { 'n', 'n', 'e', 'e', 'h', 'w', 'n' },
				{ 'a', 'g', 'a', 'r', 'h', 'a', 'a' }, { 'e', 'n', 'y', 'e', 'q', 'o', 'e' },
				{ 'f', 'n', 'a', 'e', 'b', 'q', 'u' } };

		int rows = Rows = board.length;
		int cols = Cols = board[0].length;

		String word = "feded";
		Boolean res = search(board, word, rows, cols);
		System.out.println("Found? " + res);
	}
}
