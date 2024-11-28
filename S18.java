package EjerciciosObjetos1;

public class S18 {
	/*
	 * Crea la función concatenaMinimo donde dadas dos cadenas, añádelas juntas (lo que se conoce como "concatenación") y devuelve el resultado. Sin embargo, si las cadenas tienen longitudes diferentes, omite los caracteres de la cadena más larga para que tenga la misma longitud que la cadena más corta. Por lo tanto, "Hola" y "adios" dan como resultado "Holadios". Las cadenas pueden tener cualquier longitud.
	 * */

	public static String concatenaMinimo(String a, String b) {
		if (a.length() == b.length())
		    return a+b;
		if (a.length() > b.length()){
		    int diff = a.length() - b.length();
		    return a.substring(diff, a.length()) + b;

		} else {
		    int diff = b.length() - a.length();
		    return a + b.substring(diff, b.length());
		}	    
	}
	
	public static void main(String[] args) {
		//devuelve codificacinó
		System.out.println(concatenaMinimo("hola", "Adios"));
		//devuelve abCdge
		System.out.println(concatenaMinimo("adios", "Hola")); ;
	}
}
