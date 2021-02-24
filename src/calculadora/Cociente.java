package Calculadora;

/**
 * La clase {@code Cociente} implementa cuatro m�todos relacionados con la divisi�n de n�meros
 * @author JSAlor
 * @version 1.0 
 */
public class Cociente {
	
	Double doble;

	/**
	 * Recibe dos n�meros reales y devuelve un {@code double} con el resultado de dividir ambos n�meros.
	 * Casos especiales:
	 * <ul><li>Si el par�metro que se pasa como divisor es 0, el m�todo mostrar� un aviso y devolver� un 
	 * {@code double} con el valor Infinito.</li></ul>
	 * 
	 * @param a Dividendo de la operaci�n.
	 * @param b Divisor de la operaci�n.
	 * @return Un {@code double}  con el cociente. En el caso de que el divisor <b>b</b> sea <b>0</b>, muestra un mensaje 
	 * de aviso y devuelve <b>Infinito</b>.
	 */
	public double divisionReales (double a, double b) {
		/*Comprobar que el divisor no sea 0*/
		if (b==0) {
			System.out.println("AVISO: No se puede dividir por 0");
			return a/b;
		}
		else {
			return a/b;
		}
		
	}
	
	/**
	 * Recibe dos n�meros, los aproxima al entero inferior y devuelve un {@code double} la parte entera
	 * que resulta de dividir ambos n�meros.
	 * Casos especiales:
	 * <ul><li>Si el par�metro que se pasa como divisor es 0, el m�todo mostrar� un aviso y devolver� un 
	 * {@code double} con el valor Infinito.</li></ul>
	 * 
	 * @param a Dividendo de la operaci�n.
	 * @param b Divisor de la operaci�n.
	 * @return un {@code double}, con el menor entero que resulta de la operaci�n, o <b>Infinito</b> en 
	 * el caso de que el divisor <b>b</b> sea <b>0</b>.
	 */
	public double divisionEnteros (double a, double b) {
		/*Eliminamos la parte decimal*/
		a = Math.floor(a);
		b = Math.floor(b);
		/*Comprobar que el divisor no sea 0*/
		if (b==0) {
			System.out.println("ERROR: No se puede dividir por 0");
			return a/b;
		}
		else {
			return Math.floor(a/b);
		}
		
	}
	
	/**
	 * Recibe un n�mero como par�metro y devuelve el inverso.
	 * Casos especiales:
	 * <ul><li>Si el par�metro que se pasa es 0, el m�todo mostrar� un aviso y devolver� un 
	 * {@code double} con el valor Infinito.</li></ul>
	 * 
	 * @param a
	 * @return El inverso del n�mero, o Infinito en caso de que �ste sea 0.
	 */
	public double inverso (double a) {
		/*Eliminamos la parte decimal*/
		if (a==0) {
			System.out.println("ERROR: No se puede dividir por 0"); 
		}
		return 1/a;
	}
	
	/**
	 * Realiza la ra�z cuadrada del n�mero que se le pasa como par�metro.
	 * @param a el n�mero del que se deseaa saber la ra�z cuadrada
	 * @return la ra�z cuadrada del parametro recibido.
	 */
	public double raizCuadrada (double a) {
		return Math.sqrt(a);
	}
}
