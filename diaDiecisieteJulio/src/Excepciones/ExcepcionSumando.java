package Excepciones;

public class ExcepcionSumando extends Exception{

	int a;
	int b;
	boolean forma;
	
	public ExcepcionSumando(int a, int b, boolean forma) {
		super();
		this.a = a;
		this.b = b;
		this.forma = forma;
	}
	
	@Override
	public String getMessage() {
		String mensaje = "La suma de " + this.a + " y " + this.b +
				" dan como resultado un número";
		if(this.forma)
			return  mensaje + " mayor a 1000";
		else 
			return mensaje + " menor a 0";
	}
}
