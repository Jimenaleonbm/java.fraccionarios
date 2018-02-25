package com.jimenaleon.fraccionarios;

/**
 * Hello world!
 *
 */
public class App 
{
	static Fraccion test = new Fraccion(2,5);
	
    public static void main( String[] args )
    {
    	test.dividir(3,4);
        System.out.println( test.numerador );
        System.out.println( "-" );
        System.out.println( test.denominador );
    }
}
