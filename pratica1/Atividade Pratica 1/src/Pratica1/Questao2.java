package Pratica1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
//		int contador;
		
		String placaCarro;
		String novaPlaca;
		String vogal;
		int anoDeFabricacao;
		
		System.out.println("Digite a placa do veiculo: ");
		placaCarro = entrance.next();
		
		System.out.println("Digite o ano de fabricacao do veiculo: ");
		anoDeFabricacao = entrance.nextInt();
		
		if(anoDeFabricacao <= 2010 && anoDeFabricacao >= 1886) {
			System.out.println("Carro velho");
		} else if (anoDeFabricacao >= 2010 && anoDeFabricacao < 2021) {
			System.out.println("Carro Semi novo");
		} else if (anoDeFabricacao == 2021) { 
			System.out.println("Carro novo");
		} else if (anoDeFabricacao < 1886) {
			System.out.println("Ano de fabricacao invalido!");
		} 
	
		
//		if(placaCarro.length() > 7 || placaCarro.length() < 0) {
//			System.out.println("Placa do veiculo está incorreta!");
//		} else {   
//			for(contador = 1; contador <= 7; contador++) {
//				vogal = placaCarro.substring(1);
//				novaPlaca = placaCarro.replaceAll(vogal, "*");
//				System.out.println(vogal);
//			}
//		}
		
		
	}

}
