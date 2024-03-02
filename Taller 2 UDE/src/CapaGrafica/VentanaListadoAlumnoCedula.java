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
		
		JLabel lblCedulaIngresado = new JLabel("Indique cedula");
		lblCedulaIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaIngresado.setBounds(41, 33, 101, 19);
		frmListarAlumnoCed.getContentPane().add(lblCedulaIngresado);
		
		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(172, 33, 136, 20);
		frmListarAlumnoCed.getContentPane().add(txtCed);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarAlumnoCed.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(50, 91, 92, 30);
		frmListarAlumnoCed.getContentPane().add(btnVolver);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(10, 142, 414, 222);
		frmListarAlumnoCed.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane.setViewportView(textArea);
        
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            long cedula = Long.parseLong(txtCed.getText());
	    		
	            controlador.listarAlumnoCed(cedula);
	            scrollPane.setVisible(true); 
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(192, 91, 100, 30);
		frmListarAlumnoCed.getContentPane().add(btnListar);
		

		frmListarAlumnoCed.setTitle("LISTAR ALUMNO DADO SU CEDULA");
		frmListarAlumnoCed.setBounds(100, 100, 451, 419);
		frmListarAlumnoCed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setearDatosEnTextArea(String mensaje) {
		textArea.setText(mensaje);
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
