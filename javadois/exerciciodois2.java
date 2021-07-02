package javadois;

import java.util.Scanner;

public class exerciciodois2 {

	public static void main(String[] args)
	{
		// tres numeros em ordem crescente
		
		int A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a A:");
		A = leia.nextInt();

		System.out.println("\nEntre com a B:");
		B = leia.nextInt();
		
		System.out.println("\nEntre com a C:");
		C = leia.nextInt();
		
	if (A<=B && B<=C)
	{
		System.out.println("\nOrdem crescente: "+A+", "+B+" e "+C);
	}
	}

}
