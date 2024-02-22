package Atividade10;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String senha = "Java";
		
		System.out.print("Digite a senha: ");
        String senha1 = ler.nextLine();
        ler.close();
        
        while(!senha1.equals(senha)) {
        	System.out.println("Senha errada. Tente novamente.");
        	System.out.print("Digite a senha: ");
        	senha1 = ler.nextLine();
        }
        
        System.out.println("Senha correta.");
		
	}

}
