package com.sunbeam;

import java.util.Scanner;

public class Main {
	public static int menu(Scanner scan) {
		int choice = 0;

		System.out.println("--> Menu : \n" + "0. Exit\n" + "i. Add Employee\n" + "ii. Display all employees\n"
				+ "iii. Search employee by name\n" + "iv. Delete employee by empid\n" + "v. Update salary of employee");
		System.out.print("--> Enter your choice : ");
		choice = scan.nextInt();

		return choice;
	}

	public static void main(String[] args) {
		List list = new List();
		int choice;
		Scanner scan = new Scanner(System.in);

		while ((choice = menu(scan)) != 0) {
			switch (choice) {
			case 1: // add employee
				System.out.print("Enter Emp Id : ");
				int empid = scan.nextInt();
				System.out.print("Enter Emp Name : ");
				String name = scan.next();
				System.out.print("Enter Emp Salary : ");
				double salary = scan.nextDouble();
				Employee emp = new Employee(empid, name, salary);
				list.addLast(emp);
				break;
			case 2:// display
				list.display();
				break;
			case 3:// search by empid
				System.out.print("Enter Empid to search : ");
				empid = scan.nextInt();
				Employee emp1 = list.search(empid);
				System.out.println(emp1);
				break;
			case 4:// delete by empid
				System.out.print("Enter Empid to be deleted : ");
				empid = scan.nextInt();
				list.delete(empid);
				System.out.println("Successfully deleted");
				break;
			case 5:// update salary of employee
				System.out.print("Enter Empid && salary to be updated : ");
				empid = scan.nextInt();
				double sal = scan.nextDouble();
				list.update(empid, sal);
				System.out.println("Successfully Updated!!");
				break;
			default:
				System.out.println("Invalid choice...Try again");
				break;
			}
		}
		System.out.println("Thank you using the application!!");

	}

}
