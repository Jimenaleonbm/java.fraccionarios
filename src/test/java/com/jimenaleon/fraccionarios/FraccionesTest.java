package com.jimenaleon.fraccionarios;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;


public class FraccionesTest {
	
	@Test
	public void dosCuartosSimplificadaEsIgualAUnmedio() {
		assertThat(new Fraccion(2,4).simplificar().compareTo(new Fraccion(1,2)), is(0));
	}
	
	@Test
	public void laPrimeraFraccionNoEsLaSegundaSimplificada() {
		assertThat(new Fraccion(2,4).simplificar().compareTo(new Fraccion(2,2)), is(-1));
	}
	
	@Test
	public void unMedioMasUnTercioEsIgualACincoSextos() {
		assertThat(new Fraccion(1,2).sumar(1, 3).compareTo(new Fraccion(5,6)), is(0));
	}
	
	@Test
	public void unMedioMasUnMedioEsIgualADosMedios() {
		assertThat(new Fraccion(1,2).sumar(1, 2).compareTo(new Fraccion(2,2)), is(0));
	}
	
	@Test
	public void unMedioMenosUnmedioEsIgualACeroMedios() {
		assertThat(new Fraccion(1,2).restar(1, 2).compareTo(new Fraccion(0,2)), is(0));
	}
	
	@Test
	public void dosQuintosMenosTresCuartosEsIgualAMenosSieteSobreVeinte() {
		assertThat(new Fraccion(2,5).restar(3, 4).compareTo(new Fraccion(-7,20)), is(0));
	}
	
	@Test
	public void unMedioPorUnMedioEsUnCuarto() {
		assertThat(new Fraccion(1,2).multiplicar(1, 2).compareTo(new Fraccion(1,4)), is(0));
	}
	
	@Test
	public void unMedioSobreUnMedioesIgualADosSobreDos() {
		assertThat(new Fraccion(1,2).dividir(1, 2).compareTo(new Fraccion(2,2)), is(0));
	}
}
