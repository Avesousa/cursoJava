package Excepciones;

public class ExcepcionRestando extends Exception{
	
	int a;
	int b;
	
	public ExcepcionRestando(int _a, int _b) {
		super();
		this.a = _a;
		this.b = _b;
	}
	
	@Override
	public String getMessage() {
		return "La resta genera un número menor a 0. \nPorque " + 
				this.a + " es menor que " + this.b;
	}
}
