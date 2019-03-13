package algorithms;

/*A string is said to be a special palindromic string if either of two conditions is met:

All of the characters are the same, e.g. aaa.
All characters except the middle one are the same, e.g. aadaa.

Input: 5, asasd
Output: 7

Input: 7, abcbaba
Output: 10

Input: 4, aaaa
Output: 10

*/
public class SpecialPalidrome {
	static long substrCount(int n, String s) {
        int count = n;
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            start = i - 1;
            end = i;
            if(start >= 0 && end < n && s.charAt(start) == s.charAt(end)){
                count++;
                char c = s.charAt(start);
                start--;
                end++;
                while(start >= 0 && end < n && s.charAt(start) == c && s.charAt(end) == c){
                    count++;
                    start--;
                    end++;
                }
            }
            
            start = i - 1;
            end = i + 1;
            if(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                count++;
                char ch = s.charAt(start);
                start--;
                end++; 
                while(start >= 0 && end < s.length() && s.charAt(start) == ch && s.charAt(end) == ch){
                    count++;
                    start--;
                    end++;
                }            
            }
        }
    return count;
    }

	public static void main(String[] args) {
		String s = "abcbaba";
		System.out.println(substrCount(s.length(), s));
	}
}
