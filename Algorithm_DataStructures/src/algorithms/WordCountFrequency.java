package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountFrequency {

	private static void wordCount(String s) {
		List<String> list = new ArrayList<>();
		for(String ss : s.split(" ")){
			list.add(ss);
		}
		
		Map<Object, Integer> map = new HashMap<>();
		
		for(String key : list){
			if(!map.containsKey(key)){
				map.put(key, 1);
			}else{
				map.put(key, map.get(key) + 1);
			}
		}
		
		for(Map.Entry<Object, Integer> set : map.entrySet()){
			System.out.println("Count of " + set.getKey() + " : " + set.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		String s = "ankit apoorva rlps apoorva amma nanna amma nanna ankit";
		wordCount(s);
		
	}
}
