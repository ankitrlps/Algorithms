package algorithms;

public class SpiralPrintingArray {

	public static void SpiralPrinting(int endRow, int endCol, int arr[][]) {
		int startRow = 0;
		int startCol = 0;
		int i;

		while (startRow < endRow && startCol < endCol) {
			for (i = startCol; i < endCol; ++i) {
				System.out.print(arr[startRow][i] + " ");
			}
			startRow++;
			for (i = startRow; i < endRow; ++i) {
				System.out.print(arr[i][endCol - 1] + " ");
			}
			endCol--;
			if (startRow < endRow) {
				for (i = endCol - 1; i >= startCol; --i) {
					System.out.print(arr[endRow - 1][i] + " ");
				}
				endRow--;
			}
			if (startCol < endCol) {
				for (i = endRow - 1; i >= startRow; --i) {
					System.out.print(arr[i][startCol] + " ");
				}
				startCol++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		System.out.println("Length: " +arr[0][1]);
		SpiralPrinting(3, 6, arr);
	}
}
