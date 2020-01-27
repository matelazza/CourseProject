import java.util.Locale;
import java.util.Scanner;

public class Funcao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		showResult(higher);
	}

	public static int max(int a, int b, int c) {
		int aux = 0;
		if (a > b && a > c) {
			aux = a;
		} else if (b > a && b > c) {
			aux = b;
		}else if(c > a && c > b) {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int x) {
		System.out.println("Higher Value: " + x);
	}
}
