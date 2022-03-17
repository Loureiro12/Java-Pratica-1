package Pratica1;

import java.util.Scanner;
import java.util.Random;

public class Questao4 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int cpf;
		String name;
		int DataVoo;
		int horario;
		int numeroVoo;
		
		System.out.println("1 - Cadastrar Passageiro\n"
				+ "2 - Check in\n"
				+ "3 - Cancelar Voo\n"
				+ "4 - Sair");
		
		System.out.println("Escolha uma das opcoes a cima: ");
		opcao = entrance.nextInt();
		
		switch(opcao) {
		  case 1:
		   System.out.println("Digite seu o nome do passageiro: ");
		   name = entrance.next();
		   System.out.println("Digite o CPF do passageiro: ");
		   cpf = entrance.nextInt();
		   System.out.println("Digite a data do voo: ");
		   DataVoo = entrance.nextInt();
		   System.out.println("Digite o hórario do voo: ");
		   horario = entrance.nextInt();
		   
		   System.out.println("Cadastro Efetuado com Sucesso, seu númeor do voo é " + gerador.nextInt(4) + ".");
		    break;
		  case 2:
			System.out.println("Digite o CPF do passageiro: ");
			cpf = entrance.nextInt();
			System.out.println("Digite o número do voo: ");
			numeroVoo = entrance.nextInt();
			
			System.out.println("Check in realizado com sucesso.");
			  
		    break;
		  case 3:
			System.out.println("Digite o CPF do passageiro: ");
			cpf = entrance.nextInt();
			System.out.println("Digite o número do voo: ");
			numeroVoo = entrance.nextInt();
				
			System.out.println("Voo Cancelado com sucesso.");
			
			break;
			
		  case 4:
				break;
		  default:
		
		}

	}

}
