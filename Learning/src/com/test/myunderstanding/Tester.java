package com.test.myunderstanding;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	private void test() {
		int i = 0;
		int j = 10;
		while(i <= j) {
			if(i == 5) {
				break;
			}else {
				System.out.println(i);
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Tester test = new Tester();
		test.test();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Ankit", 26));
		System.out.println(emp.get(0).getAge());
	}
}
