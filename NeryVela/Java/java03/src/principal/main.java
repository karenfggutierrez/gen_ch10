package principal;

/**
 * 
 * @author Personal
 * 31 mar. 2022
 */

public class main {
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

			//Es posible separar un número con
			int binValSeparado = 0b1011_10_11;
			int intValSeparado =123_345;
			
			var variableDouble= 3.4028234663852886E38;
			var variableString = "Hola mundo";
			var variableBoolean = true;
			var variableChar = 'm';
			var variableUnicode = '\u006D';
			var variableUnicodeN =	109;
			
			System.out.println(variableChar + " " + variableUnicode + " " +variableUnicodeN);
			
			System.out.println("Max Long"+Long.MAX_VALUE);
			System.out.println("Min Long"+Long.MIN_VALUE);
			System.out.println("Bytes Long"+Long.BYTES);
			System.out.println("Max Short"+Short.MAX_VALUE);
			System.out.println("Min Short"+Short.MIN_VALUE);
			System.out.println("Bytes Short"+Short.BYTES);
			
			System.out.println(intValSeparado);
			System.out.println(hexVal);
			System.out.println(binVal);
			System.out.println(octVal);
			System.out.println(capitalC);
			System.out.println(b);
			System.out.println(s);
			
			System.out.println(variableString + " " + "gusto en saludarte");
			System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
			System.out.println("Mi numero" + 7 + 8);
			System.out.println(7 + 8 + " Mi numero");
			
			System.out.println("Este texto \n tiene 2 lineas");
			System.out.println("Este texto \'tiene apostrofes\'");
			
			//Convertir tipos de datos
			byte bVarTruncada = (byte) 128;
			System.out.println(bVarTruncada);
			
			//Convertir tipo string a tipo int
			int edad = Integer.parseInt("20");
			var valorPI = Double.parseDouble("3.141592");
			String edadTexto = String.valueOf(21);
			char caracter= "hola" .charAt(1);
			
			System.out.println(caracter);
			
}
}
