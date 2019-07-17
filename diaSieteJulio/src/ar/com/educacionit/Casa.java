package ar.com.educacionit;

public class Casa {
	
	//Atributos
	private Domicilio domicilio;
	private int cantidadPuerta;
	private float metrosCuadrados;
	/* Static es una variable que solo puede ingresar lo que está dentro de la clase, y sus hijos, lo cual pueden también ser
	 * modificado por los mismo.
	 * Final refiere a las variables que son heredadas pero no pueden ser modificadas por las hijas de la clase...
	 * Utilizar protected es para colocar privado los atributos y poder acceder a ellos desde sus hijos ya que 
	 * en private no se podrá.*/
	public static final int pisos = 2;
	//Constructores
	public Casa(Domicilio domicilio, int cantidadPuerta, float metrosCuadrados) {
		this.domicilio = domicilio;
		this.cantidadPuerta = cantidadPuerta;
		this.metrosCuadrados = metrosCuadrados;
	}
	//Métodos
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public int getCantidadPuerta() {
		return cantidadPuerta;
	}
	public void setCantidadPuerta(int cantidadPuerta) {
		this.cantidadPuerta = cantidadPuerta;
	}
	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	@Override
	public String toString() {
		return domicilio.toString() + " y ella tiene " + this.cantidadPuerta + " puertas" +
		" y tiene un tamaño de " + this.metrosCuadrados + " metros cuadrados, y es hermosa.";		
	}
	
}
