package BiciPalma;

import static org.junit.Assert.*;

import org.junit.Test;

import BiciPalma.*;

public class EstacionTest {
	// Creación de objeto para usarlo en los tests
	Estacion estacion = new Estacion(1, "Manacor", 6);
	@Test
	// En este test se comprueba que cuando se crea un nuevo objeto de la clase
	// Estacion, lo devuelva de la forma que se espera
	public void consultarEstacionTest() {
		// Comprueba que los detalles que devuelve de la clase son los correctos
		assertEquals(1, estacion.getId());
		assertEquals("Manacor", estacion.getDireccion());
		assertEquals(6, estacion.getNumeroAnclajes());
	}
	
	@Test
	// En este test se comprueba que el método de anclajesLibres devuelva el número de
	// anclajes que hay en la estación
	public void anclajesLibresTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals("anclajesLibres: 6", estacion.anclajesLibres());
	}
	
	@Test
	public void consultarAnclajesTest() {
		
	}
}
