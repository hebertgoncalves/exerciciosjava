package javadois;

import java.util.Scanner;

public class exerciciojavadois3 {

	public static void main(String[] args)
	{
		// idade e categoria

		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade:");
		idade = leia.nextInt();
		
	if(idade>=10 && idade<=14)
	{
	
	System.out.println("\nCategoria Infantil:");
	}
	else if(idade>=15 && idade<=17)
	{
		System.out.println("\nCategoria Juvenil:");
	}
	else if(idade>=18 && idade<=25)
	{
		System.out.println("\nCategoria Adulto:");
	}
	else 
	{
		System.out.println("\nNão há categoria:");
	}
	}
	
}
