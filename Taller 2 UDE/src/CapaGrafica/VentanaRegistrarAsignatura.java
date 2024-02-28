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

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtCod;
	private JTextField txtDesc;
	private JLabel lblTituloRegAsig;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrarAsignatura window = new VentanaRegistrarAsignatura();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Ingrese nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(47, 89, 88, 15);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Ingrese codigo");
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigo.setBounds(47, 53, 88, 15);
		frame.getContentPane().add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Ingrese descripcion");
		lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripcion.setBounds(47, 127, 114, 15);
		frame.getContentPane().add(lblDescripcion);
		
		txtNom = new JTextField();
		txtNom.setBounds(197, 89, 114, 20);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(197, 50, 114, 20);
		frame.getContentPane().add(txtCod);
		
		txtDesc = new JTextField();
		txtDesc.setColumns(10);
		txtDesc.setBounds(197, 124, 114, 20);
		frame.getContentPane().add(txtDesc);
		
		lblTituloRegAsig = new JLabel("REGISTRAR ASIGNATURA");
		lblTituloRegAsig.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloRegAsig.setBounds(75, 0, 260, 30);
		frame.getContentPane().add(lblTituloRegAsig);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setBounds(221, 205, 114, 30);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(58, 205, 92, 30);
		frame.getContentPane().add(btnVolver);
	}
	public void setVisible(boolean mostrar) {
		frame.setVisible(mostrar);
	}
}
