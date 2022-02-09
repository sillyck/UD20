package Main;

import java.awt.EventQueue;

import Views.Saludador;

public class SaludadorApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludador frame = new Saludador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
