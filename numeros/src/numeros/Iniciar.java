package numeros;

public class Iniciar {

	public static void main(String[] args) {
		Numero pos = new Positivo();
		Numero neg = new Negativo();
		int i = 0;
		while(i < 10) {
			pos.siguiente();
			neg.siguiente();
			System.out.println(pos + "\n" + neg);
			i++;
		}

	}

}
