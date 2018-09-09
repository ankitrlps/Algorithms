package algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringRelated1 {
	/*Input string aaabbbbcc
	Output string a3b4c2  */

	private static String solution(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		while(i < s.length()){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}else{
				map.put(s.charAt(i), 1);
			}
			i++;
		}		
		
		map.forEach((k,v) ->{
			sb.append(k.toString() + v.toString());
		});
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s = "aaaaaabbbbbbbbbbc";
		System.out.println("Result:" + solution(s));
	}
}
