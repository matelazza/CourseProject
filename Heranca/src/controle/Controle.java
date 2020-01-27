package controle;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Classe utilizando abstração de metodos. 
 * Isso faz com que as classes filhas tenham que codificar cada um destes
 *  metodos definidos. Ou torne a classe filha asgtrata também e
 *   codifique apenas os necessarios.**/

public abstract class Controle {
	
	protected static Scanner ler;
	
	public abstract void cadastrar();
	public abstract void alterar();
	public abstract void excluir();
	public abstract void listar();
	/*
	 * Desenvolver a rotina que lista os dados
	 * em um arquivo com o nome exemplo.txt
	 */
	
	public abstract void relatorio();
	
	
	public Controle() {
		this.ler = new Scanner(System.in);
	}
	
	public static String perguntaTexto(String texto) {
		System.out.println(texto);
		texto = ler.nextLine();
		return texto;
	}
	public static Integer perguntaInteger(String texto) {
		System.out.println(texto);
		Integer num = Integer.parseInt(texto);
		return num;
	}
	public static Double perguntaDouble(String texto) {
		System.out.println(texto);
		Double num = Double.parseDouble(texto);
		return num;
	}
	public static Long perguntaLong(String texto) {
		System.out.println(texto);
		Long num = Long.parseLong(texto);
		return num;
	}
	
	public static Date perguntaData(String texto) {
		System.out.println(texto);
		try {
			String data = ler.nextLine();
			SimpleDateFormat sdf =  new SimpleDateFormat("dd/mm/yyyy");	
			return sdf.parse(data);
			}
		catch(Exception e) {
			System.out.println("Data Invalida!");
			return perguntaData(texto);
		}
		}
			
	}


