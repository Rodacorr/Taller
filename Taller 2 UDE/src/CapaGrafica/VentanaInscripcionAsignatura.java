package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CapaGrafica.Controladores.ControladorRegistrarInscripcion;
import CapaGrafica.Controladores.ControladorRegistrarResultado;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInscripcionAsignatura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCed;
	private JTextField txtCod;
	private JTextField txtMonto;
	private JTextField txtAnio;
	private JFrame frmInscripcionAsignatura;
	private ControladorRegistrarInscripcion controlador;
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
					VentanaInscripcionAsignatura window = new VentanaInscripcionAsignatura(ventanaPrincipal); //Ta mal escrita la clase
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VentanaInscripcionAsignatura(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		intialize();
		controlador = new ControladorRegistrarInscripcion(this);
	}


	/**
	 * Create the frame.
	 */
	private void intialize() {
		setTitle("REGISTRAR INSCRIPCION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 277);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCedulaAlumno = new JLabel("Ingrese cedula del alumno");
		lblCedulaAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaAlumno.setBounds(33, 23, 153, 19);
		contentPane.add(lblCedulaAlumno);
		
		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(240, 22, 133, 20);
		contentPane.add(txtCed);
		
		JLabel lblCodigoAsignatura = new JLabel("Ingrese codigo de la asignatura");
		lblCodigoAsignatura.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigoAsignatura.setBounds(33, 65, 181, 19);
		contentPane.add(lblCodigoAsignatura);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(240, 64, 133, 20);
		contentPane.add(txtCod);
		
		JLabel lblMontoBase = new JLabel("Ingrese monto base");
		lblMontoBase.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMontoBase.setBounds(33, 106, 118, 19);
		contentPane.add(lblMontoBase);
		
		JLabel lblAnioLectivo = new JLabel("Ingrese año lectivo");
		lblAnioLectivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAnioLectivo.setBounds(33, 148, 118, 19);
		contentPane.add(lblAnioLectivo);
		
		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(240, 105, 133, 20);
		contentPane.add(txtMonto);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(240, 147, 133, 20);
		contentPane.add(txtAnio);
		
		JButton btnInscribir = new JButton("INSCRIBIR");
		btnInscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long cedula = Long.parseLong(txtCed.getText());
				String codigo = txtCod.getText();
				float monto = Float.parseFloat(txtMonto.getText());
				int anio = Integer.parseInt(txtAnio.getText());
				controlador.registrarInscripcion(codigo, cedula, monto, anio);
			}
		});
		btnInscribir.setForeground(Color.BLACK);
		btnInscribir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnInscribir.setBackground(Color.GREEN);
		btnInscribir.setBounds(240, 197, 100, 30);
		contentPane.add(btnInscribir);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmInscripcionAsignatura.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(78, 197, 92, 30);
		contentPane.add(btnVolver);
	}
	
	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
