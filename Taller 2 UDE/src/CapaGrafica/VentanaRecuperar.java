package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaRecuperar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRecuperar frame = new VentanaRecuperar();
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
	public VentanaRecuperar() {
		setTitle("RECUPERAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 139);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(27, 30, 92, 30);
		contentPane.add(btnVolver);
		
		JButton btnTituloRecuperar = new JButton("RECUPERAR");
		btnTituloRecuperar.setForeground(Color.BLACK);
		btnTituloRecuperar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnTituloRecuperar.setBackground(Color.GREEN);
		btnTituloRecuperar.setBounds(165, 30, 114, 30);
		contentPane.add(btnTituloRecuperar);
	}
}
