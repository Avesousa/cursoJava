package ar.com.educacionit;

public class Vehiculo {

		//Parametros
		private int alto;
		private int ancho;
		private int largo;
		
		//Constructor		
		public Vehiculo(int alto, int ancho, int largo) {
			this.alto = alto;
			this.ancho = ancho;
			this.largo = largo;
		}

		//Métodos
		public int getAlto() {
			return alto;
		}
		public void setAlto(int alto) {
			this.alto = alto;
		}
		public int getAncho() {
			return ancho;
		}
		public void setAncho(int ancho) {
			this.ancho = ancho;
		}
		public int getLargo() {
			return largo;
		}
		public void setLargo(int largo) {
			this.largo = largo;
		}
		
		@Override
		public String toString(){
			return "\n Alto : " + this.alto
				 + "\n Largo: " + this.largo
				 + "\n Ancho: " + this.ancho;
		}
}
