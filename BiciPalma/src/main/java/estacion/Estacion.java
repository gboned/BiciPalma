package estacion;

public class Estacion {
	// Creo los atributos de la clase
	private int id;
	private String direccion;
	private int numerosAnclajes;
	// Creo el constructor de la clase, a lo que se accede cuando se crea un nuevo
	// objeto de la clase Estacion
	public Estacion(int id, String direccion, int numerosAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numerosAnclajes = numerosAnclajes;
	}
	// Creo el siguiente m�todo para indicar lo que se tiene que devolver
	// cuando se quiere consultar la estaci�n
	public String consultarEstacion() {
		return "id: " + id + "\ndireccion: " + direccion + "\nnumerosAnclajes: " + numerosAnclajes;
		
		
	}
}
