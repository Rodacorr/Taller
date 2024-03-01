package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;

import CapaGrafica.Controladores.ControladorListadoEgresados;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListadoEgresados {

	private JFrame frmListarEgresados;
	private JRadioButton rdbtnCompleto;
	private JRadioButton rdbtnParcial;
	private VentanaPrincipal ventanaPrincipal;
	private ControladorListadoEgresados controlador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaListadoEgresados window = new VentanaListadoEgresados(ventanaPrincipal);
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
	public VentanaListadoEgresados(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorListadoEgresados(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListarEgresados = new JFrame();
		frmListarEgresados.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarEgresados.setTitle("LISTAR EGRESADOS");
		frmListarEgresados.setBounds(100, 100, 317, 174);
		frmListarEgresados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListarEgresados.getContentPane().setLayout(null);
		
		ButtonGroup bgp = new ButtonGroup();
		
		JLabel lblModoListado = new JLabel("Indique modo");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(32, 41, 101, 19);
		frmListarEgresados.getContentPane().add(lblModoListado);
		
		final JRadioButton rdbtnParcial = new JRadioButton("Parcial");
		rdbtnParcial.setBackground(Color.WHITE);
		rdbtnParcial.setBounds(139, 39, 71, 23);
		frmListarEgresados.getContentPane().add(rdbtnParcial);
		bgp.add(rdbtnParcial);
		
		final JRadioButton rdbtnCompleto = new JRadioButton("Completo");
		rdbtnCompleto.setBackground(Color.WHITE);
		rdbtnCompleto.setBounds(212, 39, 79, 23);
		frmListarEgresados.getContentPane().add(rdbtnCompleto);
		bgp.add(rdbtnCompleto);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmListarEgresados.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(42, 81, 92, 30);
		frmListarEgresados.getContentPane().add(btnVolver);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCompleto.isSelected()) {
					JOptionPane.showMessageDialog(null, "completo");
					///ventana.setVisible(true);
				}
				else if(rdbtnParcial.isSelected()) {
					JOptionPane.showMessageDialog(null, "parcial");
					///ventana.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion");
				}
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(172, 81, 100, 30);
		frmListarEgresados.getContentPane().add(btnListar);
	}
	
	public void setVisible(boolean mostrar) {
		frmListarEgresados.setVisible(mostrar);
	}

	
	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
