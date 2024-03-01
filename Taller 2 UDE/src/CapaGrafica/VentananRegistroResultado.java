package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CapaGrafica.Controladores.ControladorRegistrarAsignatura;
import CapaGrafica.Controladores.ControladorRegistrarResultado;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentananRegistroResultado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControladorRegistrarResultado controlador;
	private VentanaPrincipal ventanaPrincipal;
	private JTextField txtCed;
	private JTextField txtNum;
	private JTextField txtCal;
	private JFrame frmRegistrarCalificacion;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentananRegistroResultado window = new VentananRegistroResultado(ventanaPrincipal); //Ta mal escrita la clase
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public VentananRegistroResultado(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		intialize();
		controlador = new ControladorRegistrarResultado(this);
	}

	/**
	 * Create the frame.
	 */
	private void intialize() {
		setTitle("REGISTRAR CALIFICACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 230);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCedAlumno = new JLabel("Ingrese cedula del alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(50, 23, 152, 19);
		contentPane.add(lblCedAlumno);

		txtCed = new JTextField();
		txtCed.setBounds(244, 23, 152, 19);
		contentPane.add(txtCed);
		txtCed.setColumns(10);
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		txtNum.setBounds(244, 62, 152, 19);
		contentPane.add(txtNum);
		
		txtCal = new JTextField();
		txtCal.setColumns(10);
		txtCal.setBounds(244, 102, 152, 19);
		contentPane.add(txtCal);

		JLabel lblCalificacion = new JLabel("Ingrese calificacion");
		lblCalificacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCalificacion.setBounds(50, 102, 114, 19);
		contentPane.add(lblCalificacion);

		JLabel lblNumInscripcion = new JLabel("Ingrese numero de Inscripcion");
		lblNumInscripcion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumInscripcion.setBounds(50, 62, 170, 19);
		contentPane.add(lblNumInscripcion);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long cedula = Long.parseLong(txtCed.getText());
				int numero = Integer.parseInt(txtNum.getText());
				int calificacion = Integer.parseInt(txtCal.getText());
				controlador.registrarCalificacion(cedula, calificacion, numero);
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setBounds(226, 144, 114, 30);
		contentPane.add(btnRegistrar);

		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmRegistrarCalificacion.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(72, 144, 92, 30);
		contentPane.add(btnVolver);
		
		
	}
	
	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
