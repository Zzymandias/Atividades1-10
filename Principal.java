package Atividade1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite o valor: ");
		valor = ler.nextInt();
		ler.close();
		
		if (valor >= 0)
		System.out.println("O número digitado é positivo");
		else
		System.out.println("O número digitado é negativo");
		}	
	}


