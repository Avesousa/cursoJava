package ar.com.educacionit;

public class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String numeroDocumento;
	
	public String toString() {
		return "\n" + this.nombre + " " + this.apellido 
		 + "\n portador del número de documento: " + this.numeroDocumento;
	}

}


