package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;

import CapaGrafica.Controladores.ControladorRegistrarResultado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistrarResultado {

	private JFrame frmRegistrarCalificacion;
	private JTextField txtCed;
	private JTextField txtNum;
	private JTextField txtCal;
	private ControladorRegistrarResultado controlador;
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
					VentanaRegistrarResultado window = new VentanaRegistrarResultado(ventanaPrincipal);
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
	public VentanaRegistrarResultado(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorRegistrarResultado(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrarCalificacion = new JFrame();
		frmRegistrarCalificacion.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/Logo.png")));
		frmRegistrarCalificacion.getContentPane().setBackground(new Color(255, 255, 255));
		frmRegistrarCalificacion.getContentPane().setLayout(null);
		frmRegistrarCalificacion.setResizable(false);


		JLabel lblCedAlumno = new JLabel("Ingrese cédula del alumno:");
		lblCedAlumno.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedAlumno.setBounds(31, 39, 152, 19);
		frmRegistrarCalificacion.getContentPane().add(lblCedAlumno);

		JLabel lblNumInscripcion = new JLabel("Ingrese número de Inscripción:");
		lblNumInscripcion.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumInscripcion.setBounds(31, 79, 176, 19);
		frmRegistrarCalificacion.getContentPane().add(lblNumInscripcion);

		JLabel lblCalificacion = new JLabel("Ingrese calificación:");
		lblCalificacion.setFont(new Font("Arial", Font.BOLD, 12));
		lblCalificacion.setBounds(31, 118, 114, 19);
		frmRegistrarCalificacion.getContentPane().add(lblCalificacion);

		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(241, 39, 152, 19);
		frmRegistrarCalificacion.getContentPane().add(txtCed);

		txtNum = new JTextField();
		txtNum.setColumns(10);
		txtNum.setBounds(241, 79, 152, 19);
		frmRegistrarCalificacion.getContentPane().add(txtNum);

		txtCal = new JTextField();
		txtCal.setColumns(10);
		txtCal.setBounds(241, 118, 152, 19);
		frmRegistrarCalificacion.getContentPane().add(txtCal);

		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmRegistrarCalificacion.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		btnVolver.setBounds(65, 162, 92, 30);
		frmRegistrarCalificacion.getContentPane().add(btnVolver);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cedula = txtCed.getText();
				String numero = txtNum.getText();
				String calificacion = txtCal.getText();
				controlador.registrarCalificacion(cedula, calificacion, numero);
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegistrar.setBackground(new Color(0x42b881));
		btnRegistrar.setBounds(230, 162, 114, 30);

		frmRegistrarCalificacion.getContentPane().add(btnRegistrar);
		frmRegistrarCalificacion.setTitle("REGISTRAR CALIFICACION");
		frmRegistrarCalificacion.setBounds(100, 100, 426, 249);
		frmRegistrarCalificacion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void setVisible(boolean mostrar) {
		frmRegistrarCalificacion.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void setLocationRelativeToNull() {
		frmRegistrarCalificacion.setLocationRelativeTo(null);
    }

}
