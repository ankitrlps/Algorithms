package algorithms;

import java.util.Stack;

public class ValidParanthesis {
	public static boolean isValid(String s) {
		boolean flag = false;
		Stack<Character> st = new Stack<>();
		
		if(s.length() == 0){
            return flag = true;
        }

		if (s.length() % 2 != 0) {
			return flag = false;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
				flag = false;
			} else {
				if(st.isEmpty()){
					return flag = false;
				}
				if (st.peek() == '(' && s.charAt(i) == ')') {
					flag = true;
					st.pop();
				} else if (st.peek() == '[' && s.charAt(i) == ']') {
					flag = true;
					st.pop();
				} else if (st.peek() == '{' && s.charAt(i) == '}') {
					flag = true;
					st.pop();
				}else{
					return flag = false;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String in = "()";
		System.out.println("Result: " + isValid(in));
	}

}
