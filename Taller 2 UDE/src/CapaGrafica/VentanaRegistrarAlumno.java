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
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class VentanaRegistrarAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCed;
	private JTextField txtTel;
	private JTextField txtApe;
	private JTextField txtDom;
	private JTextField txtPorce;
	private JTextField txtRaz;
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
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.setForeground(new Color(0, 0, 0));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setBounds(57, 400, 100, 30);
		contentPane.add(btnCancelar);
		
		txtCed = new JTextField();
		txtCed.setBounds(223, 75, 108, 20);
		contentPane.add(txtCed);
		txtCed.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(223, 215, 108, 20);
		contentPane.add(txtTel);
		
		txtApe = new JTextField();
		txtApe.setColumns(10);
		txtApe.setBounds(223, 141, 108, 20);
		contentPane.add(txtApe);
		
		txtDom = new JTextField();
		txtDom.setColumns(10);
		txtDom.setBounds(223, 176, 108, 20);
		contentPane.add(txtDom);
		
		txtPorce = new JTextField();
		txtPorce.setColumns(10);
		txtPorce.setBounds(223, 300, 108, 20);
		contentPane.add(txtPorce);
		
		txtRaz = new JTextField();
		txtRaz.setColumns(10);
		txtRaz.setBounds(223, 341, 108, 20);
		contentPane.add(txtRaz);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(223, 106, 108, 20);
		contentPane.add(txtNom);
		
		JLabel lblCedula = new JLabel("Ingrese Cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(57, 78, 100, 14);
		contentPane.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Ingrese Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(57, 113, 100, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Ingrese Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellido.setBounds(57, 148, 100, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDomicilo = new JLabel("Ingrese Domicilo");
		lblDomicilo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDomicilo.setBounds(57, 183, 100, 14);
		contentPane.add(lblDomicilo);
		
		JLabel lblTelefono = new JLabel("Ingrese Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(57, 218, 100, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblBecado = new JLabel("¿El alumno es becado?");
		lblBecado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBecado.setBounds(37, 259, 141, 14);
		contentPane.add(lblBecado);
		
		JLabel lblPorcentaje = new JLabel("Ingrese porcentaje de beca");
		lblPorcentaje.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPorcentaje.setBounds(37, 303, 159, 14);
		contentPane.add(lblPorcentaje);
		
		JLabel lblRazon = new JLabel("Ingrese Razon de la beca");
		lblRazon.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRazon.setBounds(37, 344, 159, 14);
		contentPane.add(lblRazon);
		
		JCheckBox chckBec = new JCheckBox("");
		chckBec.setBackground(new Color(255, 255, 255));
		chckBec.setBounds(263, 250, 21, 23);
		contentPane.add(chckBec);
		
		JLabel lblTituloRegAlum = new JLabel("REGISTRAR ALUMNO");
		lblTituloRegAlum.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloRegAlum.setBounds(88, 11, 225, 33);
		contentPane.add(lblTituloRegAlum);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setBounds(206, 400, 114, 30);
		contentPane.add(btnRegistrar);
	}
}
