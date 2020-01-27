import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, carga;
		double salario;

		System.out.println("Entrada:");
		System.out.println("Numero De Funcionario:");
		num = sc.nextInt();
		System.out.println("Carga Horaria:");
		carga = sc.nextInt();
		System.out.println("Salario p/h:");
		salario = sc.nextDouble();
		salario = carga * salario;
		System.out.println("U$"+ salario);
	
		
	}
}
