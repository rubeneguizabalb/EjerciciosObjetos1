package EjerciciosObjetos1;

public class S13 {
	/*
	 * Crea la función nDosVeces, donde dada una cadena y un entero n, devuelve una cadena formada por los primeros y los últimos n caracteres de la cadena. La longitud de la cadena será al menos n.
	 * */
	
	public static String nDosVeces(String str, int n) {
		  return str.substring(0,n) + str.substring(str.length()- n, str.length());
		}

	public static void main(String[] args) {
		System.out.println(nDosVeces("string",3)); 
		System.out.println(nDosVeces("terminado",4));
		System.out.println(nDosVeces("adios",2));
	}
}
