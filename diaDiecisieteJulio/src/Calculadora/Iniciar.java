package Calculadora;

public class Iniciar {
	
	public static void main(String [] args) {
		Calculos operador= new Calculos();
		int a = 1000; 
		int b = 500;
		try {
			System.out.println("División: " + operador.dividir(a,b));
			System.out.println("Resta: " + operador.restar(a, b));
			System.out.println("Suma: " + operador.sumar(a, b));
		}catch(Exception e) {
			//System.out.println("Ha ocurrido un error: " + e);
			e.printStackTrace();
		}
		System.out.println("¡Ha terminado de ejecutar la calculadora, FELICIDADES!");
		
	}
	
}
