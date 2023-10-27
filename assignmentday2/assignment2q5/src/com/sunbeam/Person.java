package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
	private int id;
	private String name;
	private double salary;
	
	Person(){
		
	}

	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
//	public static int searchByName(Person arr[] , String key) {
//		 
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].getName().equalsIgnoreCase(key)) {
//				return i;
//				
//			}
//		   	
//	}
	
//	public static int searchById(Person arr1 [] , int key) {
//		for (int i= 0; i< arr1.length; i++) {
//			if(arr1[i].getId() == key) {
//				return i;
//				
//			}
//			
//		}
	
//	public static double searchBySalary(Person arr2[] , double key) {
//		for (int i =0; i <arr2.length; i++) {
//			if(arr2[i].getSalary() == key) {
//				return i;
//			}
//		}
//		
//		
//		return -1;
//	}	
	
public static void selectionSort(Person arr[] , int n) {
		
		for (int i= 0; i < n -1; i++) {
			for (int j=i+1; j<n; j++) {
				if(arr[i].getSalary()> arr[j].getSalary()) {
			
				Person temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				}	
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		Person [] arr =  {
				
			new Person (1 , "shubh" , 45688),
			new Person (2 , "bhanu" , 34567),
			new Person (3 , "gaurav" , 98765),
			new Person (4 , "paduman" , 45676),
			new Person (5 , "nishi" , 56876),
						
		};
	
System.out.println("before sort :" + Arrays.toString(arr));
		
		selectionSort(arr, arr.length);
		
		for (Person p : arr) {
			System.out.println(p);
		}
			
		}
	
	
}
