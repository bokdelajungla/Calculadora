package Calculadora;

/**
 * Esta es una clase para calcular el producto.
 * 
 * @author cesar
 * @since 13/02/21
 */

public class Producto {

	/**
	 * Calcula el producto de dos numeros reales.
	 * 
	 * @param num1 Es la variable que recogerá el primer dato.
	 * @param num2 Es la Variable que recogerá el segundo dato para calcularlo junto
	 *             con la anterior variable.
	 * @return Devuelve el resultado de multiplicar num1 por num2.
	 */
	public double multiplicar(double num1, double num2) {
		double productodouble = (num1 * num2);
		return productodouble;
	}

	/**
	 * Calcula el producto de dos numeros enteros.
	 *  <h2> <b>ATENCION: </b> Si los numeros introducidos son muy grandes no nos permitira ejecutar, ya que se sale de los rangos .</h2>
	 * 
	 * @param num1 Es la variable que recogerá el primer dato.
	 * @param num2 Es la Variable que recogerá el segundo dato para calcularlo junto
	 *             con la anterior variable.
	 * @return Devuelve el resultado de multiplicar num1 por num2.
	 */
	public int multiplicar(int num1, int num2) {
		int productoint = (num1 * num2);
		return productoint;
	}

	/**
	 * Calcula el producto de tres numeros reales.
	 * 
	 * @param num1 Es la variable que recogerá el primer dato.
	 * @param num2 Es la Variable que recogerá el segundo dato.
	 * @param num3 Es la Variable que recogerá el tercer dato.
	 * @return Devuelve el resultado de multiplicar num1 por num2 y num3.
	 */
	public double multiplicar(double num1, double num2, double num3) {
		double productodouble = (num1 * num2 * num3);
		return productodouble;
	}

	/**
	 * Calcula la potencia de un numero.
	 * 
	 * @param num1 Es la variable que recogerá el primer dato, siendo esta la base.
	 * @param num2 Es la variable que recogerá el segundo dato, siendo esta el
	 *             exponente.
	 * @return Devuelve el resultado de la base elevada al exponente.
	 */
	public double potencia(double num1, double num2) {
		double potencia = (Math.pow(num1, num2));
		return potencia;

	}
}
