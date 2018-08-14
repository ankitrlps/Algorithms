package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tester {

	public static Integer decode(String roman) {
	    int sum = 0;
	    int i = 0;
	    while(i < roman.length() && (i + 1) < roman.length()){
	      if(roman.charAt(i) == 'M'){
	        sum = sum + 1000;
	      }else if(roman.charAt(i) == 'D'){
	        if(roman.charAt(i + 1) == 'M'){
	          sum = sum + 500;
	            i = i+2;
	        }else{
	         sum = sum + 500; 
	        }
	      }else if(roman.charAt(i) == 'C'){
	        if(roman.charAt(i + 1) == 'D'){
	          sum = sum + 400;
	            i = i + 2;
	        }else if(roman.charAt(i + 1) == 'M'){
	          sum = sum + 900;
	          i = i + 2;
	        }else{
	         sum = sum + 100; 
	        }
	      }else if(roman.charAt(i) == 'L'){
	        if(roman.charAt(i + 1) == 'C'){
	          sum = sum + 50;
	          i = i + 2;
	        }else if(roman.charAt(i + 1) == 'D'){
	          sum = sum + 450;
	          i = i + 2;
	        }else if(roman.charAt(i + 1) == 'M'){
	          sum = sum + 950;
	          i = i + 2;
	        }else{
	          sum = sum + 50;
	        }
	      }else if(roman.charAt(i) == 'X'){
	        if(roman.charAt(i + 1) == 'L'){
	          sum = sum + 40;
	          i += 2;
	        }
	        
	        else if(roman.charAt(i + 1) == 'C'){
	          sum = sum + 90;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'D'){
	          sum = sum + 490;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'M'){
	          sum = sum + 990;
	          i += 2;
	        }
	        else{
	          sum = sum + 10;
	        }
	      }else if(roman.charAt(i) == 'V'){
	        if(roman.charAt(i + 1) == 'X'){
	          sum = sum + 5;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'L'){
	          sum = sum + 45;
	          i += 2;
	        }
	        
	        else if(roman.charAt(i + 1) == 'C'){
	          sum = sum + 95;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'D'){
	          sum = sum + 495;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'M'){
	          sum = sum + 995;
	          i += 2;
	        }
	        else{
	          sum = sum + 5;
	        }
	      }else if(roman.charAt(i) == 'I'){
	        if(roman.charAt(i + 1) == 'V'){
	          sum = sum + 4;
	          i += 2;
	        }else if(roman.charAt(i + 1) == 'X'){
	          sum = sum + 9;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'L'){
	          sum = sum + 49;
	          i += 2;
	        }
	        
	        else if(roman.charAt(i + 1) == 'C'){
	          sum = sum + 99;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'D'){
	          sum = sum + 499;
	          i += 2;
	        }
	        else if(roman.charAt(i + 1) == 'M'){
	          sum = sum + 999;
	          i += 2;
	        }
	        else{
	          sum = sum + 5;
	        }
	      }
	    }
	    return sum;
	  }

	public static String firstNonRepeatingLetter(String str) {

		Boolean bool = false;
		if (str.length() == 0) {
			return "";
		}

		Hashtable<Character, Integer> map = new Hashtable<>();

		char[] ch = str.toCharArray();

		List<Character> list = new ArrayList<>();
		for (char c : ch) {
			list.add(c);
		}

		for (char key : list) {
			int ascii = (int) key;
			
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					map.put(key, map.get(key) + 1);
				}
			
		}

		int size = map.size();
		
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println("Now: " + it.next());
		}

		for (Map.Entry<Character, Integer> set : map.entrySet()) {
			 System.out.println(set.getKey() + " " + set.getValue());

			 if (set.getValue() == 1) {
					return set.getKey().toString();
				}
				if (size == 1 && set.getValue() > 1) {
					return "";
				}

		}
		return "";

	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingLetter("trwers"));

		System.out.println(decode("CMIXVD"));
	}
}
