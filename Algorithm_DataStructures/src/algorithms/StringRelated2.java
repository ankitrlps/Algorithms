package algorithms;

import java.util.Stack;

/*input = "aaabbaa" Output = "a3b2a2"*/

public class StringRelated2 {
	
	private static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int i = 1;
		int k = 1;
		
		stack.push(s.charAt(0));
		while(i < s.length()){
			if(s.charAt(i) == stack.peek()){
				k++;
			}else{
				char c = stack.pop();
				sb.append(c + "" + k);
				stack.push(s.charAt(i));
				k = 1;
			}
			i++;
		}
		sb.append(stack.pop() + "" + k);
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(solution("aaabbaa"));		
	}
}
