package buscador;

import programa.AlmacenDeDatos;
import programa.resultado.Resultado;

public class BuscadorPorAutor extends Buscador {
	
	public BuscadorPorAutor(int tipo, String cadena) {
		super(tipo,cadena);
	}
	
	public Resultado buscar() {
		AlmacenDeDatos datos = new AlmacenDeDatos();
		String valor = datos.autor(this.cadena);
		return new Resultado(valor,"autor");
	}
	
}
