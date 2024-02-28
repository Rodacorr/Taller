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
import java.awt.Color;

public class VentananRegistroResultado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCed;
	private JTextField textNum;

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
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(243, 22, 119, 20);
		contentPane.add(textCed);
		
		textNum = new JTextField();
		textNum.setColumns(10);
		textNum.setBounds(243, 61, 119, 20);
		contentPane.add(textNum);
		
		JTextField textCal = new JTextField();
		textCal.setColumns(10);
		textCal.setBounds(243, 101, 119, 20);
		contentPane.add(textCal);
		
		JLabel lblCalificacion = new JLabel("Ingrese calificacion");
		lblCalificacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCalificacion.setBounds(50, 102, 114, 19);
		contentPane.add(lblCalificacion);
		
		JLabel lblNumInscripcion = new JLabel("Ingrese numero de Inscripcion");
		lblNumInscripcion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumInscripcion.setBounds(50, 62, 170, 19);
		contentPane.add(lblNumInscripcion);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setBounds(226, 144, 114, 30);
		contentPane.add(btnRegistrar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(72, 144, 92, 30);
		contentPane.add(btnVolver);
	}
}
