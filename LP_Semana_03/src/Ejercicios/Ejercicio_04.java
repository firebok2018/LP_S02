package Ejercicios;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String dato="Cibert";
			System.out.println(dato.substring(2,5));
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}

	}

}
