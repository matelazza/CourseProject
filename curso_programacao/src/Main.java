import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ola Mundo!");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/**
		 * int minutos;
		 * 
		 * System.out.println("Digite a quantidade de minutos consumidas:"); minutos =
		 * sc.nextInt(); double total = 50.00; if (minutos <= 100) {
		 * System.out.println("Total a ser pago R$%" + total); } else { total +=
		 * (minutos - 100) * 2 ; System.out.println("Total a ser pago com taxa: R$" +
		 * total); }
		 **/
		/**
		 * System.out.println("Digite um numero de 1 a 7:"); int x = sc.nextInt();
		 * String dia = "";
		 * 
		 * switch (x) { case 1: dia = "Domingo"; break; case 2: dia = "Segunda"; break;
		 * case 3: dia = "Terça"; break; case 4: dia = "Quarta"; break; case 5: dia =
		 * "Quinta"; break; case 6: dia = "Sexta"; break; case 7: dia = "Sabado"; break;
		 * default: System.out.println("Invalido!"); } System.out.println(dia);
		 */

		/*
		 * -- Expressão condicional ternaria double preco = 34.5; double desconto =
		 * (preco < 20.0) ? preco * 0.01: preco * 0.05 ;
		 * System.out.printf("O total de desconto para R$%.2f é R$2%.2f",preco,desconto)
		 * ;
		 */
		
		/** Teste DEBUG
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	*/
		
		int x = sc.nextInt();
		int soma = 0;
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("Saiu");
		System.out.println(soma);
		
	}
}
