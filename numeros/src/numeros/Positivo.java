package numeros;

public class Positivo extends Numero {
	
	public Positivo(){
		this.numero = 0;
	}
	
	public void siguiente() {
		this.numero++;
	}
	
	public String toString() {
		return "El positivo va por: " + this.numero;
	}
	
}
