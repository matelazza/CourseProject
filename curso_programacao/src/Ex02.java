import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio,pi,area;
		pi = 3.14159;
		
		System.out.println("Calculo de Area");
		System.out.println("Raio:");
		raio = sc.nextDouble();
		area = pi * (raio*raio);
		System.out.println("Saida:");
		System.out.printf("A= %.4f", area);
	}
}
