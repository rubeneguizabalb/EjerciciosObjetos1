package EjerciciosObjetos1;

public class S02 {
	
	/*
	 * S2.- Crea la función encerrarPalabra, donde dada una cadena de salida de longitud 4, como "<<>>", y una palabra, devuelve una nueva cadena donde la palabra está en el medio de la cadena de salida.
Por ejemplo, "<<palabra>>". encerrarPalabra(“<<>>”, “palabra”);

	 * */
	
	public static String encerrarPalabra(String out, String word) {
		  return out.substring(0, 2) + word + out.substring(2,4);
		}
	
	public static void main(String[] args) {
		System.out.println(encerrarPalabra("<##>","palabra")); 
	}
}
