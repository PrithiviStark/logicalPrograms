package com.qspiders.tactical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	
	private String name;
	
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}


public class StreamPractice {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				 new Employee("PK",2200),
				 new Employee("JK",2300),
				 new Employee("AK",2100),
				 new Employee("VK",2500),
				 new Employee("OK",2340)
				);
		
		 int[] listed= {8,6,7,9,5,4,1,2,3,6};
		
		Stream<Employee> s=empList.stream();
		
		double salarytotal=s.filter((a)-> (a.getSalary())>2300).mapToDouble(Employee :: getSalary).sum();
		System.out.println("salarytotal : "+salarytotal);
		
		
		int[] sorted=Arrays.stream(listed).sorted().toArray();
		
		int[] revSorted= Arrays.stream(listed)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
		
		for (int i = 0; i < listed.length; i++) {
			System.out.print(revSorted[i]+",");
		}
		
	}

}
