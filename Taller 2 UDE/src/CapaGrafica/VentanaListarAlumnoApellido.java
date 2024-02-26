package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaListarAlumnoApellido extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApellido;
	private JTable tableAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListarAlumnoApellido frame = new VentanaListarAlumnoApellido();
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
	public VentanaListarAlumnoApellido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListar = new JLabel("Listar Alumnos Apellido");
		lblTituloListar.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloListar.setBounds(118, 0, 242, 40);
		contentPane.add(lblTituloListar);
		
		JLabel lblApellidoIngresado = new JLabel("Ingrese Apellido");
		lblApellidoIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoIngresado.setBounds(128, 51, 101, 19);
		contentPane.add(lblApellidoIngresado);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBounds(118, 83, 260, 23);
		contentPane.add(btnListar);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(274, 50, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		tableAlumnos = new JTable();
		tableAlumnos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		tableAlumnos.setBounds(41, 185, 382, 112);
		contentPane.add(tableAlumnos);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellido.setBounds(41, 155, 55, 19);
		contentPane.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(138, 155, 55, 19);
		contentPane.add(lblNombre);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(229, 155, 55, 19);
		contentPane.add(lblCedula);
		
		JLabel lblTipoAlum = new JLabel("Tipo Alumno");
		lblTipoAlum.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTipoAlum.setBounds(329, 155, 84, 19);
		contentPane.add(lblTipoAlum);
	}
}
