package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Label;

public class VentanaIngresarAsignatura {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresarAsignatura window = new VentanaIngresarAsignatura();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaIngresarAsignatura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(75, 75, 50, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigo.setBounds(75, 110, 45, 15);
		frame.getContentPane().add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripcion.setBounds(75, 145, 100, 15);
		frame.getContentPane().add(lblDescripcion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(225, 75, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(225, 110, 86, 20);
		frame.getContentPane().add(txtCodigo);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(225, 145, 86, 20);
		frame.getContentPane().add(txtDescripcion);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAceptar.setBackground(new Color(255, 255, 255));
		btnAceptar.setForeground(new Color(0, 255, 0));
		btnAceptar.setBounds(100, 200, 200, 30);
		frame.getContentPane().add(btnAceptar);
		
		lblNewLabel_1 = new JLabel("Ingresar Asignatura");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(100, 25, 186, 30);
		frame.getContentPane().add(lblNewLabel_1);
	}
	public void setVisible(boolean mostrar) {
		frame.setVisible(mostrar);
	}
}
