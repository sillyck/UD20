package Views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MiniEncuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniEncuesta frame = new MiniEncuesta();
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
	public MiniEncuesta() 
	{
		setTitle("Saludador");
		setBounds(400, 200, 400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel etiqueta = new JLabel("Sistema Operatiu");
		etiqueta.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel etiqueta2 = new JLabel("Carrec");
		etiqueta2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton opcion1 = new JRadioButton("Windows", true);
		JRadioButton opcion2 = new JRadioButton("Linux", false);
		JRadioButton opcion3 = new JRadioButton("Mac", false);
		
		JCheckBox check1 = new JCheckBox("Programción", false);
		JCheckBox check2 = new JCheckBox("Diseño gráfico", false);
		JCheckBox check3 = new JCheckBox("Administración", false);
		
		JLabel etiqueta3 = new JLabel("Horas dedicadas en el ordenador");
		etiqueta3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JSlider slider = new JSlider(0, 10);
		slider.setValue(0);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		
		JButton btn = new JButton("Enviar");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(opcion1);
		grupo.add(opcion2);
		grupo.add(opcion3);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String str = "";
				str += "Sistema Operativo: " + (opcion1.isSelected() ? opcion1.getText() : opcion2.isSelected() ? opcion2.getText() : opcion3.getText()) + "\n";
				if(check1.isSelected() || check2.isSelected() || check3.isSelected())
				{
					str += "Cargo: \n" + (check1.isSelected() ? "\t- " + check1.getText() + "\n" : "") + (check2.isSelected() ? "\t- " + check2.getText() + "\n" : "") + (check2.isSelected() ? "\t- " + check2.getText() + "\n" : "");
				}
				str += "Horas dedicadas en el ordenador: " + slider.getValue();
				JOptionPane.showMessageDialog(btn, str);
			}
		});

		etiqueta.setBounds(40, 21, 99, 23);
		opcion1.setBounds(40, 51, 109, 23);
		opcion2.setBounds(40, 77, 109, 23);
		opcion3.setBounds(40, 103, 109, 23);
		etiqueta2.setBounds(205, 21, 99, 23);
		check1.setBounds(195, 51, 109, 23);
		check2.setBounds(195, 77, 109, 23);
		check3.setBounds(195, 103, 109, 23);
		etiqueta3.setBounds(83, 163, 190, 23);
		slider.setBounds(83, 197, 190, 38);
		btn.setBounds(116, 263, 126, 20);

		contentPane.add(etiqueta);
		contentPane.add(opcion1);
		contentPane.add(opcion2);
		contentPane.add(opcion3);
		contentPane.add(etiqueta2);
		contentPane.add(check1);
		contentPane.add(check2);
		contentPane.add(check3);
		contentPane.add(etiqueta3);
		contentPane.add(slider);
		contentPane.add(btn);
	}

}
