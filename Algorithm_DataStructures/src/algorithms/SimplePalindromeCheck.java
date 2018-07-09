package algorithms;

public class SimplePalindromeCheck {

	private static boolean checkPalidrome(String s) {
		int j = s.length() - 1;
		boolean flag = false;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == s.charAt(j)){
				flag = true;
				j--;
			}else{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	public static void main(String[] args) {
		String s = "madams";
		System.out.println(checkPalidrome(s));
	}
}
