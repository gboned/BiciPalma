package estacion;

public class Estacion {
	// Creo los atributos de la clase
	private int id;
	private String direccion;
	private int numerosAnclajes;
	private int[] anclajes = new int[numerosAnclajes];
	// Creo el constructor de la clase, a lo que se accede cuando se crea un nuevo
	// objeto de la clase Estacion
	public Estacion(int id, String direccion, int numerosAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numerosAnclajes = numerosAnclajes;
	}

	// Creo el siguiente método para indicar lo que se tiene que devolver
	// cuando se quiere consultar la estación
	public String consultarEstacion() {
		return "id: " + id + "\ndireccion: " + direccion + "\nnumerosAnclajes: " + numerosAnclajes;
		
		
	}
	// Creo el método que indica los anclajes que hay en la estación
	public String anclajesLibres() {
		return "anclajesLibres: " + this.numerosAnclajes;
	}
}
