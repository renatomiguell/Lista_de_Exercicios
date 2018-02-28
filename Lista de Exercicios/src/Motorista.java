// 5º Questão

import java.util.Scanner;
import java.text.NumberFormat;

public class Motorista {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		double qtd_litros, qtd_refri, soma_gasolina, soma_refri;
		double refri = 3.00;
		double gasolina = 2.50;
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
				
		System.out.println("Informe a quantidade de gasolina em litros(Ex: 2,00): ");
		qtd_litros = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de refrigerantes consumidos: ");
		qtd_refri = entrada2.nextDouble();
		
		System.out.println("Valor total da conta: " + moeda.format((qtd_litros*gasolina)+(qtd_refri*refri)));	
	}

}
