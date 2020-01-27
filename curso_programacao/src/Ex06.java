import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double a,b,c, area;
		
		System.out.println("Valor1:");
		a = sc.nextDouble();
		System.out.println("Valor2:");
		b =sc.nextDouble();
		System.out.println("Valor3:");
		c=sc.nextDouble();
		
		area = (a * c)/2;
		System.out.printf("Triangulo:%.3f\n",area);
		area = ((c*c)* 3.14159);
		System.out.printf("Circulo: %.3f\n",area);
		area = (a+b)*c /2;
		System.out.printf("Trapezio: %.3f\n",area);
		area = b*b;
		System.out.printf("Quadrado: %.3f\n",area);
		area = a*b;
		System.out.printf("Retangulo: %.3f\n",area);


		
	}
}
