package com.sunbeam.dsa;

public class EmployeeSearch {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "John", 50000.0),
            new Employee(2, "Alice", 60000.0),
            new Employee(3, "Bob", 55000.0),
            new Employee(4, "Eva", 52000.0)
        };

        int searchEmpId = 2;
        String searchName = "Alice";
        double searchSalary = 60000.0;

        // Search by empId
        for (Employee employee : employees) {
            if (employee.empId == searchEmpId) {
                System.out.println("Employee found by empId: " + employee.name);
                break;
            }
        }

        // Search by name
        for (Employee employee : employees) {
            if (employee.name.equals(searchName)) {
                System.out.println("Employee found by name: " + employee.empId);
                break;
            }
        }

        // Search by salary
        for (Employee employee : employees) {
            if (employee.salary == searchSalary) {
                System.out.println("Employee found by salary: " + employee.empId);
                break;
            }
        }
    }
}

