package algorithms;

public class LongestPalindromicSubstring {

	private static void printSubstring(String s, int start, int end) {
		System.out.println(s.substring(start, end - 1));
	}
	
	
	private static int longestPalindrome(String s) {
		int n = s.length();
		int max_len = 1;
		
		int start = 0;
		int low, high;
		
		for(int i = 1; i < n; i++){
			
			//checking even length palindrome
			low = i - 1;
			high = i;
			while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
				if(high - low + 1 > max_len){
					start = low;
					max_len = high - low + 1;
				}
				--low;
				high++;
			}
			
			//checking odd length palindrome
			low = i - 1;
			high = i + 1;
			while(low>= 0 && high < n && s.charAt(low) == s.charAt(high)){
				if(high - low + 1 > max_len){
					start = low;
					max_len = high - low + 1;
				}
				--low;
				high++;
			}
		}
		
		printSubstring(s, start, start + max_len + 1);
		
		return max_len;
	}

	public static void main(String[] args) {
		String s = "geeksskeegfor";
		System.out.println("Palindromic Substring: " + longestPalindrome(s));
	}
}
