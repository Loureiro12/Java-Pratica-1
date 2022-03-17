package Pratica1;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		float averageSpeed;
		float time;
		float km;	
		
		System.out.println("Digite o tempo de viagem: ");
		time = entrance.nextFloat();
		
		System.out.println("Digite a distancia total: ");
		km = entrance.nextFloat();
		
		averageSpeed = km / time;
		
		System.out.println("A velocidade média é " + averageSpeed);
		

	}

}
