package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import CapaGrafica.Controladores.ControladorRegistrarAlumno;

import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListadoEscolaridad {

	private JFrame frmListarEscolaridad;
	private JTextField txtCed;
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
					VentanaListadoEscolaridad window = new VentanaListadoEscolaridad(ventanaPrincipal);
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
	public VentanaListadoEscolaridad(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		//controlador = new Controlador(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarEscolaridad = new JFrame();
		frmListarEscolaridad.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarEscolaridad.setTitle("LISTAR ESCOLARIDAD");
		frmListarEscolaridad.setBounds(100, 100, 395, 246);
		frmListarEscolaridad.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmListarEscolaridad.getContentPane().setLayout(null);
		
		JLabel lblCedula = new JLabel("Indique cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(32, 45, 101, 19);
		frmListarEscolaridad.getContentPane().add(lblCedula);
		
		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(183, 45, 128, 20);
		frmListarEscolaridad.getContentPane().add(txtCed);
		
		JLabel lblModoListado = new JLabel("Indique modo");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(32, 105, 101, 19);
		frmListarEscolaridad.getContentPane().add(lblModoListado);
		
		JRadioButton rdbtnParcial = new JRadioButton("Parcial");
		rdbtnParcial.setBackground(Color.WHITE);
		rdbtnParcial.setBounds(183, 104, 71, 23);
		frmListarEscolaridad.getContentPane().add(rdbtnParcial);
		
		JRadioButton rdbtnCompleto = new JRadioButton("Completo");
		rdbtnCompleto.setBackground(Color.WHITE);
		rdbtnCompleto.setBounds(279, 104, 79, 23);
		frmListarEscolaridad.getContentPane().add(rdbtnCompleto);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarEscolaridad.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(69, 159, 92, 30);
		frmListarEscolaridad.getContentPane().add(btnVolver);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(219, 159, 100, 30);
		frmListarEscolaridad.getContentPane().add(btnListar);
	}
	
	public void setVisible(boolean mostrar) {
		frmListarEscolaridad.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
