package EjerciciosObjetos1;

public class S17 {
	/*
	 * S17.- Crea la función dosInicioDosFinal donde dada una cadena, devuelve verdadero si los primeros 2 caracteres de la cadena también aparecen al final de la cadena, como con "armonizar".
	 * 
	 * */
	
	public static boolean dosInicioDosFinal (String str) {
		if(str.length() >= 2 && str.substring(0,2).equals(str.substring(str.length()-2))) {	
		    return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//devuelve codificacinó
		System.out.println(dosInicioDosFinal("armonizar"));
		//devuelve abCdge
		System.out.println(dosInicioDosFinal("empezar")); ;
	}

}
