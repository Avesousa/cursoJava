package ar.com.educacionit;

public class Domicilio {
	
	private String calle;
	private int numero;
	
	public Domicilio(String c, int n) {
		this.calle = c;
		this.numero = n;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "Mi casa está ubicada en " + this.calle + " al " + this.numero;
	}
	
}
