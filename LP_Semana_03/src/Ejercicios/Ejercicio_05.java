package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
