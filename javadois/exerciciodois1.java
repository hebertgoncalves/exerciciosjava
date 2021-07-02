package javadois;

import java.util.Scanner;

public class exerciciodois1 {

	public static void main(String[] args) 
	{
		// três inteiros e seu maior

		int num1, num2, num3, maiordeles = 10;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um num1:");
		num1 = leia.nextInt();//4
		
		System.out.println("\nEntre com um num2:");
		num2 = leia.nextInt();//6
		
		System.out.println("\nEntre com um num3:");
		num3 = leia.nextInt();//10
		
		
		System.out.println(maiordeles);
	    
		System.out.println("\nDiga o maior deles:");
	}

}
