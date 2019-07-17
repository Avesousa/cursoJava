package ar.com.educacionit;

public class Iniciar {
	
	public static void main(String [] args) {
		
		Domicilio dom = new Domicilio("El Palomar", 120);
		Casa casa = new Casa(dom,5,120.2f);
		System.out.println(casa);
	}
	
}
