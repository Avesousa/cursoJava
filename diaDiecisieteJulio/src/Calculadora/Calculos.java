package Calculadora;

import Excepciones.ExcepcionRestando;
import Excepciones.ExcepcionSumando;

public class Calculos {
	
	public int dividir(int a, int b) throws Exception {
			return a/b;
	}
	
	public int restar(int a, int b) throws ExcepcionRestando,Exception{
		if((a-b) < 0)
			throw new ExcepcionRestando(a,b);
		return a-b;
	}
	
	public int sumar(int a, int b) throws ExcepcionSumando, Exception {
		if((a+b) < 0)
			throw new ExcepcionSumando(a,b,false);
		else if((a+b) > 1000) 
			throw new ExcepcionSumando(a,b,true);
		return a+b;
	}
	
}
