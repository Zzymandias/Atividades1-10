package Atividade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		ler.close();
		
		if (valor1 > valor2)
		System.out.println("O primeiro número é maior");
		else if (valor1 < valor2)
		System.out.println("O segundo número é maior");
		else
		System.out.println("Os números são iguais");
	}

}
