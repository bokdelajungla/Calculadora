import calculadora.Cociente;

public class TestCociente {

	public static void main(String[] args) {

		Cociente ale = new Cociente();

		System.out.println("divisionEnteros");
		System.out.println("0/0");
		System.out.println(ale.divisionEnteros(0, 0));
		System.out.println("+/+ decimales");
		System.out.println(ale.divisionEnteros(1.1111, 1.55555));
		System.out.println("-/+");
		System.out.println(ale.divisionEnteros(-4, 2));
		System.out.println("+/0");
		System.out.println(ale.divisionEnteros(1, 0));
		System.out.println("-/0");
		System.out.println(ale.divisionEnteros(-1, 0));

		System.out.println("divisionReales");
		System.out.println("0/0");
		System.out.println(ale.divisionReales(0, 0));
		System.out.println("+/+ decimales");
		System.out.println(ale.divisionReales(1.1111, 1.55555));
		System.out.println("-/+ decimales");
		System.out.println(ale.divisionReales(-1.89, 2.04));
		System.out.println("+/0");
		System.out.println(ale.divisionReales(1, 0));
		System.out.println("-/0");
		System.out.println(ale.divisionReales(-1, 0));
		
		System.out.println("inverso");
		System.out.println("+ decimal");
		System.out.println(ale.inverso(2.79));
		System.out.println("- decimal");
		System.out.println(ale.inverso(-2.79));
		System.out.println("0");
		System.out.println(ale.inverso(0));
		System.out.println("Muy grande");
		
		System.out.println(ale.raizCuadrada(-2));
		System.out.println(ale.raizCuadrada(4));
	
		double a = ale.divisionEnteros(1, 0);
		if (Double.isNaN(a)) System.out.println("El resultado es NaN");
		if (Double.isInfinite(a)) System.out.println("El resultado es Infinto");
	}

}
