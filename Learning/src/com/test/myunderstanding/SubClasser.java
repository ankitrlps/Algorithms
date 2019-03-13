package com.test.myunderstanding;

import java.util.ArrayList;
import java.util.List;

public class SubClasser {

	String namer;
	
	class Sub1{
		List<Employee> listOfEmp = new ArrayList<Employee>();
		public List<Employee> getListOfEmp() {
			return listOfEmp;
		}
		public void setListOfEmp(List<Employee> listOfEmp) {
			listOfEmp.add(new Employee("Ankit", 26));
			this.listOfEmp = listOfEmp;
		}
	}
	
	class Sub2{
		List<Employee> listOfEmp1 = new ArrayList<Employee>();
	}
	
	public static void main(String[] args) {
		SubClasser classer = new SubClasser();
		Sub1 sub1 = classer.new Sub1();
		System.out.println(sub1.listOfEmp);
	}
}
