// 4º Questão

import java.util.Scanner;
import java.text.NumberFormat;

public class SalarioDosFuncionarios {

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		double salario;
		boolean verdadeiro = true;
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		
		while (verdadeiro) {
			System.out.println("Informe o nome do funcionário: ");
			String opcao = entrada2.nextLine();
			
			if (opcao != "fim") {
				System.out.println("Informe o salário de " + opcao + ":");
				salario = entrada.nextDouble();
				
				if (salario < 500) {
					System.out.printf("O novo salário é: " + moeda.format(salario+(salario*0.2)) + "\n\n");
				}else
					System.out.printf("Você não tem direito ao aumento.\n\n");
			}else
				break;
		
		}
	}
}

