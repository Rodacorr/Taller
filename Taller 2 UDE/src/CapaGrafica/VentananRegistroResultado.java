package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;

public class VentananRegistroResultado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCed;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentananRegistroResultado frame = new VentananRegistroResultado();
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
	public VentananRegistroResultado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListar = new JLabel("Registro Resultado Asignatura");
		lblTituloListar.setBounds(77, 0, 295, 26);
		lblTituloListar.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloListar);
		
		JLabel lblCedAlumno = new JLabel("Cedula Alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(77, 57, 101, 19);
		contentPane.add(lblCedAlumno);
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(257, 56, 86, 20);
		contentPane.add(textCed);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(257, 98, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(257, 144, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblApellidoIngresado_1 = new JLabel("Nota");
		lblApellidoIngresado_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoIngresado_1.setBounds(77, 101, 101, 19);
		contentPane.add(lblApellidoIngresado_1);
		
		JLabel lblApellidoIngresado_2 = new JLabel("Numero Inscripcion");
		lblApellidoIngresado_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoIngresado_2.setBounds(77, 147, 125, 19);
		contentPane.add(lblApellidoIngresado_2);
		
		JButton btnRegistro = new JButton("Registrar");
		btnRegistro.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistro.setBounds(83, 199, 260, 23);
		contentPane.add(btnRegistro);
	}
}
