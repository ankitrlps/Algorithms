package algorithms;

import java.util.ArrayList;

public class HourFormat {
	public static void main(String[] args) {
		String s = "11:00";
		ArrayList<String> list = permutation(s);
		System.out.println(list);
	}
	public static ArrayList<String> permutation(String s) {
	    ArrayList<String> res = new ArrayList<String>();
	    if (s.length() == 1) {
	        res.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        // Find out the last character
	        String last = s.substring(lastIndex);
	        // Rest of the string
	        String rest = s.substring(0, lastIndex);
	        res = merge(permutation(rest), last);
	    }
	    return res;
	}

	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<>();
	    for (String s : list) {
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            res.add(ps);
	        }
	    }
	    return res;
	}
}
