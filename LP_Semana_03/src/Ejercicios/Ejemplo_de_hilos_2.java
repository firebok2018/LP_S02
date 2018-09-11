package Ejercicios;

public class Ejemplo_de_hilos_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo hilo1 = new Hilo(1000,"Hilo rapido");
		Hilo hilo2 = new Hilo(2000,"Hilo rapido");
		
		hilo1.start();
		hilo2.start();

	}

}
