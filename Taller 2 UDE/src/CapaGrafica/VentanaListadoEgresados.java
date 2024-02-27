package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class VentanaListadoEgresados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListadoEgresados frame = new VentanaListadoEgresados();
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
	public VentanaListadoEgresados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListar = new JLabel("Listar Egresados");
		lblTituloListar.setBounds(158, 0, 161, 26);
		lblTituloListar.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloListar);
		
		JLabel lblModoListado = new JLabel("Ingrese Apellido");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(37, 53, 101, 19);
		contentPane.add(lblModoListado);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBounds(47, 83, 260, 23);
		contentPane.add(btnListar);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellido.setBounds(10, 185, 55, 19);
		contentPane.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(101, 185, 55, 19);
		contentPane.add(lblNombre);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(191, 185, 55, 19);
		contentPane.add(lblCedula);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 215, 443, 112);
		contentPane.add(table);
		
		JLabel lblPromedio = new JLabel("Promedio Total");
		lblPromedio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPromedio.setBounds(279, 185, 86, 19);
		contentPane.add(lblPromedio);
		
		JLabel lblPromApro = new JLabel("Promedio Aprobaciones");
		lblPromApro.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPromApro.setBounds(365, 185, 133, 19);
		contentPane.add(lblPromApro);
		
		JCheckBox chckbxCompleto = new JCheckBox("Completo?");
		chckbxCompleto.setBounds(252, 51, 97, 23);
		contentPane.add(chckbxCompleto);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 126, 433, 19);
		contentPane.add(separator);
	}
}
