package EjerciciosObjetos1;

public class S09 {
	/*
	 * Crea la función pasar2izquierda, donde dada una cadena, devuelve una versión "rotada a la izquierda 2" donde los primeros 2 caracteres se mueven al final. La longitud de la cadena será al menos 2.
	 * */
	public static String pasar2izquierda(String str) {
		return str.substring(2) + str.substring(0,2);
	}

	public static void main(String[] args) {
		System.out.println(pasar2izquierda("Hola")); 
		System.out.println(pasar2izquierda("zzAABBcc"));
		System.out.println(pasar2izquierda("Hol")); 
		System.out.println(pasar2izquierda("as")); 
	}
}
