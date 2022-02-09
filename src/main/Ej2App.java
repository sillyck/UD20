/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 2
 */

package main;

import java.awt.EventQueue;
import vista.Ej2;

public class Ej2App {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 frame = new Ej2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
