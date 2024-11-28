package EjerciciosObjetos1;

public class S01 {
	/*
	 * S1.- Crea la función crearEtiqueta, donde dadas las cadenas de etiquetas y palabras, crea la cadena HTML con etiquetas alrededor de la palabra, por ejemplo, "<i>Hola</i>" 
crearEtiqueta("i", "Hola") → "<i>Hola</i>" 
	 * */

	public static String crearEtiqueta(String tag, String word) {
		String etiquetaInicio, etiquetaFin;

		etiquetaInicio = "<" + tag + ">";
		etiquetaFin = "</" + tag + ">";
  
		return etiquetaInicio + word + etiquetaFin;
	}
	
	public static void main(String[] args) {
		System.out.println(crearEtiqueta("i","Hola")); 
	}

}
