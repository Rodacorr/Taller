package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import CapaGrafica.Controladores.ControladorCalcularMontoRecaudado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalcularMontoRecaudado {

	private JFrame frmMontoRecaudado;
	private JTextField txtCed;
	private JTextField txtAnio;
	private ControladorCalcularMontoRecaudado controlador;
	private VentanaPrincipal ventanaPrincipal;
	private JTextField txtMontoValor;
	private JLabel lblMonto;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaCalcularMontoRecaudado window = new VentanaCalcularMontoRecaudado(ventanaPrincipal);
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
	public VentanaCalcularMontoRecaudado(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorCalcularMontoRecaudado(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMontoRecaudado = new JFrame();
		frmMontoRecaudado.getContentPane().setBackground(new Color(255, 255, 255));
		frmMontoRecaudado.setTitle("MONTO RECAUDADO");
		frmMontoRecaudado.setBounds(100, 100, 389, 274);
		frmMontoRecaudado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMontoRecaudado.getContentPane().setLayout(null);
		
		frmMontoRecaudado.setResizable(false);

		
		JLabel lblCedAlumno = new JLabel("Ingrese cedula del alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(31, 33, 152, 19);
		frmMontoRecaudado.getContentPane().add(lblCedAlumno);
		
		JLabel lblAnioLectivo = new JLabel("Ingrese año lectivo");
		lblAnioLectivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAnioLectivo.setBounds(31, 83, 109, 19);
		frmMontoRecaudado.getContentPane().add(lblAnioLectivo);
		
		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(220, 32, 122, 20);
		frmMontoRecaudado.getContentPane().add(txtCed);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(220, 82, 122, 20);
		frmMontoRecaudado.getContentPane().add(txtAnio);
		
		final JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cedula = txtCed.getText();
				String anio = txtAnio.getText();
				controlador.montoRecaudado(cedula, anio);
			}
		});
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.setBackground(new Color(0x198754));
		btnCalcular.setBounds(207, 179, 100, 30);
		frmMontoRecaudado.getContentPane().add(btnCalcular);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmMontoRecaudado.dispose();
			}
		});
		
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		btnVolver.setBounds(48, 179, 92, 30);
		frmMontoRecaudado.getContentPane().add(btnVolver);
		
		lblMonto = new JLabel("El monto recaudado es:");
		lblMonto.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMonto.setBounds(31, 129, 152, 13);
		lblMonto.setVisible(false);
		frmMontoRecaudado.getContentPane().add(lblMonto);
		
		txtMontoValor = new JTextField();
		txtMontoValor.setBackground(new Color(255, 255, 255));
		txtMontoValor.setFont(new Font("Arial", Font.BOLD, 12));
		txtMontoValor.setEditable(false);
		txtMontoValor.setColumns(10);
		txtMontoValor.setBounds(220, 126, 122, 20);
		txtMontoValor.setVisible(false);
		frmMontoRecaudado.getContentPane().add(txtMontoValor);
		
	}
	
	public void setearMonto (String monto) {
		lblMonto.setVisible(true);
		
		txtMontoValor.setVisible(true);
		txtMontoValor.setText(monto);
	}
	
	public void setVisible(boolean mostrar) {
		frmMontoRecaudado.setVisible(mostrar);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
