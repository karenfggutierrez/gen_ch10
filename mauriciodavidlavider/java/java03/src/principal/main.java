package principal;

/**
 * 
 * @author mdavi
 *
 */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definimos una variable booleana
		boolean result = true;
		//Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
	    // Definimos una variable de tipo byte
		byte b = 100;
		//Definimos una variable de tipo short
		short s = 10000;
		//DEfinimos una varibale de tipo int, representación decimal
		int intVal = 26;
		//Definimos una varible de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		//Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		//Definimos una variable de tipo int, representación octal
		int octVal = 032;
		
		//Es posible suparar un número con _
		int binValorSeparado = 0b011_10_11;
		int intValorSeparado = 123_345;
		
		System.out.println(intValorSeparado);
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toHexString(50));
		System.out.println(hexVal);
		System.out.println(binVal);
		
		//Verificamos el maximo valor de un tipo Long
		System.out.println("Max Long " + Long.MAX_VALUE);
	}

}
