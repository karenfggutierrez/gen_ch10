package mx.org.generation;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		
		Aritmetica operacion = new Aritmetica();
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		System.out.println("Resultado return: "+ resultado);
	}

}
