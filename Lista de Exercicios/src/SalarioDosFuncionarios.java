// 4� Quest�o

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
			System.out.println("Informe o nome do funcion�rio: ");
			String opcao = entrada2.nextLine();
			
			if (opcao != "fim") {
				System.out.println("Informe o sal�rio de " + opcao + ":");
				salario = entrada.nextDouble();
				
				if (salario < 500) {
					System.out.printf("O novo sal�rio �: " + moeda.format(salario+(salario*0.2)) + "\n\n");
				}else
					System.out.printf("Voc� n�o tem direito ao aumento.\n\n");
			}else
				break;
		
		}
	}
}

