package Pratica1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		String frase;
		int i;
		int contador = 0;
		int contadorVogal = 0;
		char verificador;
		String teste;
		
		System.out.println( "Digite uma frase: ");
		frase = entrance.next();
		

	
		for(i = 0; i <= frase.length(); contador++) { 
			verificador = frase.charAt(contador);
			
			teste = String.valueOf(verificador);
			System.out.println(teste);
			if(verificador == 'a' || verificador == 'e' || verificador == 'i' || verificador == 'o' || verificador == 'u') {
				contadorVogal++;
			}
		}
		
		System.out.println(contadorVogal);
	}

}
