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
		setTitle("LISTAR ALUMNO DADO SU CEDULA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 141);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCedulaIngresado = new JLabel("Indique cedula");
		lblCedulaIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaIngresado.setBounds(52, 11, 101, 19);
		contentPane.add(lblCedulaIngresado);
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(193, 10, 136, 20);
		contentPane.add(textCed);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 131, 464, 0);
		contentPane.add(separator_1);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(203, 51, 100, 30);
		contentPane.add(btnListar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(62, 51, 92, 30);
		contentPane.add(btnVolver);
	}
}
