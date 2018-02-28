// 3º Questão

import java.util.Scanner;

public class Tabuada {
	private static Scanner entrada;

	public static void main(String args[]){
		int numero, n;
		
		entrada = new Scanner(System.in);
		
		System.out.println("Informe um número (de 1 a 10) para obter a tabuada: ");
		numero = entrada.nextInt();
		
		if (numero <= 10) {
			for(n = 1; n <= 1; n++) {
				System.out.println("Tabuado do numero [" + numero + "]:");
				System.out.println("1 x "+ numero + " = " + 1*numero);
				System.out.println("2 x "+ numero + " = " + 2*numero);
				System.out.println("3 x "+ numero + " = " + 3*numero);
				System.out.println("4 x "+ numero + " = " + 4*numero);
				System.out.println("5 x "+ numero + " = " + 5*numero);
				System.out.println("6 x "+ numero + " = " + 6*numero);
				System.out.println("7 x "+ numero + " = " + 7*numero);
				System.out.println("8 x "+ numero + " = " + 8*numero);
				System.out.println("9 x "+ numero + " = " + 9*numero);
				System.out.println("10 x "+ numero + " = " + 10*numero);
			}
		}
		
	}

}
