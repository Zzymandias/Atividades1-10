package Atividade7;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual sua idade?");
		idade = ler.nextInt();
		ler.close();
		
		if (idade >= 18 && idade < 60) {
			System.out.println("Maior de idade.");
		}
		else if (idade >= 60) {
			System.out.println("Idoso");
		}
		else {
			System.out.println("Menor de idade");
		}
	}

}
