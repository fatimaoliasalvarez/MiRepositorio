/**
 * Programa con un método llamado pintarNuevaHora al que se le pasen 4 parámetros enteros:
 * horaActual
 * minutosActuales
 * segundosActuales
 * segundosASumar
 * El método no devuelve nada y debe mostrar dos mensajes:
 * La hora anterior era H: M: S
 * La nueva hora es H: M: S
 * 
 */


import java.util.Scanner;

public class Ejercicio05Relacion4 {

	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Variables
		int horaActual;
		int minutosActuales;
		int segundosActuales;
		int segundosASumar;
		
		// Se solicita la hora actual
		horaActual = Ejercicio01Relacion4.solicitarNumeroEnRango(0, 23);
		minutosActuales = Ejercicio05Relacion4.solicitarMinutos();
		segundosActuales = Ejercicio05Relacion4.solicitarSegundos();
		
		//Se solicita el número de segundos para calcular la nueva hora
		segundosASumar = Ejercicio05Relacion4.solicitarSegundosASumar();
		
		pintarNuevaHora(horaActual, minutosActuales, segundosActuales, segundosASumar);
	}

	
	private static int solicitarHora(){
		int horaActual;
		
		do{
			System.out.println("Introduce la hora actual: ");
			horaActual = Integer.parseInt(teclado.nextLine());
		}while(horaActual<0 || horaActual>23);
		
		return horaActual;		
	}
	
	/**
	 * Método que solicita unos minutos y comprueba que su valor está entre 0 y 59
	 * @return minutos actuales entre 0 y 59
	 */
	private static int solicitarMinutos(){
		int minutosActuales;
		
		do{
			System.out.println("Introduce los minutos: ");
			minutosActuales = Integer.parseInt(teclado.nextLine());			
		}while(minutosActuales<0 || minutosActuales>59);
		
		return minutosActuales;		
	}
	
	/**
	 * Método que solicita los segundos y comprueba que su valor está entre 0 y 59
	 * @return segundos actuales entre 0 y 59
	 */
	private static int solicitarSegundos() {
		int segundosActuales;
		
		do{
			System.out.println("Introduce los segundos: ");
			segundosActuales = Integer.parseInt(teclado.nextLine());
		}while(segundosActuales<0 || segundosActuales>59);
		
		return segundosActuales;
	}
	
	/**
	 * Método que solicita la cantidad de segundos para calcular la nueva hora
	 * @return la cantidad de segundos para calcular la nueva hora
	 */
	private static int solicitarSegundosASumar() {
		int segundosASumar;
		
		System.out.println("Introduce los segundos a sumar: ");
		segundosASumar = Integer.parseInt(teclado.nextLine());
		
		return segundosASumar;
	}
	
	/**
	 * Método que pinta una hora incrementada tantos segundos como se indican
	 * @param horaActual entre 0 y 23
	 * @param minutosActuales entre 1 y 59
	 * @param segundosActuales entre 1 y 59
	 * @param segundosASumar 
	 */
	private static void pintarNuevaHora(int horaActual, int minutosActuales, int segundosActuales, int segundosASumar)
	{
		int horaNueva;
		int minutosNuevos;
		int segundosNuevos;
		int segundosTotales;
		
		System.out.println("La hora anterior era: " + horaActual + ":" + minutosActuales + ":" + segundosActuales);
		
		// Se calculan los segundos de la hora nueva
		segundosTotales = horaActual * 3600 + minutosActuales * 60 + segundosActuales + segundosASumar;
	
		// En el caso de que los segundos a sumar sean negativos, es decir, 
		// que se atrase el reloj
		if (segundosTotales < 0){
			segundosTotales= 24 * 3600 + segundosTotales;
		}
		
		// Se calcula la hora nueva
		horaNueva = segundosTotales / 3600;
		// Se expresa la hora en formato de 0 a 23
		horaNueva = horaNueva % 24;
		
		// Se calculan los minutos nuevos
		minutosNuevos = (segundosTotales % 3600) / 60;		
		// Se expresan los minutos en formato de 0 a 59
		minutosNuevos = minutosNuevos % 60;
		
		// Se calculan los segundos nuevos
		segundosNuevos = (segundosTotales % 3600) % 60;
		
		System.out.println("La nueva hora es: " + horaNueva + ":" + minutosNuevos + ":" + segundosNuevos);
	}
}