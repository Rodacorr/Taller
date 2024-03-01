package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import CapaGrafica.Controladores.ControladorListadoAlumnoCedula;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListadoAlumnoCedula {

	private JFrame frmListarAlumnoCed;
	private JTextField textField;
	private ControladorListadoAlumnoCedula controlador;
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
					VentanaListadoAlumnoCedula window = new VentanaListadoAlumnoCedula(ventanaPrincipal);
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
	public VentanaListadoAlumnoCedula(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorListadoAlumnoCedula(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarAlumnoCed = new JFrame();
		frmListarAlumnoCed.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAlumnoCed.getContentPane().setLayout(null);
		
		JLabel lblCedulaIngresado = new JLabel("Indique cedula");
		lblCedulaIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaIngresado.setBounds(41, 33, 101, 19);
		frmListarAlumnoCed.getContentPane().add(lblCedulaIngresado);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(172, 33, 136, 20);
		frmListarAlumnoCed.getContentPane().add(textField);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAlumnoCed.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(50, 91, 92, 30);
		frmListarAlumnoCed.getContentPane().add(btnVolver);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(192, 91, 100, 30);
		frmListarAlumnoCed.getContentPane().add(btnListar);
		frmListarAlumnoCed.setTitle("LISTAR ALUMNO DADO SU CEDULA");
		frmListarAlumnoCed.setBounds(100, 100, 376, 174);
		frmListarAlumnoCed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setVisible(boolean mostrar) {
		frmListarAlumnoCed.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
