
public class Ejercicio07Relacion4V2 {

	public static void main(String[] args) {
		
		int dia,mes,anno;
		String diaSemana;
		
		dia= Ejercicio01Relacion4.solicitarNumeroEnRango("Dia:", 1, 31);
		mes= Ejercicio01Relacion4.solicitarNumeroEnRango("Mes:", 1, 12);
		anno=Ejercicio01Relacion4.solicitarNumeroEnRango("Anno:", 1900, 2200);
		
		diaSemana= diaDeLaSemana(dia,mes,anno);
		
		System.out.println("Es " + diaSemana);
		
	}
	
	public static String  diaDeLaSemana(int dia, int mes,int anno) {
		String diaSemana = null;
		int a,m,y,d;
		
		String[] arrayDiasSemana= {"DOMINGO", "LUNES","MARTES",
			"MIERCOLES", "JUEVES", "VIERNES", "SABADO"		
		};
		
		a = (14 - mes) / 12;
		y = anno- a;
		m = mes + 12 * a- 2;
		d = (dia + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
		
		diaSemana= arrayDiasSemana [d];
		
		
		return diaSemana;
	}

}
