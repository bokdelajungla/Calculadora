import calculadora.Suma;

public class TestSuma {

	public static void main(String[] args) {
		
		Suma suma = new Suma();
		
		System.out.println("suma reales");
		System.out.println(suma.sumaReales(1, 2));
		System.out.println(suma.sumaReales(-1, -2));
		double i = suma.sumaReales(Double.MAX_VALUE, Double.MAX_VALUE);
		System.out.println(i);
		System.out.println("suma enteros");
		System.out.println(suma.sumaEnteros(1, 2));
		System.out.println(suma.sumaEnteros(-1, -2));
		int j = suma.sumaEnteros(Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println(j);
		System.out.println("suma 3 reales");
		System.out.println(suma.suma3Reales(1, 2, 3));
		System.out.println(suma.suma3Reales(1, 2, -3));
		System.out.println("sumatorio");
		suma.sumatorio(1);
		System.out.println(suma.getAcumulado());
		suma.sumatorio(9);
		System.out.println(suma.getAcumulado());
	}
}
