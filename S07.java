package EjerciciosObjetos1;

public class S07 {
	/*
	 * S7.- Crea la función combinarCadenas, donde dadas dos cadenas, a y b, devuelve una cadena con la forma short+long+short, con la cadena más corta en el exterior y la cadena más larga en el interior. Las cadenas no tendrán la misma longitud, pero pueden estar vacías (longitud 0).
	 * */
	
	public static String combinarCadenas(String a, String b) {
		int largoA, largoB;
		String devolver; 
		  
		largoA = a.length();
		largoB = b.length();
		  
		if (largoA > largoB){
			devolver = b + a + b;
		}
		else
		{
			devolver = a + b + a;
		}
		return devolver;
	}
	
	public static void main(String[] args) {
		System.out.println(combinarCadenas("Hola","xAb")); 
		System.out.println(combinarCadenas("zzAb","adios")); 
	}
}
