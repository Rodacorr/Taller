package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListadoAlumnoApellido {

	private JFrame frmListarAlumnosApe;
	private JTextField textField;
	//private Controlador controlador;
	private VentanaPrincipal ventanaPrincipal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaListadoAlumnoApellido window = new VentanaListadoAlumnoApellido(ventanaPrincipal);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaListadoAlumnoApellido(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		//controlador = new Controlador(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarAlumnosApe = new JFrame();
		frmListarAlumnosApe.setTitle("LISTAR ALUMNOS DADO APELLIDO");
		frmListarAlumnosApe.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAlumnosApe.getContentPane().setLayout(null);
		
		JLabel lblApellidoIngresado = new JLabel("Ingrese apellido o prefijo");
		lblApellidoIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoIngresado.setBounds(38, 29, 141, 19);
		frmListarAlumnosApe.getContentPane().add(lblApellidoIngresado);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(250, 29, 122, 20);
		frmListarAlumnosApe.getContentPane().add(textField);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAlumnosApe.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(61, 85, 92, 30);
		frmListarAlumnosApe.getContentPane().add(btnVolver);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(250, 85, 100, 30);
		frmListarAlumnosApe.getContentPane().add(btnListar);
		frmListarAlumnosApe.setBounds(100, 100, 450, 164);
		frmListarAlumnosApe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setVisible(boolean mostrar) {
		frmListarAlumnosApe.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
