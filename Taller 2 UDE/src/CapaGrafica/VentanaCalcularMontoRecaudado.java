package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import CapaGrafica.Controladores.ControladorCalcularMontoRecaudado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalcularMontoRecaudado {

	private JFrame frmMontoRecaudado;
	private JTextField txtCed;
	private JTextField txtAnio;
	private ControladorCalcularMontoRecaudado controlador;
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
					VentanaCalcularMontoRecaudado window = new VentanaCalcularMontoRecaudado(ventanaPrincipal);
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
	public VentanaCalcularMontoRecaudado(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		///controlador = new Controlador(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMontoRecaudado = new JFrame();
		frmMontoRecaudado.getContentPane().setBackground(new Color(255, 255, 255));
		frmMontoRecaudado.setTitle("MONTO RECAUDADO");
		frmMontoRecaudado.setBounds(100, 100, 389, 236);
		frmMontoRecaudado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMontoRecaudado.getContentPane().setLayout(null);
		
		JLabel lblCedAlumno = new JLabel("Ingrese cedula del alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(31, 33, 152, 19);
		frmMontoRecaudado.getContentPane().add(lblCedAlumno);
		
		JLabel lblAnioLectivo = new JLabel("Ingrese año lectivo");
		lblAnioLectivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAnioLectivo.setBounds(31, 83, 109, 19);
		frmMontoRecaudado.getContentPane().add(lblAnioLectivo);
		
		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(220, 32, 122, 20);
		frmMontoRecaudado.getContentPane().add(txtCed);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(220, 82, 122, 20);
		frmMontoRecaudado.getContentPane().add(txtAnio);
		
		final JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long cedula = Long.parseLong(txtCed.getText());
				int anio = Integer.parseInt(txtAnio.getText());
				//JOptionPane.showMessageDialog(null, controlador.montoRecaudado(cedula, anio));
			}
		});
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setBounds(194, 138, 100, 30);
		frmMontoRecaudado.getContentPane().add(btnCalcular);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmMontoRecaudado.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(59, 138, 92, 30);
		frmMontoRecaudado.getContentPane().add(btnVolver);
	}
	
	public void setVisible(boolean mostrar) {
		frmMontoRecaudado.setVisible(mostrar);
	}

	
	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
