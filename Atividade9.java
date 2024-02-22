package Atividade9;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int i;
		String[] nomes = new String[5];
		String nomes2;
		boolean nomeigual = false;
		
		for (i =0; i < nomes.length; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = ler.nextLine();
		}
		
		System.out.println("Digite mais um nome: ");
		nomes2 = ler.nextLine();
		
		ler.close();
		
		for (i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(nomes2)) {
				nomeigual = true;
			}
		}
		if (nomeigual) {
			System.out.println("Nome repetido!");
		} else {
			System.out.println("Nome não foi repetido!");
		}
		
	}

}
