package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;

public class VentanaRegistrarAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCed;
	private JTextField txtTel;
	private JTextField txtApe;
	private JTextField txtDom;
	private JTextField txtPorce;
	private JTextField txtRa;
	private JTextField txtNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrarAlumno frame = new VentanaRegistrarAlumno();
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
	public VentanaRegistrarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancel = new JButton("Canecelar");
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setBounds(75, 400, 100, 30);
		contentPane.add(btnCancel);
		
		JButton btnAccept = new JButton("Aceptar");
		btnAccept.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAccept.setForeground(new Color(0, 0, 0));
		btnAccept.setBackground(new Color(0, 255, 0));
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccept.setBounds(225, 400, 100, 30);
		contentPane.add(btnAccept);
		
		txtCed = new JTextField();
		txtCed.setBounds(225, 75, 86, 20);
		contentPane.add(txtCed);
		txtCed.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(225, 215, 86, 20);
		contentPane.add(txtTel);
		
		txtApe = new JTextField();
		txtApe.setColumns(10);
		txtApe.setBounds(225, 145, 86, 20);
		contentPane.add(txtApe);
		
		txtDom = new JTextField();
		txtDom.setColumns(10);
		txtDom.setBounds(225, 180, 86, 20);
		contentPane.add(txtDom);
		
		txtPorce = new JTextField();
		txtPorce.setColumns(10);
		txtPorce.setBounds(225, 285, 86, 20);
		contentPane.add(txtPorce);
		
		txtRa = new JTextField();
		txtRa.setColumns(10);
		txtRa.setBounds(225, 320, 86, 20);
		contentPane.add(txtRa);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(225, 110, 86, 20);
		contentPane.add(txtNom);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(75, 75, 46, 14);
		contentPane.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(75, 110, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellido.setBounds(75, 145, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDomicilo = new JLabel("Domicilo");
		lblDomicilo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDomicilo.setBounds(75, 180, 70, 14);
		contentPane.add(lblDomicilo);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(75, 215, 70, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblBecado = new JLabel("Es becado?");
		lblBecado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBecado.setBounds(75, 250, 79, 14);
		contentPane.add(lblBecado);
		
		JLabel lblPorcentaje = new JLabel("Porcentaje");
		lblPorcentaje.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPorcentaje.setBounds(75, 285, 70, 14);
		contentPane.add(lblPorcentaje);
		
		JLabel lblRazon = new JLabel("Razon");
		lblRazon.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRazon.setBounds(75, 320, 46, 14);
		contentPane.add(lblRazon);
		
		JCheckBox chckBec = new JCheckBox("");
		chckBec.setBounds(250, 250, 97, 23);
		contentPane.add(chckBec);
		
		JLabel lblTituloRegistro = new JLabel("Registrar Alumno");
		lblTituloRegistro.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloRegistro.setBounds(100, 25, 175, 33);
		contentPane.add(lblTituloRegistro);
	}
}
