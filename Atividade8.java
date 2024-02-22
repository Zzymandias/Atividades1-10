package Ativivade8;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int soma = 0, num, impar = 1;
		
		System.out.println("Digite um número.");
		num = ler.nextInt();
		ler.close();
		
		for (int i = 0; i < num; i++) {
			soma = soma + impar;
			impar = impar + 2;
				
		}
		
		System.out.println("A soma dos primeiros " + num + " ímpares é: " + soma);
		
	}

}
