// 8º Questão

import java.util.Scanner;
import java.text.NumberFormat;

public class Pousada {
	private static Scanner nome;
	private static Scanner entrada;
	private static Scanner entrada2;

	public static void main(String args[]){
		entrada = new Scanner(System.in);
		entrada2 = new Scanner(System.in);
		
		int qtd_dias;
		double diaria = 40.00;
		boolean verdadeiro = true;
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		
		while (verdadeiro) {
			System.out.println("Informe o nome: ");
			String nome = entrada2.nextLine();
			
			System.out.println("Informe a quantidade de dias na Pousada: ");
			qtd_dias = entrada.nextInt();
			
			if (qtd_dias < 10) {
				System.out.printf("O valor total da conta é: " + moeda.format(diaria+(qtd_dias*15.00)) + "\n\n");
			}
			if (qtd_dias >= 10) {
				System.out.printf("O valor total da conta é: " + moeda.format(diaria+(qtd_dias*8.00)) + "\n\n");
			}
		
		}
	}

}
