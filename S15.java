package EjerciciosObjetos1;

public class S15 {
	
	/*
	 * Crea la función concatenarEspecial donde dadas dos cadenas, añádelas juntas (lo que se conoce como "concatenación") y devuelve el resultado. Sin embargo, si la concatenación crea un carácter doble, omite uno de los caracteres, por lo que "abc" y "cien" dan como resultado "abcien".
	 * */

	public static  String concatenarEspecial(String a, String b) {
		//Si una de las dos palabras es vacias las devuelve concatenadas
		if (a.length() == 0 || b.length() == 0)
		{
			return a+b;
		}
		
		//Si la ultima letra de la primera palabra es igual a la primera letra de la segunda palabra
		if((a.substring(a.length()- 1, a.length())).equals(b.substring(0,1)))
		{
		    return a + b.substring(1,b.length());
		}
		else
		{
		    return a+b;
		}
	}

	public static void main(String[] args) {
		System.out.println(concatenarEspecial("abc","cien"));
		System.out.println(concatenarEspecial("abC","cien")); ;
	}
}
