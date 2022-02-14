package Clases;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio4 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField num1, num2, resultado;
	private JButton restar, sumar, multiplicar, dividir, cerrar, about;
	private JLabel titulo, txt1, txt2, result;

	public Ejercicio4() {
		setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(100, 100, 100, 20);
		add(num1);
		
		num2 = new JTextField();
		num2.setBounds(100, 130, 100, 20);
		add(num2);
		
		resultado = new JTextField();
		resultado.setBounds(100, 160, 100, 20);
		add(resultado);
		
		sumar = new JButton("Sumar");
		sumar.setBounds(220, 160, 100, 50);
		add(sumar);
		sumar.addActionListener(this);
		
		restar = new JButton("Restar");
		restar.setBounds(220, 100, 100, 50);
		add(restar);
		restar.addActionListener(this);

		multiplicar = new JButton("Multiplicar");
		multiplicar.setBounds(220, 220, 100, 50);
		add(multiplicar);
		multiplicar.addActionListener(this);

		dividir = new JButton("Dividir");
		dividir.setBounds(220, 280, 100, 50);
		add(dividir);
		dividir.addActionListener(this);

		cerrar = new JButton("Salir");
		cerrar.setBounds(100, 200, 100, 50);
		add(cerrar);
		cerrar.addActionListener(this);
		
		about = new JButton("About");
		about.setBounds(100, 260, 100, 50);
		add(about);
		about.addActionListener(this);

		titulo = new JLabel("CALCULADORA");
		titulo.setBounds(150, 40, 200, 30);
		add(titulo);

		txt1 = new JLabel("Número 1 ");
		txt1.setBounds(10, 95, 200, 30);
		add(txt1);

		txt2 = new JLabel("Número 2 ");
		txt2.setBounds(10, 125, 200, 30);
		add(txt2);

		result = new JLabel("Resultado ");
		result.setBounds(10, 155, 200, 30);
		add(result);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sumar) {
			String numero1 = num1.getText();
			String numero2 = num2.getText();
			int num1 = Integer.parseInt(numero1);
			int num2 = Integer.parseInt(numero2);
			int result = num1 + num2;
			String total = String.valueOf(result);
			resultado.setText(total);
		}
		if (e.getSource() == restar) {
			String numero1 = num1.getText();
			String numero2 = num2.getText();
			int num1 = Integer.parseInt(numero1);
			int num2 = Integer.parseInt(numero2);
			int result = num1 - num2;
			String total = String.valueOf(result);
			resultado.setText(total);
		}
		if (e.getSource() == multiplicar) {
			String numero1 = num1.getText();
			String numero2 = num2.getText();
			int num1 = Integer.parseInt(numero1);
			int num2 = Integer.parseInt(numero2);
			int result = num1 * num2;
			String total = String.valueOf(result);
			resultado.setText(total);
		}
		if (e.getSource() == dividir) {
			String numero1 = num1.getText();
			String numero2 = num2.getText();
			int num1 = Integer.parseInt(numero1);
			int num2 = Integer.parseInt(numero2);
			int result = num1 / num2;
			String total = String.valueOf(result);
			resultado.setText(total);
		}
		if (e.getSource() == cerrar) {
			System.exit(0);
		}
		if(e.getSource() == about) {
			JOptionPane.showMessageDialog(null, "Esta aplicación es una mini calculadora con 4 operaciones");
		}
	}
}