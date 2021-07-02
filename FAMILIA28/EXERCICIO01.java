package FAMILIA28;

import java.util.Scanner;
//*sistema de equacao lineares do tipo:
public class EXERCICIO01 {

	public static void main(String[] args) 
	{

float a,b,c,d,e,f,x,y;

Scanner leitura = new Scanner(System.in);

System.out.println("\nEntre com o A: ");
a =  leitura.nextFloat();
System.out.println("\nEntre com o B: ");
b =  leitura.nextFloat();
System.out.println("\nEntre com o C: ");
c =  leitura.nextFloat();
System.out.println("\nEntre com o D: ");
d =  leitura.nextFloat();
System.out.println("\nEntre com o E: ");
e =  leitura.nextFloat();
System.out.println("\nEntre com o F: ");
f =  leitura.nextFloat();

x = (c*e - b*f) / (a*e - b*d);
y = (a*f - c*d) / (a*e - b*d);

System.out.println("\nValor de X: "+x);
System.out.println("\nValor de Y: "+y);




	}

}
