package Atividade5;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		ler.close();
		
		if (num % 2 == 0) {
			System.out.println("Número digitado é par.");
		} else { 
			System.out.println("Número digitado é impar.");
		}
	}

}
