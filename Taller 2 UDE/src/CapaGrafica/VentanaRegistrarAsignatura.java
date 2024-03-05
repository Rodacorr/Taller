package CapaGrafica;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import CapaGrafica.Controladores.ControladorRegistrarAsignatura;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VentanaRegistrarAsignatura {

	private JFrame frmRegistrarAsignatura;
	private JTextField txtNom;
	private JTextField txtCod;
	private JTextArea txtDesc;
	private JButton btnRegistrar;
	private ControladorRegistrarAsignatura controlador;
	private VentanaPrincipal ventanaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.setVisible(true); 
					VentanaRegistrarAsignatura window = new VentanaRegistrarAsignatura(ventanaPrincipal);
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
	public VentanaRegistrarAsignatura(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorRegistrarAsignatura(this);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrarAsignatura = new JFrame();
		frmRegistrarAsignatura.setTitle("REGISTRAR ASIGNATURA");
		frmRegistrarAsignatura.getContentPane().setBackground(new Color(255, 255, 255));
		frmRegistrarAsignatura.getContentPane().setForeground(new Color(255, 255, 255));
		frmRegistrarAsignatura.setBounds(100, 100, 367, 298);
		frmRegistrarAsignatura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrarAsignatura.getContentPane().setLayout(null);
		frmRegistrarAsignatura.setResizable(false);


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
		txtNom.setForeground(new Color(0, 0, 0));
		txtNom.setBounds(197, 56, 114, 20);
		frmRegistrarAsignatura.getContentPane().add(txtNom);
		txtNom.setColumns(10);

		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(197, 20, 114, 20);
		frmRegistrarAsignatura.getContentPane().add(txtCod);

		final JTextArea txtDesc = new JTextArea();
		txtDesc.setWrapStyleWord(true);
		txtDesc.setLineWrap(true);
		txtDesc.setRows(3);
		txtDesc.setBounds(197, 99, 114, 93);
		Border border = BorderFactory.createLineBorder(Color.GRAY); 
		txtDesc.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		frmRegistrarAsignatura.getContentPane().add(txtDesc);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCod.getText();
				String nombre = txtNom.getText();
				String descripcion = txtDesc.getText();
				controlador.registrarAsignatura(codigo, nombre, descripcion);
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegistrar.setBackground(new Color(0x198754));
		btnRegistrar.setBounds(186, 215, 114, 30);
		frmRegistrarAsignatura.getContentPane().add(btnRegistrar);

		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmRegistrarAsignatura.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.BOLD, 12));
		btnVolver.setBackground(new Color(0x8fe1f7));
		btnVolver.setBounds(57, 215, 92, 30);
		frmRegistrarAsignatura.getContentPane().add(btnVolver);
	}
	
	public void setVisible(boolean mostrar) {
		frmRegistrarAsignatura.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
