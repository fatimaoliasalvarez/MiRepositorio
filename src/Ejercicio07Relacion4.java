
public class Ejercicio07Relacion4 {

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
		
		a = (14 - mes) / 12;
		y = anno- a;
		m = mes + 12 * a- 2;
		d = (dia + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
		
		switch ( d) {
		case 0:
			diaSemana=new String("DOMINGO");
			break;
		case 1:
			diaSemana=new String("LUNES");
			break;
		case 2:
			diaSemana="MARTES";
			break;
		case 3:
			diaSemana="MIERCOLES";
			break;
		case 4:
			diaSemana="JUEVES";
			break;
		case 5:
			diaSemana="VIERNES";
			break;
		case 6:
			diaSemana="SABADO";
			break;
		}
		return diaSemana;
	}

}
