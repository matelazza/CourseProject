package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Service service = new Service();
		service.beginService();
		
	}
	
}
