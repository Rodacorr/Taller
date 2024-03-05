package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import CapaGrafica.Controladores.ControladorListadoAlumnoCedula;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class VentanaListadoAlumnoCedula {

	private JFrame frmListarAlumnoCed;
	private JTextField txtCed;
	private ControladorListadoAlumnoCedula controlador;
	private VentanaPrincipal ventanaPrincipal;
	private JTable table;
	private JTextArea textArea;
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
					VentanaListadoAlumnoCedula window = new VentanaListadoAlumnoCedula(ventanaPrincipal);
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
	public VentanaListadoAlumnoCedula(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorListadoAlumnoCedula(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarAlumnoCed = new JFrame();
		frmListarAlumnoCed.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAlumnoCed.getContentPane().setLayout(null);
		frmListarAlumnoCed.setResizable(false);


		JLabel lblCedulaIngresado = new JLabel("Indique cedula");
		lblCedulaIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaIngresado.setBounds(21, 33, 101, 19);
		frmListarAlumnoCed.getContentPane().add(lblCedulaIngresado);

		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(148, 33, 136, 20);
		frmListarAlumnoCed.getContentPane().add(txtCed);

		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAlumnoCed.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		btnVolver.setBounds(21, 91, 92, 30);
		frmListarAlumnoCed.getContentPane().add(btnVolver);

		scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(10, 142, 298, 174);
		frmListarAlumnoCed.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);


		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cedula = txtCed.getText();
				controlador.listarAlumnoCed(cedula);
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.BOLD, 12));
		btnListar.setBackground(new Color(0x198754));
		btnListar.setBounds(184, 91, 100, 30);
		frmListarAlumnoCed.getContentPane().add(btnListar);


		frmListarAlumnoCed.setTitle("LISTAR ALUMNO DADO SU CEDULA");
		frmListarAlumnoCed.setBounds(100, 100, 332, 363);
		frmListarAlumnoCed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setearDatosEnTextArea(String mensaje) {
		textArea.setText(mensaje);
		scrollPane.setVisible(true); 
	}

	public void setVisible(boolean mostrar) {
		frmListarAlumnoCed.setVisible(mostrar);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
