import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class AppIMC extends JFrame {

	private JPanel contentPane;
	private JTextField textPESO;
	private JTextField textALTURA;
	private JTextField textIMC;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppIMC frame = new AppIMC();
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
	public AppIMC() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PESO (kg)");
		lblNewLabel.setBounds(10, 13, 56, 14);
		contentPane.add(lblNewLabel);
		
		textPESO = new JTextField();
		textPESO.setBounds(76, 11, 79, 17);
		contentPane.add(textPESO);
		textPESO.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ALTURA (m)");
		lblNewLabel_1.setBounds(10, 41, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		textALTURA = new JTextField();
		textALTURA.setColumns(10);
		textALTURA.setBounds(76, 39, 79, 17);
		contentPane.add(textALTURA);
		
		JLabel lblNewLabel_2 = new JLabel("IMC:");
		lblNewLabel_2.setBounds(176, 13, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textIMC = new JTextField();
		textIMC.setBounds(207, 10, 86, 20);
		contentPane.add(textIMC);
		textIMC.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Kg/m²");
		lblNewLabel_3.setBounds(303, 13, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				float imc=0;
				float peso=0;	
				float altura=0;
				
				peso = Float.parseFloat(textPESO.getText());
				altura = Float.parseFloat(textALTURA.getText());
				
				imc = peso / (altura * altura);
				
				String valor = String.format("%.1f",imc);
				
				textIMC.setText(valor);
			}
		});
		
		btnNewButton.setBounds(141, 123, 152, 65);
		contentPane.add(btnNewButton);
	}
}
