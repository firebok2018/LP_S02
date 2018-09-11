package Ejercicios;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class proceso  extends Thread{
	//utilizamos para crear el thear
	///extendemos la clase
	
	//colocamos un constructor
	public proceso(String msg) {
		super(msg);
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName());
			
		}
	}
}
