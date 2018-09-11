package Ejercicios;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1,n2,suma;
			n1=Integer.parseInt("8");
			n2=Integer.parseInt("Nueve");
			suma=n1+n2;
			System.out.println("La suma es :" + suma);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Hola sigo ejecutando");

	}

}
