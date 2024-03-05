package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import CapaGrafica.Controladores.ControladorRegistrarAlumno;
import CapaGrafica.Controladores.ControladorRegistrarInscripcion;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistrarInscripcion{

	private JFrame frmRegistrarInscripcion;
	private JPanel contentPane;
	private JTextField txtCed;
	private JTextField txtCod;
	private JTextField txtMonto;
	private JTextField txtAnio;
	private JButton btnVolver;
	private JButton btnRegistrar;
	private VentanaPrincipal ventanaPrincipal;
	private ControladorRegistrarInscripcion controlador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaRegistrarInscripcion window = new VentanaRegistrarInscripcion(ventanaPrincipal);
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
	public VentanaRegistrarInscripcion(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorRegistrarInscripcion(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrarInscripcion = new JFrame();
		frmRegistrarInscripcion.setTitle("REGISTRAR INSCRIPCION");
		frmRegistrarInscripcion.getContentPane().setBackground(new Color(255, 255, 255));
		frmRegistrarInscripcion.setBounds(100, 100, 450, 300);
		frmRegistrarInscripcion.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmRegistrarInscripcion.getContentPane().setLayout(null);
		frmRegistrarInscripcion.setResizable(false);


		JLabel lblCedulaAlumno = new JLabel("Ingrese cedula del alumno");
		lblCedulaAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaAlumno.setBounds(21, 43, 153, 19);
		frmRegistrarInscripcion.getContentPane().add(lblCedulaAlumno);

		JLabel lblCodigoAsignatura = new JLabel("Ingrese codigo de la asignatura");
		lblCodigoAsignatura.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigoAsignatura.setBounds(21, 88, 181, 19);
		frmRegistrarInscripcion.getContentPane().add(lblCodigoAsignatura);

		JLabel lblMontoBase = new JLabel("Ingrese monto base");
		lblMontoBase.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMontoBase.setBounds(21, 133, 118, 19);
		frmRegistrarInscripcion.getContentPane().add(lblMontoBase);

		JLabel lblAnioLectivo = new JLabel("Ingrese año lectivo");
		lblAnioLectivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAnioLectivo.setBounds(21, 173, 118, 19);
		frmRegistrarInscripcion.getContentPane().add(lblAnioLectivo);

		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(248, 43, 133, 20);
		frmRegistrarInscripcion.getContentPane().add(txtCed);

		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(248, 88, 133, 20);
		frmRegistrarInscripcion.getContentPane().add(txtCod);

		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(248, 133, 133, 20);
		frmRegistrarInscripcion.getContentPane().add(txtMonto);

		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(248, 173, 133, 20);
		frmRegistrarInscripcion.getContentPane().add(txtAnio);

		btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmRegistrarInscripcion.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		btnVolver.setBounds(71, 223, 92, 30);
		frmRegistrarInscripcion.getContentPane().add(btnVolver);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long cedula = Long.parseLong(txtCed.getText());
				String codigo = txtCod.getText();
				float monto = Float.parseFloat(txtMonto.getText());
				int anio = Integer.parseInt(txtAnio.getText());
				controlador.registrarInscripcion(codigo, cedula, monto, anio);
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegistrar.setBackground(new Color(0x198754));
		btnRegistrar.setBounds(237, 223, 114, 30);
		frmRegistrarInscripcion.getContentPane().add(btnRegistrar);
	}

	public void setVisible(boolean mostrar) {
		frmRegistrarInscripcion.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
