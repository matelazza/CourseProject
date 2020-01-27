import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, resultado;
		System.out.println("Entrada:");
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();
		System.out.println("C:");
		c = sc.nextInt();
		System.out.println("D:");
		d = sc.nextInt();
		resultado = (a*b - c*d);
		
		System.out.println("Saida:");
		System.out.println("Diferença = " + resultado);
		
	}
}
