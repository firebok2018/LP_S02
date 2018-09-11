package Ejercicios;

public class Ejemplo_de_hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread hilo1= new proceso("Proceso 1");
		Thread hilo2= new proceso("Proceso 2");

		hilo1.start();
		hilo2.start();
	}

}
