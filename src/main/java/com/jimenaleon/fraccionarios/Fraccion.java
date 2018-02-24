package com.jimenaleon.fraccionarios;

public class Fraccion {

	int numerador;
	int denominador;
	
	public Fraccion(int numerador, int denominador) {
		if(denominador == 0) {
			throw new IllegalArgumentException("d == 0");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion simplificar() {
		
		for(int i = 2; i <= this.numerador; i++) {
			if(this.numerador % i == 0 && this.denominador % i == 0) {
				this.numerador = this.numerador / i;
				this.denominador = this.denominador / i;
			}
		}
		
		return this;
	}
	
	public Fraccion sumar(int numeradorFraccion2, int denominadorFraccion2) {
		
		this.numerador = (this.numerador * denominadorFraccion2) + (this.denominador * numeradorFraccion2);
		this.denominador = hallarDenominador(this.denominador, denominadorFraccion2);
		
		return this;
	}
	
	
	public Fraccion restar(int numeradorFraccion2, int denominadorFraccion2) {

		this.numerador = (this.numerador * denominadorFraccion2) - (this.denominador * numeradorFraccion2);
		this.denominador = hallarDenominador(this.denominador, denominadorFraccion2);
		
		return this;
	}
	
	public int hallarDenominador(int denominador1, int denominador2) {
		int denominadortmp = denominador1;
		if(denominador1 != denominador2) {
			denominadortmp = denominador1 * denominador2;
		}	
		return denominadortmp;
	}

	public Fraccion multiplicar(int numeradorFraccion2, int denominadorFraccion2) {
		
		this.numerador = this.numerador * numeradorFraccion2;
		this.denominador = this.denominador * denominadorFraccion2;
		
		return this;
	}
	
	public Fraccion dividir(int numeradorFraccion2, int denominadorFraccion2) {
		
		this.numerador = this.numerador * denominadorFraccion2;
		this.denominador = this.denominador * numeradorFraccion2;		
		
		return this;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s", numerador, denominador);
	}
	
}
