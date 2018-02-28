// 6º Questão

import java.util.Scanner;
import java.text.NumberFormat;

public class LinhaDeCredito {
	public static void main(String args[]){
		double emprestimo, prestacao, salario_bruto;
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Informe o valor da prestação desejada: ");		
		prestacao = entrada.nextDouble();
		
		System.out.println("Informe o seu salario bruto: ");
		salario_bruto = entrada2.nextDouble();
		
		emprestimo = (salario_bruto*(1+30/100));
		
		if (prestacao <= emprestimo) {
			System.out.println("Emprestimo concedido!");
			System.out.println("Valor da prestacao: " + moeda.format(prestacao));
		}else
			System.out.println("Emprestimo não concedido! Valor da prestacao ultrapassa 30% do salario bruto.");
	}

}