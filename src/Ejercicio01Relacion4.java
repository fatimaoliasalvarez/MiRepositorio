/*
 * Programa que usa un método llamado solicitarNumeroEnRango.
 * El método devuelve un entero y tendrá como parámetros de entrada: 
 * 		límite inferior
 * 		límite superior
 * El método solicitará un número comprendido entre esos dos valores y lo devolverá.
 * Si el límite inferior es mayor al limite superior, los intercambia.
 * 
 * */

import java.util.Scanner;

public class Ejercicio01Relacion4 {
	static Scanner teclado=new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Variables.nuevo
		int numero;
		int limiteInferior;
		int limiteSuperior;
		
		System.out.println("Introduce el límite inferior: ");
		limiteInferior = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el límite superior: ");
		limiteSuperior = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce un numero:");
		numero = Ejercicio01Relacion4.solicitarNumeroEnRango (limiteInferior, limiteSuperior);
	
		System.out.println("El número es: " + numero);
	}

	/**
	 * Solicita por teclado un dato númerico, volviendolo a solicitar si no está comprendido entre el limite inferior y superior
	 * @param limiteInf 
	 * @param limiteSup
	 * @return dato númerico comprendido entre limiteinf y limiteSup
	 */
	public static int solicitarNumeroEnRango(int limiteInf, int limiteSup) {
		int numero;
		int auxiliar;
		
		// Si el límite inferior es mayor que el límite superior, se intercambian
		if(limiteInf > limiteSup){
			auxiliar = limiteInf;
			limiteInf = limiteSup;
			limiteSup = auxiliar;
		}
		
		do{
			
			numero = Integer.parseInt(teclado.nextLine());	
		}while(numero < limiteInf || numero > limiteSup);
		
		return numero;
	}
}
