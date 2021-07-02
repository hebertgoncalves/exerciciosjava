package FAMILIA28;

import java.util.Scanner;
//* determine os positivos e negativos 
public class positivosnegativos {

	public static void main(String[] args)
	{
		float num;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero:");
		num = leia.nextFloat();//0
		
		if(num>0)
		{
			System.out.println("\n"+num+" é positivo");
		}
		else if(num<0)
		System.out.println("\n"+num+" é negativo");
		{
	    else
		}
		System.out.println("\n"+num+" é zero");
	}
}
