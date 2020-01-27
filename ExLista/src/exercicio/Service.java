package exercicio;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

	private Scanner sc;
	private static List<Employee> list = new ArrayList<>();

	
	public Service() {
		this.sc = new Scanner(System.in);
	}

	void beginService() {
		service();
	}

	public void service() {
		System.out.println("How Many Employeers will be registered?");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Employee #%d: \n", i);
			System.out.print("Id:"); Integer id = sc.nextInt(); sc.nextLine();
			System.out.print("Name:"); String name = sc.nextLine();
			System.out.print("Salary:"); Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase: "); Integer id_Search = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId().equals(id_Search)).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This Id does not exit.");
		}else {
			System.out.print("Enter the percentage: "); Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		for(Employee x : list) {
		System.out.println(x);
		}
	}
	public static List<Employee> getList() {
		return list;
	}

	public static void setList(List<Employee> list) {
		Service.list = list;
	}


}
