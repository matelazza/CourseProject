import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	Integer valor;
	System.out.println("Digite um numero:");
	valor = sc.nextInt();
	if(valor < 0 ) {
		System.out.println("Numero Negativo");
	}
	else {
		System.out.println("Numero Positivo");
	}
	}
}
