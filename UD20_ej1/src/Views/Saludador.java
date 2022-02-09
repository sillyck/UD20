package Views;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Saludador() 
	{
		setTitle("Saludador");
		setBounds(400, 200, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		JTextField textField = new JTextField();
		JButton btn = new JButton("¡Saludar!");
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(btn, "¡Hola " + textField.getText() + "!");
			}
		});
		
		etiqueta.setBounds(60, 45, 265, 20);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(60, 107, 265, 26);
		btn.setBounds(145, 170, 89, 23);
		
		contentPane.add(etiqueta);
		contentPane.add(textField);
		contentPane.add(btn);
	}

}
