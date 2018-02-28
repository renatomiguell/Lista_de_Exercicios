// 1º Questão

import java.util.Scanner;
import java.text.NumberFormat;

public class PercentualDeAumento {
	private static Scanner entrada;

	public static void main(String args[]){
		entrada = new Scanner(System.in);
		
		double salario, porcen;
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		
		System.out.println("Informe o salário do funcionário: ");
		salario = entrada.nextDouble();
		
		System.out.println("Informe o percentual de aumento: ");
		porcen = entrada.nextDouble();
		
		System.out.printf("O novo salário é: " + moeda.format(salario*(1+porcen/100)));
	}

}
