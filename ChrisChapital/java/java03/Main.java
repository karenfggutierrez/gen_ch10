package principal;


/**
 * 
 * @param args
 */
public class Main {
	public static void main(String[] args) {
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
				
				//Es posible separar un numero con  _
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 123_345;
				
		System.out.println(intValSeparado);
		System.out.println(binValSeparado);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(octVal);
		System.out.println(Integer.toBinaryString(intVal) );
		System.out.println(Integer.toHexString(intVal) );
		
		
		//Verficamos el máximo que me va a arrojar
		System.out.println("Max Long " + Long.MAX_VALUE);
		//Definimos una variable de tipo de long
		System.out.println("Max Long " + Long.MIN_VALUE);
		long longVal = 9223372036854775807L;
		//Definimos una variable de tipo long y usamos literal L
		//long longValLit = 9223372036854775807L;
		//System.out.printIn(Long.BYTES);
		System.out.println("Max Long " + Long.BYTES);
		
		//Definir una variable float
		float floatVar = 3.4028234663852886E38f;
		
		//Podemos usar var para declarar una variable local, JDK 10 en adelante
		//Local-Variable Type Inference
		var variableDouble= 3.4028234663852886E38;
		var variableString= "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006d';
		char variableUnicodeN = 109;
		System.out.println( variableChar + " " + variableUnicode + " " +variableUnicodeN );
		System.out.println( "Mi numero " + 7 + 8);
		System.out.println( 7 + 8 + " Mi numero"  );
		
		//Se pueden usar literales en char y String
		//System.out.println("Este texto \n tiene 2 líneas");
		//System.out.println("Este texto \' tiene apostrofes\\' ");
		
		
		//Convertir tipos de datos
		byte bVarTruncada = (byte) 130;
		System.out.println(bVarTruncada);
		
		//Convertir tipos string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);
		
		System.out.println(caracter);
		
		}

}
