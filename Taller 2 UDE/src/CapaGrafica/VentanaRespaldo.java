package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

public class VentanaRespaldo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRespaldo frame = new VentanaRespaldo();
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
	public VentanaRespaldo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloRespaldo = new JLabel("Respaldar");
		lblTituloRespaldo.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloRespaldo.setBounds(73, 0, 103, 26);
		contentPane.add(lblTituloRespaldo);
		
		JLabel lblRespaldar = new JLabel("Deseas Respaldar?");
		lblRespaldar.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRespaldar.setBounds(59, 49, 123, 19);
		contentPane.add(lblRespaldar);
		
		JCheckBox chckbxRespal = new JCheckBox("SI");
		chckbxRespal.setBounds(59, 94, 41, 23);
		contentPane.add(chckbxRespal);
		
		JCheckBox chckbxRespal2 = new JCheckBox("NO");
		chckbxRespal2.setBounds(141, 94, 41, 23);
		contentPane.add(chckbxRespal2);
	}

}
