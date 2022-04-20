package org.generation.casa;

public class Familia {
	private String chismeContar1;
	private String chismeContar2;
	private String chismeContar3;
	
	public Familia () {
		Persona miPariente = new Persona();
		this.chismeContar1 = miPariente.getChsmPublic();
		this.chismeContar2 = miPariente.getChsmProtected();
		this.chismeContar3 = miPariente.getChsmDefault();
	}
	
	/**
	 * M�todo para retornar todos los chismes al que tiene
	 * acceso mi clase familia
	 * @return cade de chisme completo.
	 */
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" +
				this.chismeContar2 + "\n" +
				this.chismeContar3 + "\n";
	}
	
}
