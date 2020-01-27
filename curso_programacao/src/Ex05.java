import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peca1,npeca;
		int peca2, npeca2;
		double preco, uni1,uni2, resultado;
		
		System.out.println("Digite o codigo da peca 1");
		peca1 = sc.nextInt();
		System.out.println("Digite a quantidade da peca 1");
		npeca = sc.nextInt();
		System.out.println("Valor unitario peca 1:");
		uni1 = sc.nextDouble();
		
		System.out.println("Digite o codigo da peca 2");
		peca2 = sc.nextInt();
		System.out.println("Digite a quantidade da peca 2");
		npeca2 = sc.nextInt();
		System.out.println("Valor unitario peca 2:");
		uni2 = sc.nextDouble();
		resultado = (double) (npeca * uni1) + (npeca2 * uni2);
		System.out.println("Saida:");
		System.out.printf("Valor a pagar: R$ %.2f",resultado);
	}
}
