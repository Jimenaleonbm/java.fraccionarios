package com.jimenaleon.fraccionarios;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;


public class FraccionesTest {
	
	@Test
	public void simplificarFraccionDosCuartos() {
		assertThat(new Fraccion(2,4).simplificar() ,is(new Fraccion(2,2)));		
	}

}
