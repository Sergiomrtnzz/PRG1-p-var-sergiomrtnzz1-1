package es.unileon.prg.tema5;

import java.math.BigDecimal;

/**
 * Clase con los ejercicios correspondientes a tipos de datos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030101 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Tipos de datos basicos";
	}

	/**
	 * Tipos de datos basicos - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide modificar el codigo a fin de eliminar los errores de compilacion
	 * existentes. Los errores de compilacion tienen que ver con el manejo de
	 * tipos de datos basicos.
	 */
	public void ejercicio01() {
		cabecera("01", "Correccion de errores de compilacion");

		// Inicio modificacion
		Int entero = 6;
		long otroEntero = 1.000;     // 10000 excede el límite de byte (-128 a 127)
		long decimal = 7.0;
		double otroDecimal = 7,0;
		byte enteroDe8Bits = 100;
		char caracter = a;
		char otroCaracter = "a";
		boolean booleano = "true";
		short enteroDe16Bits = 5000;   // 50000 excede el límite de short (-32768 a 32767)

		byte estatico = 5;      // 'static' es palabra reservada
		byte enteroInt = 3;     //'int' es palabra reservada
		double otraVariable = 2.0;  // Los guiones no están permitidos en identificadores
}
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo a fin de determinar el tipo de dato mas
	 * adecuado para cada literal.
	 */
	public void ejercicio02() {
		cabecera("02", "Definicion de tipo de datos");

		// Inicio modificacion
		int variable1 = 637;           //usamos el int para valores pequenos enteros, ya que es el tipo de dato entero mas comun y eficiente en Java.
    	long variable2 = 637L;         //usamos el long para valores enteros grandes, ya que tiene un rango mayor que el int.
    	double variable3 = 6.37;       //usamos el double para valores decimales con alta precision.
    	float variable4 = 6.37f;
    	double variable5 = 6.37d;
    	char variable6 = '6';
    	String variable7 = "6.37";
    	char variable8 = 'a';
    	String variable9 = "a";
    	boolean variable10 = true;    //usamos el boolean para valores que solo pueden ser verdadero o falso.      

		//Fin modificacion 
	}

	/**
	 * Tipos de datos basicos - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide definir variables que permitan representar la informacion
	 * referida en los comentarios.
	 */
	public void ejercicio03() {
		cabecera("03", "Definicion de variables");

		// Inicio modificacion

		//Numero de asignaturas de un curso
		byte numAsignaturas;
		//Nota media de la asignatura
		double notaMedia;
		//Edad de una persona
		int edad;
		//Salario mensual de un empleado
		double salarioMensual;
		//Nombre de una asignatura
		String nombreAsignatura;
		//Constante PI
		final double PI = 3.141592653589793;
		//Constante VERDADERO
		final boolean VERDADERO = true;
		//Portal de la direccion de una vivienda
		int portal;
		//Piso de la direccion de una vivienda
		int piso;
		//Puerta la direccion de una vivienda
		char puerta; // o String
	

		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio4.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.txt el porque de los resultados
	 * </ul>
	 */
	public void ejercicio04() {
		cabecera("04", "Formato decimales");

		// Inicio modificacion
		double valor1 = 2.8;
		double valor2 = 1.5;

		double resultado = valor1 - valor2;
		System.out.println(valor1+" - "+valor2+" = "+resultado);
		//al hacer los calculos con double, el resultado no es exacto debido a la representacion binaria de los numeros decimales, lo que puede llevar a errores de precision.
		// Fin modificacion
	}


	/**
	 * Tipos de datos basicos - Ejercicio5.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * </ul>
	 */
	public void ejercicio05() {
		cabecera("05", "La clase <<BigDecimal>>");

		// Inicio modificacion
		BigDecimal valor1 = new BigDecimal("2.8");
		BigDecimal valor2 = new BigDecimal("1.5");

		System.out.println(valor1+" - "+valor2+" = "+valor1.subtract(valor2));
		// Fin modificacion
	}
}
