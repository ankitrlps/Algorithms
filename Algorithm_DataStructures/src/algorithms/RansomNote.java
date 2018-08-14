package algorithms;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	static String checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> mag = new HashMap<>();
        
        for(String m : magazine){
            if(mag.containsKey(m)){
                mag.put(m, mag.get(m) + 1);
            }else{
                mag.put(m, 1);
            }
        }
        
        for(String n : note){
            if(!mag.containsKey(n)){
                return "No";
            }
            if(mag.containsKey(n)){
                if(mag.get(n) > 1){
                    mag.put(n, mag.get(n) - 1);
                }else if(mag.get(n) == 1){
                    mag.remove(n);
                }
            }
        }       
        
    return "Yes";
    }

	public static void main(String[] args) {
		String[] mag = {"two", "times", "three", "is", "not", "four"};
		
		String[] note = {"two", "times", "two", "is", "four"};
		
		System.out.println(checkMagazine(mag, note));
	}
}
