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
import java.awt.Color;

public class VentanaListarAlumnoApellido extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApellido;

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
		setBounds(100, 100, 410, 176);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListarAlumXApe = new JLabel("LISTAR ALUMNOS DADO APELLIDO");
		lblTituloListarAlumXApe.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloListarAlumXApe.setBounds(24, 0, 344, 40);
		contentPane.add(lblTituloListarAlumXApe);
		
		JLabel lblApellidoIngresado = new JLabel("Ingrese apellido o prefijo");
		lblApellidoIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoIngresado.setBounds(50, 51, 141, 19);
		contentPane.add(lblApellidoIngresado);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(201, 50, 122, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(216, 96, 100, 30);
		contentPane.add(btnListar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(71, 96, 92, 30);
		contentPane.add(btnVolver);
	}
}
