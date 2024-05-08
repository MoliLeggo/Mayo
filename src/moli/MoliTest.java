package moli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoliTest {

		public Moli moli = new Moli();
		
	@Test
	void testInvertirCadena() {
		
		String cadena = "hola";
		String resultadoEsperado = "aloh";
		
		
		String crearResultado = moli.invertirCadena(cadena);
		
		assertEquals(crearResultado, resultadoEsperado);
		
		//fail("Not yet implemented");
	}

}
