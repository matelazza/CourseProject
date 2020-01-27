import java.util.Locale;
import java.util.Scanner;

public class OperacaoString {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String original =  "abcde FGHIJ ABC abc DEFG";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2,9);
		String s6 = original.replace('a', 'X');
		String s7 = original.replace("abc", "xy");
		String s8 = original;
		int i = original.indexOf("bc");
		int j =original.lastIndexOf("bc");
		
		System.out.println("Original : -" + original +"-");
		System.out.println("toLowerCase : -" + s1 + "-");
		System.out.println("toUpperCase : -" + s2 + "-");
		System.out.println("trim : -" + s3 + "-");
		System.out.println("Substring(2) : -" + s4 + "-");
		System.out.println("Substring(2,9) : -" + s5 + "-");
		System.out.println("Replace(a,X) : -" + s6 + "-");
		System.out.println("Replace(abc,xy) : -" + s7 + "-");
		System.out.println("Substring : -" + s8 + "-");
		
		System.out.println("Index of bc:" + i);
		System.out.println("Last Index of bc:" + j);
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
	}
}
