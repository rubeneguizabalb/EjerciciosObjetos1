package EjerciciosObjetos1;

public class S14 {
	
	/*
	 * Crea la función mitadTres, donde dada una cadena de longitud impar, devuelve la longitud de la cadena 3 desde su mitad, por lo que "Candy" da como resultado "and". La longitud de la cadena será al menos 3.
	 * */

	public static String mitadTres(String str) {
		//Longitud de la palabra entre 2
		int len = str.length() / 2;
		
		//Devuelve la substring comenzando entre la mitad -1 y la mitad +2
		return str.substring(len-1,len+2);
	}
	
	public static void main(String[] args) {
		System.out.println(mitadTres("Candy")); 
		System.out.println(mitadTres("terminado"));
		System.out.println(mitadTres("adio"));
	}
}
