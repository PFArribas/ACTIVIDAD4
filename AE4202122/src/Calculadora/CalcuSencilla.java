package Calculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//
// Versi01: Con comentarios y sin metodos
//

public class CalcuSencilla 
{

	public static void main(String[] args) 
	{
		// Declaraciones
		float num1;
		float num2;
		float resul;
		
		BufferedReader Teclado = new BufferedReader (new InputStreamReader (System.in)); 
		
		// Control excepciones
		try 
		{
			// Solicitamos los numeros
			System.out.print ("Introduce el primer numero: ");
			num1 = Float.parseFloat(Teclado.readLine());
			
			System.out.print ("Introduce el segundo numero: ");
			num2 = Float.parseFloat(Teclado.readLine());
			
			// los sumamos y se muestra el resultado
			resul = num1 + num2;
			System.out.printf("1.- SUMA: %1$,.2f + %2$,.2f = %3$,.2f", num1, num2, resul);
			
			// los restamos y se muestra el resultado
			resul = num1 - num2;
			System.out.printf("\n2.- RESTA: %1$,.2f - %2$,.2f = %3$,.2f", num1, num2, resul);
			
			// los multiplicamos y se muestra el resultado
			resul = num1 * num2;
			System.out.printf("\n3.- PRODUCTO: %1$,.2f * %2$,.2f = %3$,.2f", num1, num2, resul);

			// los dividimos y se muestra el resultado
			resul = num1 / num2;
			System.out.printf("\n4.- COCIENTE: %1$,.2f / %2$,.2f = %3$,.2f", num1, num2, resul);

		} 
		catch (Exception e) 
		{		
			System.out.print ("AVISO: " + e.getMessage());
		}
	}
}

