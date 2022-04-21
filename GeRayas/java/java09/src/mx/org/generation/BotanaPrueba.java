package mx.org.generation;

public class BotanaPrueba {

	public static void main(String[] args) {
		// Aqui es donde probamos las botanas
		
		
		//Genera un numero random
		//random y PI son metodos y atributos estaticos
		//no es necesari crear objetos para utilizarlos
		//System.out.println(Math.random());
		
		//Generar los objetos clase botana
		//Se comentaron porque se hizo manual la generacion de idBotana
		//Esto genero duplicidad
		
//		Botana totis = new Botana("Totis fuego", 3000, false,1);
//		Botana caviar = new Botana("Caviar", 5000, true,2);
//		Botana papas = new Botana("Papas chips", 8000, false,3);
//		Botana ceviche = new Botana("Ceviche", 10000, true,4);
//		Botana payLimon = new Botana("Pay de Lim�n", 2000, true,5);
		
		Botana.contadorBotana = 0;
		Botana totis = new Botana("Totis fuego", 3000, false);
		Botana caviar = new Botana("Caviar", 5000, true);
		Botana papas = new Botana("Papas chips", 8000, false);
		Botana ceviche = new Botana("Ceviche", 10000, true);
		Botana payLimon = new Botana("Pay de Lim�n", 2000, true);
		
		
		System.out.println(totis.datosBotana());
		System.out.println(caviar.datosBotana());
		System.out.println(papas.datosBotana());
		System.out.println(ceviche.datosBotana());
		System.out.println(payLimon.datosBotana());
	}

}