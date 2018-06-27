package datastructures;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtables {
	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		Enumeration<String> details;
		
		String str;
		int temp;
		int count = 0;
		
		hashTable.put("Name", "ankit");
		hashTable.put("Age", Integer.toString(25));
		hashTable.put("Master's", "Computer Science");
		hashTable.put("test1", "Computer Science");
		hashTable.put("test2", "Computer Science");
		hashTable.put("test3", "Computer Science");
		hashTable.put("test4", "Computer Science");
		hashTable.put("test5", "Computer Science");
		
		
		details = hashTable.keys();
		
		while(details.hasMoreElements()){
			str = (String) details.nextElement();
			System.out.println(str + ":" + hashTable.get(str));
		}
		
		while(count < 10){			
		temp =  Integer.valueOf(hashTable.get("Age"));
		hashTable.put("Age", Integer.toString(temp + 1));
		System.out.println(hashTable.get("Age"));
		count++;
	}
	}
}
