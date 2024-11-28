package EjerciciosObjetos1;

public class S04 {
	/*
	 * S4.- Crea la función primerosDos, donde Dada una cadena, devuelve la cadena formada por sus dos primeros caracteres, de modo que la cadena "Hola" genere "Ho". Si la cadena es más corta que 2 caracteres, devuelve lo que haya, de modo que "X" genere "X" y la cadena vacía "" genere la cadena vacía "". 
	 * */
	public static String primerosDos(String str) {
		int largo;
		String devolver;
		  
		largo = str.length();
		  
		if (largo >= 2)
		{
			devolver = str.substring(0,2);
		}
		else
		{
			devolver = str;
		}
		return devolver;
	}
	
	public static void main(String[] args) {
		System.out.println(primerosDos("Hola")); 
		System.out.println(primerosDos("x")); 
	}
}
