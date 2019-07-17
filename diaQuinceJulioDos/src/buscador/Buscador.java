package buscador;

import programa.resultado.Resultado;

public abstract class Buscador {
	
	protected int tipo;
	protected String cadena;
	public Resultado buscar() {
		return null;
	}

	public Buscador(int _tipo, String _cadena) {
		this.tipo = _tipo;
		this.cadena = _cadena;
	}
	
}
