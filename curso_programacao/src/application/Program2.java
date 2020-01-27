package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee employee = new Employee();

		System.out.printf("Name:");
		employee.name = sc.nextLine();
		System.out.println();
		System.out.printf("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println();
		System.out.printf("Tax:");
		employee.tax = sc.nextDouble();
		System.out.println();

		System.out.println("Employee: " + employee);

		System.out.println("Wich percentage to increase salary?");
		double percentage = sc.nextDouble();

		employee.increaseSalary(percentage);
		System.out.println("Updated Data: " + employee);

	}
}
