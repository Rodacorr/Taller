package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;

public class VentanaListadoCedula extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListadoCedula frame = new VentanaListadoCedula();
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
	public VentanaListadoCedula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 167);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListar = new JLabel("LISTAR ALUMNO DADO SU CEDULA");
		lblTituloListar.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloListar.setBounds(25, 0, 353, 40);
		contentPane.add(lblTituloListar);
		
		JLabel lblCedulaIngresado = new JLabel("Indique cedula");
		lblCedulaIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaIngresado.setBounds(51, 51, 101, 19);
		contentPane.add(lblCedulaIngresado);
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(196, 51, 136, 20);
		contentPane.add(textCed);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 131, 464, 0);
		contentPane.add(separator_1);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(218, 90, 100, 30);
		contentPane.add(btnListar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(61, 90, 92, 30);
		contentPane.add(btnVolver);
	}
}
