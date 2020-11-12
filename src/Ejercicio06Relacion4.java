/**
 * Programa que usa un método llamado siguienteFecha al que se le pasen 3 parámetros enteros:
 * • diaActual
 * • mesActual
 * • annoActual
 * 
 * El método no devuelve nada y debe mostrar dos mensajes:
 * La fecha de hoy es D-M-A
 * La fecha de mañana es D-M-A
 *
 * El método supondrá que los datos de entrada son correctos.
 * Esta validación de datos se realizará desde el main.
 *
 */
import java.util.Scanner;

public class Ejercicio06Relacion4 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
	
		int diaActual;
		int mesActual;
		int annoActual;
		boolean fechaCorrecta;
		
		//Se solicita la fecha de hoy
		do{
			diaActual = Ejercicio06Relacion4.solicitarDiaActual();
			mesActual = Ejercicio06Relacion4.solicitarMesActual();
			annoActual = Ejercicio06Relacion4.solicitarAnnoActual();
			
			//Se comprueba que la fecha es correcta
			fechaCorrecta = Ejercicio06Relacion4.comprobarFechaCorrecta(diaActual, mesActual, annoActual);
			
		}while(fechaCorrecta == false);
				
		
		//Se muestra la fecha de hoy y la de mañana
		Ejercicio06Relacion4.siguienteFecha(diaActual, mesActual, annoActual);		
	}
	
	/**
	 * Método que solicita el día actual comprobando que su valor está entre 1 y 31
	 * @return el día expresado en un número entre 1 y 31
	 */
	public static int solicitarDiaActual(){
		int diaActual;
		
		do{
			System.out.println("Introduce el día: ");
			diaActual = Integer.parseInt(teclado.nextLine());
		}while(diaActual < 0 || diaActual > 31);
		
		return diaActual;
	}
	
	/**
	 * Método que solicita el mes actual comprobando que su valor está entre 1 y 12
	 * @return el mes expresado en un número entre 1 y 12
	 */
	public static int solicitarMesActual(){
		int mesActual;
		
		do{
			System.out.println("Introduce el mes: ");
			mesActual = Integer.parseInt(teclado.nextLine());
		}while(mesActual < 0 || mesActual > 12);
		
		return mesActual;
	}
	
	/**
	 * Método que solicita el anno actual comprobando que su valor no es negativo ni cero
	 * @return el año expresado en un número positivo
	 */
	public static int solicitarAnnoActual(){
		int annoActual;
		
		do{
			System.out.println("Introduce el año: ");
			annoActual = Integer.parseInt(teclado.nextLine());
		}while(annoActual <= 0);
		
		return annoActual;
	}
	
	/**
	 * Método que comprueba que una fecha es correcta
	 * @param diaActual indica el día entre 1 y 31
	 * @param mesActual indica el mes entre 1 y 12
	 * @param annoActual indica el año como un número positivo
	 * @return true si la fecha es correcta o false si no es así
	 */
	public static boolean comprobarFechaCorrecta(int diaActual, int mesActual, int annoActual){
		boolean fechaCorrecta=true;
		int diasMes;
		
		diasMes=Ejercicio04Relacion4.calcularDiasMesAnio(mesActual, annoActual);
		
		if(diasMes<diaActual){
			fechaCorrecta=false;
		}
	
		return fechaCorrecta;
	}

	/**
	 * 
	 * @param diaActual es un día entre 1 y 31
	 * @param mesActual es un mes entre 1 y 12
	 * @param annoActual es un número positivo
	 */
	private static void siguienteFecha(int diaActual, int mesActual, int annoActual) {
		int diaSiguiente;
		int mesSiguiente;
		int annoSiguiente;
		int diasMes;
		
		//Se inicializan las variables
		mesSiguiente=mesActual;
		annoSiguiente=annoActual;
		
		//Se muestra la fecha actual
		System.out.println("La fecha de hoy es: " + diaActual + "-" + mesActual + "-" + annoActual);
		
		//Se calcula la siguiente fecha
		diasMes=Ejercicio04Relacion4.calcularDiasMesAnio(mesActual, annoActual);
		if(diasMes == diaActual)
		{
			diaSiguiente = 1;
			if(mesActual == 12){
				mesSiguiente = 1;
				annoSiguiente = annoActual + 1;
			}
			else{
				mesSiguiente = mesActual + 1;
			}
		}
		else
		{
			diaSiguiente = diaActual + 1;
		}
			
		//Se muestra la fecha del día siguiente
		System.out.println("La fecha de mañana es: " + diaSiguiente + "-" + mesSiguiente + "-" + annoSiguiente);				
	}
}
