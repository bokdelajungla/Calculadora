import Calculadora.Cociente;

public class TestCociente {

	public static void main(String[] args) {

		Cociente ale = new Cociente();
		
		System.out.println(ale.divisionEnteros(4, 2));
		System.out.println(ale.divisionEnteros(1.1111, 1.55555));
		System.out.println(ale.divisionEnteros(1, 0));
		
		System.out.println(ale.divisionReales(1, 1));
		System.out.println(ale.divisionReales(1.1111, 1.55555));
		System.out.println(ale.divisionReales(-1, 0));
		
		System.out.println(ale.inverso(2));
		System.out.println(ale.inverso(0));
		
		System.out.println(ale.raizCuadrada(2));
		System.out.println(ale.raizCuadrada(4));
	
		double a = ale.divisionEnteros(1, 0);
		if (Double.isNaN(a)) System.out.println("El resultado es NaN");
		if (Double.isInfinite(a)) System.out.println("El resultado es Infinto");
	}

}
