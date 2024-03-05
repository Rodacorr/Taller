package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import CapaGrafica.Controladores.ControladorListadoAlumnoApellido;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListadoAlumnoApellido {

	private JFrame frmListarAlumnosApe;
	private JTextField txtApe;
	private ControladorListadoAlumnoApellido controlador;
	private VentanaPrincipal ventanaPrincipal;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaListadoAlumnoApellido window = new VentanaListadoAlumnoApellido(ventanaPrincipal);
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
	public VentanaListadoAlumnoApellido(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorListadoAlumnoApellido(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarAlumnosApe = new JFrame();
		frmListarAlumnosApe.setTitle("LISTAR ALUMNOS DADO APELLIDO");
		frmListarAlumnosApe.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAlumnosApe.getContentPane().setLayout(null);
		frmListarAlumnosApe.setResizable(false);


		JLabel lblApellidoIngresado = new JLabel("Ingrese apellido o prefijo");
		lblApellidoIngresado.setBounds(38, 29, 141, 19);
		lblApellidoIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		frmListarAlumnosApe.getContentPane().add(lblApellidoIngresado);

		txtApe = new JTextField();
		txtApe.setBounds(250, 29, 122, 20);
		txtApe.setColumns(10);
		frmListarAlumnosApe.getContentPane().add(txtApe);

		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(61, 85, 92, 30);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAlumnosApe.dispose();
			}
		});
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		frmListarAlumnosApe.getContentPane().add(btnVolver);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(10, 142, 414, 222);
		frmListarAlumnosApe.getContentPane().add(scrollPane);

		table = new JTable();
		table.setEnabled(false);
		table.setUpdateSelectionOnSort(false);
		table.setRowSelectionAllowed(false);
		scrollPane.setViewportView(table);
		scrollPane.setVisible(false);
        table.getTableHeader().setReorderingAllowed(false);


		JButton btnListar = new JButton("LISTAR");
		btnListar.setBounds(250, 85, 100, 30);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String apellido = txtApe.getText();
				controlador.listarAlumnoApe(apellido);
				scrollPane.setVisible(true);

			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.BOLD, 12));
		btnListar.setBackground(new Color(0x198754));
		
		frmListarAlumnosApe.getContentPane().add(btnListar);
		frmListarAlumnosApe.setBounds(100, 100, 450, 410);
		frmListarAlumnosApe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setearDatos(Object[][] data) {


		String[] columnNames = {"Nombre",
				"Apellido",
				"Cedula",
		"Tipo"};

		DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
		table.setModel(dtm);

	}

	public void setVisible(boolean mostrar) {
		frmListarAlumnosApe.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
