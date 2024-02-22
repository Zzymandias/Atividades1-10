package Atividade3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int base, altura, cont;
		String menu = """
				***************************
                Entre com uma das opções:
                1 - Calcular área do quadrado;
                2 - Calcular área do círculo;
                ***************************
                """;
		
		System.out.println("Digite a base: ");
		base = ler.nextInt();	
		
		System.out.println("Digite a altura ou raio: ");
		altura = ler.nextInt();
		
		System.out.println(menu);
        cont = ler.nextInt();
        ler.close();
        		
		if (cont == 1)
		System.out.println("O resultado é: " + (base * altura));
		else if (cont == 2)
		System.out.println("O resultado é: " + (3.14 * (altura * altura)));
		else 
		System.out.println("Número inválido");
	}

}
