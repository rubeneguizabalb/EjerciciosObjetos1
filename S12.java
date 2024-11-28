package EjerciciosObjetos1;

public class S12 {
	/*
	 * S12.- Crea la función acabaEnDo, donde dada una cadena, devuelve verdadero si termina en "do".
	 * */
	public static boolean acabaEnDo(String str) {
		int len = str.length();
		String texto = "do";
	 
		//Si largo menor a 2, no puede acabar en do
		if (len < 2) {
			return false;
		}
		//Si el texto do es igual a la subcadena de las 2 ultimas letras de la palabra
		//que se ha pasado por parametro
		else if (texto.equals(str.substring(len-2,len))) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(acabaEnDo("string")); 
		System.out.println(acabaEnDo("terminado"));
		System.out.println(acabaEnDo("adios"));
	}
}
