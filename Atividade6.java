package Atividade6;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int i, num, fat = 1;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		ler.close();
		
		for (i=1; i <= num; i++) {
			fat = fat*i;
		}
		System.out.println("O fatorial de " + num + " é: " + fat);
	}

}
