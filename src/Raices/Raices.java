package Raices;

public class Raices {
	// Atributos.
	private double a;
	private double b;
	private double c;
	
	// Constructores.
	// Pasandole parametros.
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Metodos.
	// Calcula el discriminante.
	public double getDiscriminante() {
		double discriminante = ((Math.pow(this.b, 2)-(4 * this.a * c)));
		return discriminante;
	}
	
	// Devuelve boolean indicando si tiene 2 soluciones, disc. >= 0
	public boolean tieneRaices() {
		boolean tieneRaices = false;
		
		if(getDiscriminante() >= 0) {
			tieneRaices = true;
		}
		return tieneRaices;
	}
	
	// Devuelve boolean indicando si tiene 1 solucion, disc. == 0
	public boolean tieneRaiz() {
		boolean tieneRaiz = false;
		
		if(getDiscriminante() == 0) {
			tieneRaiz = true;
		}
		return tieneRaiz;
	}
	
	// Imprime las dos posibles soluciones.
	public void obtenerRaices() {
		double[] soluciones = new double[2];
		
		double x1 = (-this.b + Math.sqrt( ((Math.pow(this.b, 2)) - (4 * this.a * c))) ) / (2*this.a);
		double x2 = (-this.b - Math.sqrt( ((Math.pow(this.b, 2)) - (4 * this.a * c))) ) / (2*this.a);
		
		if(tieneRaices()) {
			soluciones[0] = x1;
			soluciones[1] = x2;
			
			if(soluciones[0] != soluciones[1]) {
				for (int i = 0; i < soluciones.length; i++) {
					System.out.println("Solucion " +(i+1)+ ": " + soluciones[i]);
				}
			}
		}
	}
	
	// Imprime unica raiz cuando solo tenga una solucion posible.
	public void obtenerRaiz() {
		double solucion=0;
		
		double x1 = (-this.b + Math.sqrt( ((Math.pow(this.b, 2)) - (4 * this.a * c))) ) / (2*this.a);
		
		if(tieneRaiz()) {
			solucion = x1;
			System.out.println("Solucion: " + solucion);	
		}	
	}
	
	// Muestra posibles soluciones, si no hay tambien.
	public void calcular() {
		
		if(tieneRaices() && !tieneRaiz()) {
			System.out.println("Hay 2 posibles soluciones.");
			
		}else if(tieneRaiz()){
			System.out.println("Hay 1 posible solucion.");
			
		}else {
			System.out.println("No hay soluciones.");
		}
	}
}
