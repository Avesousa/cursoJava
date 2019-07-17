package numeros;

public class Negativo extends Numero {
	
	public Negativo(){
		this.numero = -1;
	}
	
	public void siguiente() {
		this.numero--;
	}
	
	public String toString() {
		return "El negativo va por: " + this.numero;
	}
	
}