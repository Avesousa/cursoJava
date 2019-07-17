package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.Persona;

public class Vendedor extends Persona {

	private int cantAutosVendidos;

	public Vendedor(String nombre, String apellido, String documento, int cantidad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDocumento = documento;
		this.cantAutosVendidos = cantidad;
		
		
		
	}
	
	public int getCantAutosVendidos() {
		return cantAutosVendidos;
	}
	public void setCantAutosVendidos(int cantAutosVendidos) {
		this.cantAutosVendidos = cantAutosVendidos;
	}

	public String toString(){
		
		return "El vendedor es: "
			 + super.toString()
			 + "\n y tiene " + this.cantAutosVendidos + " autos vendidos";
		
	}
}
