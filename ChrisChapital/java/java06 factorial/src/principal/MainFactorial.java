package principal;

public class MainFactorial {

	public static void main(String[] args) {
		
		//El factorial de 5 es: 120
			int num = 6, factorial=1, contador =0;
			while(contador < num) {
				factorial*= contador+1;
				contador++;
			
			}
			System.out.println("El factorial de "+num +" es: " +factorial);
			
			for (int i=1; i<=10; i++ ) {
				System.out.println("Valor de i en for : " + i);			}
		}
	}




