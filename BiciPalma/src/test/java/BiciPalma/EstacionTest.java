package BiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import estacion.Estacion;

public class EstacionTest {

	@Test
	// En este test se comprueba que cuando se crea un nuevo objeto de la clase
	// Estacion, lo devuelva de la forma que se espera
	public void consultarEstacionTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals("id: 1\ndireccion: Manacor\nnumerosAnclajes: 6", estacion.consultarEstacion());
	}
	
	@Test
	// En este test se comprueba que el método de anclajesLibres devuelva el número de
	// anclajes que hay en la estación
	public void anclajesLibresTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals("anclajesLibres: 6", estacion.anclajesLibres());
	}
}
