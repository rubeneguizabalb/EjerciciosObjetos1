package EjerciciosObjetos1;

public class S05 {
	/*
	 * S5.- Crea la función primeraMitad, donde dada una cadena de longitud par, devuelve la primera mitad. Por lo tanto, la cadena "gato" da como resultado "ga", o la cadena 523 da como resultado 5.
	 * */
	public static String primeraMitad(String str) {
		  int mitad;
		  mitad = str.length()/2;
		  
		  //Devolvemos la cadena desde el inicio hasta la posicion de la mitad
		  return str.substring(0,mitad);
		}

	public static void main(String[] args) {
		System.out.println(primeraMitad("Hola")); 
		System.out.println(primeraMitad("xAb")); 
	}
}
