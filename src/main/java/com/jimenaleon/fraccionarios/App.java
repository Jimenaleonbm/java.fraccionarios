package com.jimenaleon.fraccionarios;

/**
 * Hello world!
 *
 */
public class App 
{
	static Fraccion test = new Fraccion(2,4);
	
    public static void main( String[] args )
    {
    	test.simplificar();
        System.out.println( test.numerador );
        System.out.println( "-" );
        System.out.println( test.denominador );
    }
}
