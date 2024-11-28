package EjerciciosObjetos1;

public class S08 {
	/*
	 * S8.- Crea la función sinInicio, donde dadas dos cadenas, devuelve su concatenación, excepto que omite el primer carácter de cada una. Las cadenas tendrán una longitud mínima de 1.
	 * */

	public static String sinInicio(String a, String b) {
		  return a.substring(1) + b.substring(1);
		}
	
	public static void main(String[] args) {
		System.out.println(sinInicio("Hola","xAb")); 
		System.out.println(sinInicio("zzAb","adios")); 
	}
}
