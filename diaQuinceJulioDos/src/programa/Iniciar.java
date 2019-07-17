package programa;

import buscador.Buscador;
import buscador.BuscadorPorAutor;
import buscador.BuscadorPorTitulo;
import programa.resultado.Resultado;

public class Iniciar {
	
	public static void main(String [] args) {
		Buscador busqueda = crearBusqueda(1,"Java");
		Resultado resultado = busqueda.buscar();
		System.out.println(resultado);
	}
	
	public static Buscador crearBusqueda(int tipo, String busqueda) {
		Buscador b = null;
		switch(tipo) {
			case 1: 
				b = new BuscadorPorTitulo(tipo,busqueda);
				break;
			case 2: 
				b = new BuscadorPorAutor(tipo,busqueda);
				break;
		}
		return b;
	}
	
}
