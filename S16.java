package EjerciciosObjetos1;

public class S16 {

	/*Crea la función invierteDosUltimos donde dada una cadena de cualquier longitud, devuelve una nueva cadena donde los últimos 2 caracteres, si están presentes, se intercambian, por lo que "codificación" produce "codificación".*/
	
	public static String invierteDosUltimos(String str) {
		if (str.length() < 2){
			return str;
		}
		else {
			return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
		}
	}
	
	public static void main(String[] args) {
		//devuelve codificacinó
		System.out.println(invierteDosUltimos("codificación"));
		//devuelve abCdge
		System.out.println(invierteDosUltimos("abCdeg")); ;
	}
}
