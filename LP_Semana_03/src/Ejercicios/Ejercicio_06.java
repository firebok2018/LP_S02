package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1=20,num2=5;
			int res=num1/num2;
			String cadena="abc";
			int num3=Integer.parseInt(cadena);
			System.out.print("Numero 1 : "+num1 );
			System.out.print("Numero 2 : "+num2 );
			System.out.print("Cadena   : "+cadena );
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "El denomidador no de be ser cero.......");
		}catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Argumento Incompatible",null,JOptionPane.ERROR_MESSAGE);
		}finally {
			System.out.println("CIBERTEC");
		}
		System.out.println("2018");
	

	}

}
