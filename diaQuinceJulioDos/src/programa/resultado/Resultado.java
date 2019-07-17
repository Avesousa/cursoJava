package programa.resultado;

public class Resultado {
	
	String resultado;
	String tipo;
	
	public Resultado(String dato,String tipo) {
		this.resultado = dato;
		this.tipo = tipo;
	}
	
	public String toString() {
		return "El resultado de la busqueda con " + tipo + " es: \n"
				+ this.resultado;
		
	}
	
}
