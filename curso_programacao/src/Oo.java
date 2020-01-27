import java.util.Locale;
import java.util.Scanner;

public class Oo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double area = area(x,y,z);
		System.out.println(area);
		
	}
	
	public static double area(double x,double y, double z) {
		double p = (x+y+z)/2;
		double area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
		return area;
	}
}
