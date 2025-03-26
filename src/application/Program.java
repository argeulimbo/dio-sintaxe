package application;
import java.util.Scanner;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		Locale.setDefault(Locale.US);
		ContaBanco contaBanco = new ContaBanco(1021, "MARIO ANDRADE", 237.48);
		
		System.out.println("Por favor, digite o número da Agência!");
		String nAgencia = sc.next();
		contaBanco.setAgencia(nAgencia);
		
		System.out.println(contaBanco.toString());
		sc.close();
	}

}
