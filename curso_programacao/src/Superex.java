import java.util.Scanner;

public class Superex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/**
		 * // ex8 int valor; System.out.println("Digite um valor:"); valor =
		 * sc.nextInt(); if (valor / 2 == 0) { System.out.println("Numero par"); } else
		 * { System.out.println("Numero Impar"); }
		 */

		// questao 3
		/**
		 * int a,b; System.out.println("Valor1:"); a = sc.nextInt();
		 * System.out.println("Valor2:"); b =sc.nextInt();
		 * 
		 * if(a % b == 0 || b % a == 0) { System.out.println("Sao multiplos"); } else {
		 * System.out.println("Nao sao multiplos"); }
		 */
		// ex 4
		/**
		 * System.out.println("Hora inicial"); int valor = sc.nextInt();
		 * System.out.println("Hora final"); int valor2 = sc.nextInt(); int duracao; if
		 * (valor >= valor2) { duracao = 24 - valor + valor2; } else { duracao = valor2
		 * - valor; } System.out.println("Saida"); System.out.println("O jogo durou: " +
		 * duracao + " Horas");
		 * 
		 * sc.close();
		 */

		// ex 5
		/**
		 * System.out.println("Digite um codigo de 1 a 5"); int cod = sc.nextInt();
		 * System.out.println("Digite a quantidade:"); int quant = sc.nextInt(); double
		 * preco = 0.0; if (cod == 1) { preco = 4.0 * quant; } else if (cod == 2) {
		 * preco = 4.50 * quant; } else if (cod == 3) { preco = 5.00 * quant; } else if
		 * (cod == 4) { preco = 2.00 * quant; } else if (cod == 5) { preco = 1.50 *
		 * quant; }
		 * 
		 * System.out.println("Total: R$"+ preco);
		 */

		// ex 6
		/*
		 * System.out.println("Digite um valor:"); int valor = sc.nextInt();
		 * 
		 * if (valor > 0 && valor < 25) {
		 * System.out.println("Esta no intervalo de 0 a 24"); } else if (valor > 25 &&
		 * valor < 50) { System.out.println("Esta no intervalo de 25 a 49"); } else if
		 * (valor > 50 && valor < 75) {
		 * System.out.println("Esta no intervalo de 25 a 49"); } else if (valor > 75 &&
		 * valor <= 100) { System.out.println("Esta no intervalo de 25 a 49"); } else
		 * {System.out.println("Fora do intervalo!");}
		 */
		// ex 7
		/**
		 * double x, y; System.out.println("Digite um num para x:"); x =
		 * sc.nextDouble(); System.out.println("Digite um num para y:"); y =
		 * sc.nextDouble();
		 * 
		 * if (x == 0 && y == 0) { System.out.println("Origem"); } else if (x > 0 && y >
		 * 0) { System.out.println("Q1"); } else if (x < 0 && y > 0) {
		 * System.out.println("Q2"); } else if (x < 0 && y < 0) {
		 * System.out.println("Q3"); } else if (x > 0 && y < 0) {
		 * System.out.println("Q4"); } else if (x == 0 && y < 0 || y > 0) {
		 * System.out.println("Eixo Y"); } else if (y == 0 && x < 0 || x > 0) {
		 * System.out.println("Eixo X"); }
		 */
		// ex 8
		/**
		 * System.out.println("Digite o salario do habitante de Lisarb:"); double
		 * salario = sc.nextDouble(); double imposto = 0;
		 * 
		 * if (salario <= 2000) { imposto = 0.0; } else if (salario <= 3000.0) { imposto
		 * = ((salario - 2000.0) * 0.08); } else if (salario <= 4500) { imposto =
		 * (((salario - 3000.0) * 0.18) + (1000 * 0.08)); } else { imposto = ((salario -
		 * 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08); }
		 * 
		 * if (imposto == 0) { System.out.println("Isento"); } else {
		 * System.out.printf("R$ %.2f%n", imposto); }
		 */

		// ex 9 --while
		/**
		 * System.out.println("Digite sua senha:"); int senha = sc.nextInt(); while
		 * (senha != 2002) { System.out.println("Senha Invalida");
		 * System.out.println("Digite sua senha novamente:"); senha = sc.nextInt(); }
		 * System.out.println("Acesso Permitido");
		 */
		// ex 10
		/**
		 * int x,y; System.out.println("Digite uma cord para x:"); x = sc.nextInt();
		 * System.out.println("Digite uma cord para y:"); y = sc.nextInt(); while(x !=0
		 * || y !=0) { if(x < 0 && y > 0) { System.out.println("Segundo"); }else if(x >
		 * 0 && y > 0) { System.out.println("Primeiro"); } else if(x < 0 && y < 0) {
		 * System.out.println("Terceiro"); } else if(x > 0 && y < 0) {
		 * System.out.println("Quarto"); }else {break;} System.out.println("Digite uma
		 * cord para x:"); x = sc.nextInt(); System.out.println("Digite uma cord para
		 * y:"); y = sc.nextInt(); }
		 */
		// Ex 11
		/**
		 * System.out.println("Digite um cod de 1 a 4:"); int cod = 0; int tipo1 = 0,
		 * tipo2 = 0, tipo3 = 0;
		 * 
		 * while (cod != 4) { System.out.println("1:Alcool");
		 * System.out.println("2:Gasolina"); System.out.println("3:Diesel");
		 * System.out.println("4:Sair"); System.out.println("Sua escolha:"); cod =
		 * sc.nextInt(); if (cod < 1 || cod > 4) { System.out.println("Tente
		 * novamente"); } else { switch (cod) { case 1: tipo1++; break; case 2: tipo2++;
		 * break; case 3: tipo3++; break; case 4: System.out.println("Obrigado!");
		 * System.out.println("Alcool:" + tipo1); System.out.println("Gasolina:" +
		 * tipo2); System.out.println("Diesel:" + tipo3); break; } }
		 * 
		 * }
		 */
		/**
		System.out.println("Num de x que vao ser repetidas");
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		**/
		
	}// fecha main
}