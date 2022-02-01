package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered ?");
		int employees = sc.nextInt();
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		for(int i=0; i < employees; i++) {
			System.out.println("Employee #" + i+1 +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
		
			Employee emp = new Employee(id, name, salary);
			
			listEmployee.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		
		
		sc.close();
	}

}
