package Ejercicio04;

public class Raices {

	// Aqu� tenemos los atributos de nuestro objeto.
	private double a, b, c;

	public Raices() {
		a = 0;
		b = 0;
		c = 0;
	}
	// Este es nuestro constructor.
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Este m�todo cuando lo llamemos lo primero que har� es ver si nuestra array
	// tiene soluci�n posible, en caso de que no la tenga lo dir� por pantalla, y si
	// tiene soluci�n ejecutara otro m�todo llamado leerArray.
	public void obtenerRaices() {

		if (tieneRaices() == true) {
			leerArray();
		} else {
			System.out.println("No tiene soluci�n.");
		}

	}

	// Este m�todo es como el anterior, pero solo va a seguir con la ejecuci�n si la
	// ecuaci�n tiene una �nica soluci�n.
	public void obtenerRaiz() {

		if (tieneRaiz() == true) {
			leerArray();
		} else if (tieneRaices() == true) {
			System.out.println("La ecuaci�n tiene m�s de una soluci�n.");

		} else {
			System.out.println("No tiene soluci�n.");
		}

	}

	// Este m�todo la �nica funci�n que tiene es calcular el discriminante que lo
	// obtendremos con la f�rmula que contiene y lo retornara.
	public double getDiscriminante() {

		return (Math.pow(b, 2) - 4 * a * c);

	}

	// Los dos m�todos siguientes son los responsables de comprobar si la ecuaci�n
	// tiene uno o dos resultados.
	public boolean tieneRaices() {

		if (getDiscriminante() >= 0) {
			return true;
		}
		return false;
	}

	public boolean tieneRaiz() {

		if (getDiscriminante() == 0) {
			return true;
		}
		return false;

	}

	// Este m�todo con la ayuda de los dos anteriores nos dir� si la ecuaci�n del
	// objeto tiene una soluci�n, dos o ninguna soluci�n real (Discriminante) y
	// ejecuta el m�todo leerArray.
	public void calcular() {

		if (tieneRaiz() == true) {
			System.out.println("La ecuaci�n tiene una soluci�n.");
			leerArray();
		} else if (tieneRaices() == true) {
			System.out.println("La ecuaci�n tiene dos soluciones.");
			leerArray();
		} else {
			System.out.println("La ecuaci�n no tiene soluci�n.");
			leerArray();

		}

	}

	// Este m�todo nos va a hacer las operaciones y las guardar� en una array.
	private double[] mates() {

		double num[] = new double[2];

		num[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		num[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);

		return num;

	}

	// Este m�todo simplemente va a leer la array tratando de forma especial si es
	// una ecuaci�n de un solo resultado.
	private void leerArray() {

		double calc[] = mates();

		if (tieneRaiz() == true) {
			System.out.println((1) + " resultado: " + calc[0]);
		} else {
			for (int i = 0; i < calc.length; i++) {
				System.out.println((i + 1) + " resultado: " + calc[i]);
			}

		}

	}

	// Zona de getters y setters.
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
