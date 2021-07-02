package FAMILIA28;

import java.util.Scanner;

public class escolhacaso {
//*pedir para o usuario digitar 1 num de 1 a 12= o mês
	public static void main(String[] args)
	
	{
		float mes; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o numero do mes desejado 1 a 12:");
		mes = leia.nextFloat();
		

		switch(mes)
		{
		case 1:
			System.out.println("\nJANEIRO");
		break;
		
		case 2:
			System.out.println("\nfevereiro");
		break;
		
		case 3:
			System.out.println("\nMARCO");
		break;
			//* VC VAI DIGITAR ATÉ O CASE 12
		default:
			System.out.println("\nEsse mes nao existe");
			
		}

	}

}
