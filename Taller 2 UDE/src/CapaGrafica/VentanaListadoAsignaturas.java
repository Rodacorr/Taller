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
		frmListarAsignaturas.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAsignaturas.setTitle("LISTAR ASIGNATURAS");
		frmListarAsignaturas.setBounds(100, 100, 450, 320);
		frmListarAsignaturas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListarAsignaturas.getContentPane().setLayout(null);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAsignaturas.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(170, 240, 92, 30);
		frmListarAsignaturas.getContentPane().add(btnVolver);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 14, 414, 215);
		frmListarAsignaturas.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	
	public void setearDatos(Object[][] data) {

		String[] columnNames = {"Codigo",
				 "Nombre",
				 "Descripcion"};
		
		DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
		table.setModel(dtm);

	}
	
	public void setVisible(boolean mostrar) {
		frmListarAsignaturas.setVisible(mostrar);
	}

	
	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
