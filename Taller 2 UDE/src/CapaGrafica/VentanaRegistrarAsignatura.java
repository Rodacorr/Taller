package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VentanaRegistrarAsignatura {

	private JFrame frmRegistrarAsignatura;
	private JTextField txtNom;
	private JTextField txtCod;
	private JTextField txtDesc;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrarAsignatura window = new VentanaRegistrarAsignatura();
					window.frmRegistrarAsignatura.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaRegistrarAsignatura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrarAsignatura = new JFrame();
		frmRegistrarAsignatura.setTitle("REGISTRAR ASIGNATURA");
		frmRegistrarAsignatura.getContentPane().setBackground(new Color(255, 255, 255));
		frmRegistrarAsignatura.getContentPane().setForeground(new Color(255, 255, 255));
		frmRegistrarAsignatura.setBounds(100, 100, 367, 226);
		frmRegistrarAsignatura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrarAsignatura.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Ingrese nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(47, 59, 88, 15);
		frmRegistrarAsignatura.getContentPane().add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Ingrese codigo");
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigo.setBounds(47, 23, 88, 15);
		frmRegistrarAsignatura.getContentPane().add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Ingrese descripcion");
		lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripcion.setBounds(47, 99, 114, 15);
		frmRegistrarAsignatura.getContentPane().add(lblDescripcion);
		
		txtNom = new JTextField();
		txtNom.setBounds(197, 56, 114, 20);
		frmRegistrarAsignatura.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(197, 20, 114, 20);
		frmRegistrarAsignatura.getContentPane().add(txtCod);
		
		txtDesc = new JTextField();
		txtDesc.setColumns(10);
		txtDesc.setBounds(197, 96, 114, 20);
		frmRegistrarAsignatura.getContentPane().add(txtDesc);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setBounds(185, 140, 114, 30);
		frmRegistrarAsignatura.getContentPane().add(btnRegistrar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(56, 140, 92, 30);
		frmRegistrarAsignatura.getContentPane().add(btnVolver);
	}
	public void setVisible(boolean mostrar) {
		frmRegistrarAsignatura.setVisible(mostrar);
	}
}
