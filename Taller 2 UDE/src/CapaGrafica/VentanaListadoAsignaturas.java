package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import CapaGrafica.Controladores.ControladorListadoAsignaturas;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class VentanaListadoAsignaturas {

	private JFrame frmListarAsignaturas;
	private ControladorListadoAsignaturas controlador;
	private VentanaPrincipal ventanaPrincipal;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaListadoAsignaturas window = new VentanaListadoAsignaturas(ventanaPrincipal);
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
	public VentanaListadoAsignaturas(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorListadoAsignaturas(this);
		controlador.listarAsignaturas();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarAsignaturas = new JFrame();
		frmListarAsignaturas.setVisible(false);
		frmListarAsignaturas.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAsignaturas.setTitle("LISTAR ASIGNATURAS");
		frmListarAsignaturas.setBounds(100, 100, 450, 320);
		frmListarAsignaturas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmListarAsignaturas.getContentPane().setLayout(null);

		frmListarAsignaturas.setResizable(false);


		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAsignaturas.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		btnVolver.setBounds(170, 240, 92, 30);
		frmListarAsignaturas.getContentPane().add(btnVolver);

		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 14, 414, 215);
		frmListarAsignaturas.getContentPane().add(scrollPane);

		table = new JTable();
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		table.getTableHeader().setReorderingAllowed(false);

	}

	public void setearDatos(Object[][] data) {


		String[] columnNames = {"Codigo",
				"Nombre",
		"Descripcion"};

		DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
		table.setModel(dtm);
		scrollPane.setVisible(true);
	}

	public void setVisible(boolean mostrar) {
		frmListarAsignaturas.setVisible(mostrar);
	}


	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
