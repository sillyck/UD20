/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 2
 */

package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ej2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	
	public Ej2() {
		
		setTitle("Peliculas");
		setBounds(400, 200, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe el titulo de una pelicula");
		JTextField textField = new JTextField();
		JButton btn = new JButton("Añadir");
		
		JLabel etiqueta2 = new JLabel("Peliculas");
		JComboBox<Object> opcions = new JComboBox<>();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				opcions.addItem(textField.getText());
			}
		}
		);
		
		etiqueta.setBounds(18, 45, 178, 20);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(33, 88, 151, 26);
		opcions.setBounds(244, 88, 118, 26);
		btn.setBounds(63, 140, 89, 23);
		etiqueta2.setBounds(252, 45, 110, 20);
		etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(etiqueta);
		contentPane.add(textField);
		contentPane.add(opcions);
		contentPane.add(btn);
		contentPane.add(etiqueta2);
	}

}
