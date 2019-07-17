package ar.com.educacionit;

public class Comprador extends Persona{
	
	private double presupuesto;
	
	public Comprador(String nombre, String apellido, String documento, double presupuesto) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDocumento = documento;
		this.presupuesto = presupuesto;
	}

	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString(){
		
		return "El comprador es: "
			 + super.toString()
			 + "\n tiene disponible de presupuesto: " + this.presupuesto;
		
	}

}
