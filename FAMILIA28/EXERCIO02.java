package FAMILIA28;

import java.util.Scanner;

public class EXERCIO02 {
	
//*faca um sistema que leia a idade de uma pessoa em anos, meses e dias e mostre a expressa em dias
	public static void main(String[] args) 
	{

		float totaldias, meses, dias, anos;
	
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nQuantos anos voce tem?: ");
		anos= leia.nextFloat();
		System.out.println("\nQuantos meses voce tem?: ");
		meses= leia.nextFloat();
		System.out.println("\nQuantos dias voce tem?: ");
		dias= leia.nextFloat();
		
		float totaldedias = (dias=(anos*365)+(meses*30));
		
		System.out.println("\nSeu tota de dias vividos é: ");
	}

}
