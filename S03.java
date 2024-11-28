package EjerciciosObjetos1;

public class S03 {
	
	/*
	 * S3.- Crea la función finalExtra, donde dada una cadena, devuelve una nueva cadena formada por 3 copias de los 2 últimos caracteres de la cadena original. La longitud de la cadena será al menos 2.
finalExtra("Hola") → "lalala"
	 * */
	
	public static String finalExtra(String str) {
		  int inicio;
		  String devolver;

		  //Posicion de inicio largo de la palabra -2
		  inicio = str.length()-2;
		  //Obtenemos la substring desde esa posicion
		  devolver = str.substring(inicio);
		  
		  return  devolver + devolver + devolver;
		}
	
	public static void main(String[] args) {
		System.out.println(finalExtra("Hola")); 
	}
}
