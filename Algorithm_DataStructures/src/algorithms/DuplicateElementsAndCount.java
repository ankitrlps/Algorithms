package algorithms;

public class DuplicateElementsAndCount {

	private static final int no_of_Chars = 256;

	private static void fillCharsCount(String name, int[] count) {
		for (int i = 0; i < name.length(); i++) {
			count[name.charAt(i)]++;
		}
	}

	private static void duplicateAndCount(String name) {
		int count[] = new int[no_of_Chars];
		fillCharsCount(name, count);
		for(int i = 0; i < count.length; i++){
			if(count[i] > 1){
				System.out.printf("%c, and count = %d \n", i, count[i]);
			}
		}
	}

	public static void main(String[] args) {
		String name = "ankitleelapawansai";
		duplicateAndCount(name);
	}
}
