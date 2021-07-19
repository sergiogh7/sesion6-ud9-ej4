package RaicesApp;

import Raices.Raices;

public class RaicesApp {

	public static void main(String[] args) {
		
		Raices raiz1 = new Raices(-1, 7, 10); // 2 soluciones.
		Raices raiz2 = new Raices(1, -3, 2); // Deberia salir 2 y 1.
		Raices raiz4 = new Raices(1, 1, 2); // Tiene una solucion.
		Raices raiz3 = new Raices(1, -2, 1); // No tiene solucion.

		// 2 soluciones
		System.out.println("PRUEBA 1:");
		raiz1.calcular();
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		System.out.println();
		
		// Deberia salir 2 y 1, doble solucion
		System.out.println("PRUEBA 2:");
		raiz2.calcular();
		raiz2.obtenerRaices();
		raiz2.obtenerRaiz();
		System.out.println();
		
		// No tiene solucion
		System.out.println("PRUEBA 3:");
		raiz3.calcular();
		raiz3.obtenerRaices();
		raiz3.obtenerRaiz();
		System.out.println();
		
		// Tiene una solucion
		System.out.println("PRUEBA 4:");
		raiz4.calcular();
		raiz4.obtenerRaices();
		raiz4.obtenerRaiz();
		
		
		
	}

}
