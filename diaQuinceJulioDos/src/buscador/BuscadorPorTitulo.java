package buscador;

import programa.AlmacenDeDatos;
import programa.resultado.Resultado;

public class BuscadorPorTitulo extends Buscador {

	public BuscadorPorTitulo(int tipo, String cadena) {
		super(tipo,cadena);
	}
	
	public Resultado buscar() {
		AlmacenDeDatos datos = new AlmacenDeDatos();
		String valor = datos.titulo(this.cadena);
		return new Resultado(valor,"titulos");
	}
	
}
