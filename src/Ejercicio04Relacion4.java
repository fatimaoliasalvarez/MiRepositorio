/**
 * Programa que usa un método llamado diasDeUnMes, que tenga como entrada 
 * un número de mes (entre 1 y 12) y un año y devuelva el número de días de ese mes y año.
 * Usar el método anterior para cuando el año sea bisiesto, febrero tenga 29 días.
 * 
 * @author profesor
 *
 */





public class Ejercicio04Relacion4 {
	
	

	private static final int ANNO_ACTUAL = 2018;



	public static void main(String[] args) {
	
		// Variables
		int mes;
		int anio;
		int diasMesAnio;
		
		// Se solicita el mes y el año
		System.out.println("Introduzca el mes (1-12)");
		mes = Ejercicio01Relacion4.solicitarNumeroEnRango(1,12 );
		System.out.println("Introduzca el año:");
		anio = Ejercicio01Relacion4.solicitarNumeroEnRango(0, ANNO_ACTUAL);
		
		// Se calcula los días del mes y año dados
		diasMesAnio = calcularDiasMesAnio(mes, anio);
		
		System.out.println("El mes " + mes + " del año " + anio + " tiene " + diasMesAnio + " días." );
	}
	
	
	
	/**
	 * Método que calcula el número de días de un mes-año.Supone
	 * que los parámetros de entrada son correctos
	 * @param mes
	 * @param anio
	 * @return número de días de ese mes-año
	 */
	public static int calcularDiasMesAnio (int mes, int anio){
		int dias;
		boolean esBisiesto;
		
		if (mes == 2){
			// Se comprueba si el año es bisiesto
			esBisiesto = Ejercicio03Relacion4.comprobarBisiesto(anio);
			if (!esBisiesto){
				dias = 28;
			}
			else{
				dias = 29;
			}				
		}
		else{
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			}
			else {
				dias = 31;
			}
		}
		
		return dias;
	}
}
