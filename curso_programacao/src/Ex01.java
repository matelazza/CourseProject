import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1, valor2, resultado;

		System.out.println("Entrada:");
		System.out.println("Valor 1:");
		valor1 = sc.nextInt();
		System.out.println("Valor 2:");
		valor2 = sc.nextInt();
		resultado = valor1 + valor2;
		System.out.println("Saida:");
		System.out.println("Soma: " + resultado);

	}
}
