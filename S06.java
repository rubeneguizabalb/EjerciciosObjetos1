package EjerciciosObjetos1;

public class S06 {
	/*
	 * S6.- Crea la función sinInicioyFinal, donde dada una cadena, devuelve una versión sin el primer y el último carácter, por lo que "Hola" da como resultado "ol". La longitud de la cadena puede ser de cualquier longitud incluido 0.
	 * */
	
	public static String sinInicioyFinal(String str) {
		String devolver;
		if (str.length() > 2){
			devolver = str.substring(1,str.length()-1);
		}
		else 
		{
			devolver = "";
		}
		return devolver;
	}
	
	public static void main(String[] args) {
		System.out.println(sinInicioyFinal("Hola")); 
		System.out.println(sinInicioyFinal("xAb")); 
	}
}
