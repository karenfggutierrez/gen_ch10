package principal;

public class Main {

	public static void main (String[] args) {
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
		
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		long vallong = 9223372036854775807L;
		float floatVar = 3.4028234663852886E38f;
		double doubleVar = 1.7976931348623157E308;
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		var variableChar = 'm';
		
		System.out.println("Byte: " + b);
		System.out.println("Short: " + s);
		System.out.println(intValSeparado);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println( Integer.toBinaryString(intVal));
		System.out.println( Integer.toHexString(intVal));
		System.out.println("Max Long " + Long.MAX_VALUE);
		System.out.println("Bytes Long " + Long.BYTES);
		System.out.println("Min Long " + Long.MIN_VALUE);
		System.out.println("Size Long " + Long.SIZE);
		System.out.println("String con unicode: " + variableUnicode);
		System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);
	}

}