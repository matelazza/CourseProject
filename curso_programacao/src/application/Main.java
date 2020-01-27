package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Price");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		product.setName("Computer");
			System.out.println(product.getName());
		
		System.out.println("Product Data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity =sc.nextInt();
		product.addProduct(quantity);
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		System.out.println("Updated Data: " + product);

		

	}

}
