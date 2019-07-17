package ar.com.educacionit;

import ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Iniciar {
	
	public static void main (String [] args) {
		Vehiculo auto = new Auto("Ford", "Ka+", "Blanco", 
				12, 40, 10);
		System.out.println(auto);
		Persona comprador = new Comprador("Avelino", "Figueira", "95685276", 1500000);
		System.out.println(comprador);
		Persona vendedor = new Vendedor("Maria", "Figueredo", "11062012", 6);
		System.out.println(vendedor);
	}

}
