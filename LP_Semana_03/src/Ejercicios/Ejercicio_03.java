package Ejercicios;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String [] nombes={"Kiara","Silva","Alex","Gloria","Alicia"};
			nombes[5]="Pamela";
			for (int i = 0; i <=4; i++) {
				System.out.println(nombes[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Indice no permitido :" + e.getMessage());
		}

	}

}
