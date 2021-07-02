package FAMILIA28;

import java.util.Scanner;

public class exercicio03 {
//*faca um sistema que leia 3 notas de um aluno e calcule a media final deste aluno
	public static void main(String[] args) 
	{

		float nota1,nota2,nota3,media;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("\nEntre com a nota1");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota2");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota3");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("(nota1 + nota2 + nota3)/3");
		System.out.println("\nA media das notas é:");
		
				
		
	}

}
