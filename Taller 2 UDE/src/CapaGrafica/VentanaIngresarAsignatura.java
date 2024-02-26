package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaIngresarAsignatura {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtDescripcion;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(56, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(56, 88, 46, 14);
		frame.getContentPane().add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(56, 131, 74, 14);
		frame.getContentPane().add(lblDescripcion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(134, 46, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(134, 85, 86, 20);
		frame.getContentPane().add(txtCodigo);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(134, 128, 86, 20);
		frame.getContentPane().add(txtDescripcion);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(242, 196, 89, 23);
		frame.getContentPane().add(btnAceptar);
	}
	public void setVisible(boolean mostrar) {
		frame.setVisible(mostrar);
	}
}
