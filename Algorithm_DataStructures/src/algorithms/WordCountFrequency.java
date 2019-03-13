package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountFrequency {

	private static void wordCount(String s) {
		List<String> list = new ArrayList<>();
		
		char[] c = s.toCharArray();
		
		for(String ss : s.split(" ")){
			list.add(ss);
		}
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String key : list){
			if(!map.containsKey(key)){
				map.put(key, 1);
			}else{
				map.put(key, map.get(key) + 1);
			}
		}
		
		
			
		
		for(Map.Entry<String, Integer> set : map.entrySet()){
			if(set.getValue() == 1){
				System.out.println("Here: " + set.getKey());
			}
			System.out.println("Count of " + set.getKey() + " : " + set.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		String s = "ankit apoorva rlps apoorva amma nanna amma nanna ankit";
		wordCount(s);
		
	}
}
