package EjerciciosObjetos1;

public class S11 {
	/*
	 * Crea la función dosCaracteresEnMedio, donde dada una cadena de longitud par, devuelve una cadena formada por los dos caracteres del medio, de modo que la cadena "string" dé como resultado "ri". La longitud de la cadena será al menos 2.
	 * */

	public static String dosCaracteresEnMedio(String str) {
		return str.substring(str.length()/2-1,(str.length()/2)+1);
	}
	
	public static void main(String[] args) {
		System.out.println(dosCaracteresEnMedio("string")); 
		System.out.println(dosCaracteresEnMedio("zzAABBcc"));
		System.out.println(dosCaracteresEnMedio("adios")); 
		System.out.println(dosCaracteresEnMedio("ad")); 
	}
}
