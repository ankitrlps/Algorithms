package algorithms;

// x = a,f,b,c
// y = b,c,d,f,g
//output = 5
public class RemovedLetterInAnagramString {
	
	public static int makeAnagrams(String a, String b) {
		
		int[] first = new int[26];
		int[] second = new int[26];
		
		int k = 0;
		
		for(int i = 0; i < a.length(); i++){
			first[a.charAt(i) - 'a'] = first[a.charAt(i) - 'a'] + 1;
		}
		for(int i = 0; i < b.length(); i++){
			second[b.charAt(i) - 'a'] = second[b.charAt(i) - 'a'] + 1;
		}
		
		for(int i = 0; i < 26; i++){
			k += Math.abs(first[i] - second[i]);
		}
		
		return k;
	}
	
	public static void main(String[] args) {
		String a = "showman";
		String b = "woman";
		System.out.println("Number of required letters to be removed: " + makeAnagrams(a, b));
	}
}
