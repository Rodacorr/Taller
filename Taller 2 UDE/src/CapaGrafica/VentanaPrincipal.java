package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import CapaGrafica.Controladores.ControladorPrincipal;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	private JFrame frmMenuPrincipal;
	private JRadioButton rdbtnReq1;
	private JRadioButton rdbtnReq2;
	private JRadioButton rdbtnReq3;
	private JRadioButton rdbtnReq4;
	private JRadioButton rdbtnReq5;
	private JRadioButton rdbtnReq6;
	private JRadioButton rdbtnReq7;
	private JRadioButton rdbtnReq8;
	private JRadioButton rdbtnReq9;
	private JRadioButton rdbtnReq10;
	private ControladorPrincipal controlador;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		controlador = new ControladorPrincipal(this);
		if(controlador.isConexionExitosa()) {
			initialize();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frmMenuPrincipal = new JFrame();
		frmMenuPrincipal.setTitle("MENU PRINCIPAL");
		frmMenuPrincipal.getContentPane().setBackground(new Color(255, 255, 255));
		frmMenuPrincipal.getContentPane().setLayout(null);

		frmMenuPrincipal.setResizable(false);

		JLabel lblSubtitulo = new JLabel("Seleccione la opción deseada");
		lblSubtitulo.setBounds(125, 10, 273, 14);
		lblSubtitulo.setFont(new Font("Arial", Font.BOLD, 15));
		frmMenuPrincipal.getContentPane().add(lblSubtitulo);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuPrincipal.dispatchEvent(new WindowEvent(frmMenuPrincipal, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalir.setBackground(new Color(0xdc3545));
		btnSalir.setBounds(24, 231, 92, 30);
		frmMenuPrincipal.getContentPane().add(btnSalir);


		ButtonGroup bgp = new ButtonGroup();

		final JRadioButton rdbtnReq1 = new JRadioButton("Registrar Asignatura");
		rdbtnReq1.setToolTipText("Registrar los datos de una asignatura de la carrera. Los datos que se ingresarán son código alfanumérico, nombre de la asignatura y una breve descripción del contenido temático");
		rdbtnReq1.setBackground(Color.WHITE);
		rdbtnReq1.setBounds(35, 34, 180, 31);
		frmMenuPrincipal.getContentPane().add(rdbtnReq1);
		bgp.add(rdbtnReq1);

		final JRadioButton rdbtnReq2 = new JRadioButton("Listado de Asignaturas");
		rdbtnReq2.setToolTipText("Obtenie un listado de todas las asignaturas que integran la carrera. De cada asignatura se listarán su código, nombre y breve descripción del contenido temático.");
		rdbtnReq2.setBackground(Color.WHITE);
		rdbtnReq2.setBounds(263, 169, 159, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq2);
		bgp.add(rdbtnReq2);

		final JRadioButton rdbtnReq3 = new JRadioButton("Registrar Alumno");
		rdbtnReq3.setToolTipText("Registrar los datos de un nuevo alumno que se inscribe en la academia. Los datos que se ingresarán son cédula, nombre, apellido, domicilio y teléfono.");
		rdbtnReq3.setBackground(Color.WHITE);
		rdbtnReq3.setBounds(35, 69, 135, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq3);
		bgp.add(rdbtnReq3);


		final JRadioButton rdbtnReq4 = new JRadioButton("Listado de Alumno por Apellido");
		rdbtnReq4.setToolTipText("Dado un apellido, o un prefijo del mismo, lista todos los alumnos del sistema que tengan ese apellido (o bien que comience con dicho prefijo).");
		rdbtnReq4.setBackground(Color.WHITE);
		rdbtnReq4.setBounds(263, 69, 217, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq4);
		bgp.add(rdbtnReq4);


		final JRadioButton rdbtnReq5 = new JRadioButton("Listado de Alumno por Cedula");
		rdbtnReq5.setToolTipText("Dada la cédula de un alumno, lista todos sus datos (cédula, nombre, apellido, domicilio, teléfono, cantidad de asignaturas aprobadas y tipo de alumno (común o becado).");
		rdbtnReq5.setBackground(Color.WHITE);
		rdbtnReq5.setBounds(263, 38, 217, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq5);
		bgp.add(rdbtnReq5);

		final JRadioButton rdbtnReq6 = new JRadioButton("Registrar Inscripción");
		rdbtnReq6.setToolTipText("Dados un código de asignatura y la cédula de un alumno, registrar la inscripción de dicho alumno a esa asignatura. Los datos que se ingresarán de la nueva inscripción son el año lectivo y el monto base de la misma. ");
		rdbtnReq6.setBackground(Color.WHITE);
		rdbtnReq6.setBounds(35, 104, 159, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq6);
		bgp.add(rdbtnReq6);


		final JRadioButton rdbtnReq7 = new JRadioButton("Registrar Calificación");
		rdbtnReq7.setToolTipText("Dados la cédula de un alumno, una nota (en la escala de 1 a 12) y un número de inscripción para dicho alumno, registrar el resultado de ese alumno en la asignatura correspondiente a dicha inscripción.");
		rdbtnReq7.setBackground(Color.WHITE);
		rdbtnReq7.setBounds(35, 135, 159, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq7);
		bgp.add(rdbtnReq7);


		final JRadioButton rdbtnReq8 = new JRadioButton("Calcular Monto Recaudado");
		rdbtnReq8.setToolTipText("Dados un año lectivo y la cédula de un alumno, calcular el monto total recaudado por concepto de inscripciones de ese alumno a asignaturas en dicho año lectivo.");
		rdbtnReq8.setBackground(Color.WHITE);
		rdbtnReq8.setBounds(35, 169, 186, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq8);
		bgp.add(rdbtnReq8);

		final JRadioButton rdbtnReq9 = new JRadioButton("Listar Escolaridad ");
		rdbtnReq9.setToolTipText("Dados la cédula de un alumno y un modo de listado (parcial o completo), lista su escolaridad.");
		rdbtnReq9.setBackground(Color.WHITE);
		rdbtnReq9.setBounds(263, 104, 135, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq9);
		bgp.add(rdbtnReq9);

		final JRadioButton rdbtnReq10 = new JRadioButton("Listar Egresados");
		rdbtnReq10.setToolTipText("Dado un modo de listado (parcial o completo) obtiene un listado conteniendo todos los alumnos egresados.");
		rdbtnReq10.setBackground(Color.WHITE);
		rdbtnReq10.setBounds(263, 135, 135, 23);
		frmMenuPrincipal.getContentPane().add(rdbtnReq10);
		bgp.add(rdbtnReq10);

		JButton btnAbrir = new JButton("ABRIR");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnReq1.isSelected()) {
					VentanaRegistrarAsignatura ventana = new VentanaRegistrarAsignatura(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq2.isSelected()) {
					VentanaListadoAsignaturas ventana = new VentanaListadoAsignaturas(VentanaPrincipal.this);
					//ventana.setVisible(false);
				}
				else if(rdbtnReq3.isSelected()) {
					VentanaRegistrarAlumno ventana = new VentanaRegistrarAlumno(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq4.isSelected()) {
					VentanaListadoAlumnoApellido ventana = new VentanaListadoAlumnoApellido(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq5.isSelected()) {
					VentanaListadoAlumnoCedula ventana = new VentanaListadoAlumnoCedula(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq6.isSelected()) {
					VentanaRegistrarInscripcion ventana = new VentanaRegistrarInscripcion(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq7.isSelected()) {
					VentanaRegistrarResultado ventana = new VentanaRegistrarResultado(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq8.isSelected()) {
					VentanaCalcularMontoRecaudado ventana = new VentanaCalcularMontoRecaudado(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq9.isSelected()) {
					VentanaListadoEscolaridad ventana = new VentanaListadoEscolaridad(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else if(rdbtnReq10.isSelected()) {
					VentanaListadoEgresados ventana = new VentanaListadoEgresados(VentanaPrincipal.this);
					ventana.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion");
				}
			}
		});
		btnAbrir.setForeground(Color.BLACK);
		btnAbrir.setFont(new Font("Arial", Font.BOLD, 12));
		btnAbrir.setBackground(new Color(0x198754));
		btnAbrir.setBounds(174, 231, 114, 30);
		frmMenuPrincipal.getContentPane().add(btnAbrir);

		JButton btnRespaldar = new JButton("RESPALDAR");
		btnRespaldar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.respaldar();
			}
		});
		btnRespaldar.setForeground(Color.BLACK);
		btnRespaldar.setFont(new Font("Arial", Font.BOLD, 12));
		btnRespaldar.setBackground(new Color(0xffe082));
		btnRespaldar.setBounds(354, 231, 107, 31);
		frmMenuPrincipal.getContentPane().add(btnRespaldar);

		JLabel lblNewLabel = new JLabel("* Para obtener más información, por favor coloque el cursor sobre la opción deseada.");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel.setBounds(34, 272, 407, 13);
		frmMenuPrincipal.getContentPane().add(lblNewLabel);

		frmMenuPrincipal.setBounds(100, 100, 498, 343);
		frmMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean mostrar) {
		frmMenuPrincipal.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}