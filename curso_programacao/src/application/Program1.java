package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter data for the retangle:");
		System.out.println("Width:");
		rectangle.width = sc.nextDouble();
		System.out.println("Height:");
		rectangle.height = sc.nextDouble();
		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
	}
}
