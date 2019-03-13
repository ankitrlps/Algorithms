package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlocksValidString {

	public static String isValid(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
            i++;
        }
        Set<Integer> set = new HashSet<>(map.values());
        
        if(set.size() > 2){
        	return "NO";
        }else if(set.size() == 1){
        	return "YES";
        }else{
        	int c = 0;
        	int freq1 = 0;
        	int freq2 = 0;
        	for(int res : set){
        		if(c == 0){
        			freq1 = res;
        		}
        		else{
        			freq2 = res;
        		}
        		c++;
        	}
        	int freq1Count = 0, freq2Count = 0;
        	for(int val : map.values()){
        		if(freq1 == val) freq1Count++;
        		if(freq2 == val) freq2Count++;
        	}
        	
        	if((Math.abs(freq1 - freq2) == 1) && (freq1Count == 1 || freq2Count == 1)){
        		return "YES";
        	}else{
        		return "NO";
        	}
        }
    }

	public static void main(String[] args) {
		String s = "aabbbccdd";
		System.out.println(isValid(s));
	}
	
   /* Map<Character, Integer> map = new HashMap<>();
    int i = 0;
    while(i < s.length()){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }else{
            map.put(s.charAt(i), 1);
        }
        i++;
    }
    
    int temp = map.get(s.charAt(0));
    int count = 0;
    
    for(int res : map.values()){
         if(temp == res && count <= 1){
             temp = res;
         }else if((res == temp + 1 || res == temp - 1)){
             count++;
         }
         if(count > 1) return "NO";
    }
   
   return "YES";*/
}
