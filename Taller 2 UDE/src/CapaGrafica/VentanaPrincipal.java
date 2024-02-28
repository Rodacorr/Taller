package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
	private JRadioButton rdbtnReq11;
	private JRadioButton rdbtnReq12;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("MENU PRINCIPAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSubtitulo = new JLabel("Seleccione la opcion deseada");
		lblSubtitulo.setBounds(156, 11, 209, 14);
		contentPane.add(lblSubtitulo);
		
		ButtonGroup bgp = new ButtonGroup();
		
		rdbtnReq1 = new JRadioButton("Registrar Asignatura");
		rdbtnReq1.setBackground(new Color(255, 255, 255));
		rdbtnReq1.setBounds(40, 32, 180, 31);
		contentPane.add(rdbtnReq1);
		bgp.add(rdbtnReq1);
		
		rdbtnReq2 = new JRadioButton("Listado de Asignaturas");
		rdbtnReq2.setBackground(new Color(255, 255, 255));
		rdbtnReq2.setBounds(40, 66, 159, 23);
		contentPane.add(rdbtnReq2);
		bgp.add(rdbtnReq2);
		
		rdbtnReq3 = new JRadioButton("Registrar Alumno");
		rdbtnReq3.setBackground(Color.WHITE);
		rdbtnReq3.setBounds(40, 101, 135, 23);
		contentPane.add(rdbtnReq3);
		bgp.add(rdbtnReq3);
		
		rdbtnReq4 = new JRadioButton("Listado de Alumno dado Apellido");
		rdbtnReq4.setBackground(Color.WHITE);
		rdbtnReq4.setBounds(40, 133, 217, 23);
		contentPane.add(rdbtnReq4);
		bgp.add(rdbtnReq4);
		
		rdbtnReq5 = new JRadioButton("Listado de Alumno dada Cedula");
		rdbtnReq5.setBackground(Color.WHITE);
		rdbtnReq5.setBounds(40, 166, 217, 23);
		contentPane.add(rdbtnReq5);
		bgp.add(rdbtnReq5);
		
		rdbtnReq6 = new JRadioButton("Registrar Inscripcion");
		rdbtnReq6.setBackground(Color.WHITE);
		rdbtnReq6.setBounds(40, 198, 159, 23);
		contentPane.add(rdbtnReq6);
		bgp.add(rdbtnReq6);
		
		rdbtnReq7 = new JRadioButton("Registrar Calificacion");
		rdbtnReq7.setBackground(Color.WHITE);
		rdbtnReq7.setBounds(268, 32, 159, 23);
		contentPane.add(rdbtnReq7);
		bgp.add(rdbtnReq7);
		
		rdbtnReq8 = new JRadioButton("Calcular Monto Recaudado");
		rdbtnReq8.setBackground(Color.WHITE);
		rdbtnReq8.setBounds(268, 66, 186, 23);
		contentPane.add(rdbtnReq8);
		bgp.add(rdbtnReq8);
		
		rdbtnReq9 = new JRadioButton("Listar Escolaridad ");
		rdbtnReq9.setBackground(Color.WHITE);
		rdbtnReq9.setBounds(268, 101, 135, 23);
		contentPane.add(rdbtnReq9);
		bgp.add(rdbtnReq9);
		
		rdbtnReq10 = new JRadioButton("Listar Egresados");
		rdbtnReq10.setBackground(Color.WHITE);
		rdbtnReq10.setBounds(268, 133, 135, 23);
		contentPane.add(rdbtnReq10);
		bgp.add(rdbtnReq10);
		
		rdbtnReq11 = new JRadioButton("Respaldar");
		rdbtnReq11.setBackground(Color.WHITE);
		rdbtnReq11.setBounds(268, 166, 109, 23);
		contentPane.add(rdbtnReq11);
		bgp.add(rdbtnReq11);
		
		rdbtnReq12 = new JRadioButton("Recuperar");
		rdbtnReq12.setBackground(Color.WHITE);
		rdbtnReq12.setBounds(268, 198, 109, 23);
		contentPane.add(rdbtnReq12);
		bgp.add(rdbtnReq12);
		
		JButton btnAbrir = new JButton("ABRIR");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnReq1.isSelected()) {
					VentanaRegistrarAsignatura ventana = new VentanaRegistrarAsignatura();
					ventana.setVisible(true);
				}
				else if(rdbtnReq2.isSelected()) {
					VentanaListadoAsignaturas ventana = new VentanaListadoAsignaturas();
					ventana.setVisible(true);
				}
				else if(rdbtnReq3.isSelected()) {
					VentanaRegistrarAlumno ventana = new VentanaRegistrarAlumno();
					ventana.setVisible(true);
				}
				else if(rdbtnReq4.isSelected()) {
					VentanaListarAlumnoApellido ventana = new VentanaListarAlumnoApellido();
					ventana.setVisible(true);
				}
				else if(rdbtnReq5.isSelected()) {
					VentanaListadoCedula ventana = new VentanaListadoCedula();
					ventana.setVisible(true);
				}
				else if(rdbtnReq6.isSelected()) {
					VentanaInscripcionAsignatura ventana = new VentanaInscripcionAsignatura();
					ventana.setVisible(true);
				}
				else if(rdbtnReq7.isSelected()) {
					VentananRegistroResultado ventana = new VentananRegistroResultado();
					ventana.setVisible(true);
				}
				else if(rdbtnReq8.isSelected()) {
					VentanaMontoRecaudado ventana = new VentanaMontoRecaudado();
					ventana.setVisible(true);
				}
				else if(rdbtnReq9.isSelected()) {
					VentanaConsultaEscolaridad ventana = new VentanaConsultaEscolaridad();
					ventana.setVisible(true);
				}
				else if(rdbtnReq10.isSelected()) {
					VentanaListadoEgresados ventana = new VentanaListadoEgresados();
					ventana.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion");
				}
					
				
	
			}
		});
		btnAbrir.setForeground(Color.BLACK);
		btnAbrir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAbrir.setBackground(Color.GREEN);
		btnAbrir.setBounds(226, 240, 114, 30);
		contentPane.add(btnAbrir);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSalir.setBackground(new Color(255, 0, 0));
		btnSalir.setBounds(83, 240, 92, 30);
		contentPane.add(btnSalir);
	}
}
