package datastructures;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> hashSet = Collections.synchronizedSet(new HashSet<>());
		hashSet.add("r");
		hashSet.add("l");
		hashSet.add("p");
		hashSet.add("ank");
		hashSet.add("ankit");
		
		System.out.println("Added " + hashSet);
		
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		
		Set<String> linkedSet = new LinkedHashSet<>(hashSet);
		for(String name: linkedSet){
			System.out.println("names: " +name);
		}
	}
	
}
