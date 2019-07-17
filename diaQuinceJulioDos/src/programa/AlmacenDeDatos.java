package programa;

public class AlmacenDeDatos {

	private String[] libroAvelino = { "Script", "JavaScript", "Java" };
	private String[] libroMirian = { "Cocinar", "Análisis", "Ecommerce" };
	private String[] libroMaria = { "Dormir", "Doctorado", "Inteligencia" };
	private String[][] todosLosLibros = { libroAvelino, libroMirian, libroMaria };

	public String autor(String dato) {
		switch (dato) {
		case "Avelino":
			return darDatos(libroAvelino);
		case "Mirian":
			return darDatos(libroMirian);
		case "Maria":
			return darDatos(libroMaria);
		}
		return null;
	}

	public String darDatos(String[] valor) {
		String res = "";
		for (int i = 0; i < valor.length; i++) {
			res += "\n -" + valor[i];
		}
		return res;
	}

	public String titulo(String dato) {
		for (int i = 0; i < todosLosLibros.length; i++) {
			for (int j = 0; j < todosLosLibros[i].length; j++) {
				if (todosLosLibros[i][j].equals(dato)) {
					switch (i) {
					case 0:
						return "Avelino";
					case 1:
						return "Mirian";
					case 2:
						return "Maria";
					}
				}
			}
		}
		return null;
	}
}
