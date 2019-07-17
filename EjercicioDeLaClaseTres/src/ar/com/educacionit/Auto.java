package ar.com.educacionit;

public class Auto extends Vehiculo{
	
	String marca;
	String modelo;
	String color;
	
	public Auto(String marca, String modelo, String color, int largo, int ancho, int altura) {
		super(altura,ancho,largo);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "EL AUTO TIENE:"
				+ "\n Modelo: " + this.modelo
				+ "\n Marca: " + this.marca
				+ "\n Color: " + this.color
				+ super.toString();
	}
	
}
