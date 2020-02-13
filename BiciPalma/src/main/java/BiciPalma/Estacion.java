package BiciPalma;

public class Estacion {
	
	private int id;
	private String direccion;
	private int numerosAnclajes;
	
	public Estacion(int id, String direccion, int numerosAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numerosAnclajes = numerosAnclajes;
	}
	
	public String consultarEstacion() {
		return "id: " + id + "\ndireccion: " + direccion + "\nnumerosAnclajes: " + numerosAnclajes;
		
		
	}
}
