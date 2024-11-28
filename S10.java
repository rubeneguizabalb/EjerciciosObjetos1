package EjerciciosObjetos1;

public class S10 {
	/*
	 * Crea la función pasar2derecha, donde dada una cadena, devuelve una versión "rotada a la derecha 2" donde los últimos 2 caracteres se mueven al principio. La longitud de la cadena será al menos 2.
	 * */
	
	public static String pasar2derecha(String str) {
		return str.substring(str.length()-2) + str.substring(0,(str.length()-2));
	}
	
	public static void main(String[] args) {
		System.out.println(pasar2derecha("Hola")); 
		System.out.println(pasar2derecha("zzAABBcc"));
		System.out.println(pasar2derecha("adios")); 
		System.out.println(pasar2derecha("ad")); 
	}
}
