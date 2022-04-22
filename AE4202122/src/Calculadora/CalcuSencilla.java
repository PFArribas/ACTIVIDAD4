package Calculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//
// Version2: Con comentarios y con metodos
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
			resul = Suma(num1, num2);
			MuestaResultado(num1, num2, resul, "SUMA", "+");
			
			// los restamos y se muestra el resultado
			resul = Resta(num1, num2);
			MuestaResultado(num1, num2, resul, "RESTA", "-");
			
			// los multiplicamos y se muestra el resultado
			resul = Producto(num1, num2);
			MuestaResultado(num1, num2, resul, "PRODUCTO", "*");

			// los dividimos y se muestra el resultado
			resul = Division(num1, num2);
			MuestaResultado(num1, num2, resul, "DIVISION", "/");

		} 
		catch (Exception e) 
		{		
			System.out.print ("AVISO: " + e.getMessage());
		}
	}

	// Metodo para mostrar el resultado
	private static void MuestaResultado(float num1, float num2, float resul, String operacion, String simbolo) {
		System.out.printf("- " + operacion +": %1$,.2f "+ simbolo +" %2$,.2f = %3$,.2f\n", num1, num2, resul);
	}

	// Metodo para la division
	private static float Division(float num1, float num2) {
		float resul;
		resul = num1 / num2;
		return resul;
	}

	// Metodo para el producto
	private static float Producto(float num1, float num2) {
		float resul;
		resul = num1 * num2;
		return resul;
	}

	// Metodo para la resta
	private static float Resta(float num1, float num2) 
	{
		float resul;
		resul = num1 - num2;
		return resul;
	}

	// Metodo para la suma
	private static float Suma(float num1, float num2) 
	{
		float resul;
		resul = num1 + num2;
		return resul;
	}
}

