package Calculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcuSencilla 
{

	public static void main(String[] args) 
	{		
		float num1;
		float num2;
		float resul;
				
		BufferedReader Teclado = new BufferedReader (new InputStreamReader (System.in)); 
				
		try 
		{
			System.out.print ("Introduce el primer numero: ");
			num1 = Float.parseFloat(Teclado.readLine());
					
			System.out.print ("Introduce el segundo numero: ");
			num2 = Float.parseFloat(Teclado.readLine());
					
			resul = num1 + num2;
			System.out.printf("1.- SUMA: %1$,.2f + %2$,.2f = %3$,.2f", num1, num2, resul);
					
			resul = num1 - num2;
			System.out.printf("\n2.- RESTA: %1$,.2f - %2$,.2f = %3$,.2f", num1, num2, resul);
					
			resul = num1 * num2;
			System.out.printf("\n3.- PRODUCTO: %1$,.2f * %2$,.2f = %3$,.2f", num1, num2, resul);

			resul = num1 / num2;
			System.out.printf("\n4.- COCIENTE: %1$,.2f / %2$,.2f = %3$,.2f", num1, num2, resul);
		} 
		catch (Exception e) 
		{		
			System.out.print ("AVISO: " + e.getMessage());
		}
	}
}
