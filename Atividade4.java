package Atividade4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int cont, c, tab;
		
		System.out.println("Digite um número: ");
		cont = ler.nextInt();
		ler.close();
		
		for (c = 1; c < 11; c++) {
			tab = cont * c;
		
		System.out.println( cont + " X " + c + ": " + tab);
		}
	}

}
