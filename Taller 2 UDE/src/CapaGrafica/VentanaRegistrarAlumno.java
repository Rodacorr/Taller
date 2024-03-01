package CapaGrafica;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import CapaGrafica.Controladores.ControladorRegistrarAlumno;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class VentanaRegistrarAlumno {

	private JFrame frmRegistrarAlumno;
	private JPanel contentPane;
	private JTextField txtCed;
	private JTextField txtTel;
	private JTextField txtApe;
	private JTextField txtDom;
	private JTextField txtPorce;
	private JTextField txtRaz;
	private JTextField txtNom;
	private JCheckBox chckBec;
	private JLabel lblPorcentaje;
	private JLabel lblRazon;
	private ControladorRegistrarAlumno controlador;
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
					VentanaRegistrarAlumno window = new VentanaRegistrarAlumno(ventanaPrincipal);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistrarAlumno(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
		controlador = new ControladorRegistrarAlumno(this);
	}
	private void initialize() { 	
		frmRegistrarAlumno = new JFrame();
		frmRegistrarAlumno.setTitle("REGISTRAR ALUMNO");
		frmRegistrarAlumno.getContentPane().setBackground(new Color(255, 255, 255));
		frmRegistrarAlumno.getContentPane().setForeground(new Color(255, 255, 255));
		frmRegistrarAlumno.setBounds(100, 100, 367, 410);
		frmRegistrarAlumno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrarAlumno.getContentPane().setLayout(null);
		
		txtCed = new JTextField();
		txtCed.setBounds(223, 20, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtCed);
		txtCed.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(223, 156, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtTel);
		
		txtApe = new JTextField();
		txtApe.setColumns(10);
		txtApe.setBounds(223, 88, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtApe);
		
		txtDom = new JTextField();
		txtDom.setColumns(10);
		txtDom.setBounds(223, 121, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtDom);
		
		txtPorce = new JTextField();
		txtPorce.setVisible(false);
		txtPorce.setColumns(10);
		txtPorce.setBounds(223, 235, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtPorce);
		
		txtRaz = new JTextField();
		txtRaz.setVisible(false);
		txtRaz.setColumns(10);
		txtRaz.setBounds(223, 274, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtRaz);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(223, 53, 108, 20);
		frmRegistrarAlumno.getContentPane().add(txtNom);
		
		JLabel lblCedula = new JLabel("Ingrese Cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(57, 23, 100, 14);
		frmRegistrarAlumno.getContentPane().add(lblCedula);
		
		JLabel lblNombre = new JLabel("Ingrese Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(57, 56, 100, 14);
		frmRegistrarAlumno.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Ingrese Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellido.setBounds(57, 91, 100, 14);
		frmRegistrarAlumno.getContentPane().add(lblApellido);
		
		JLabel lblDomicilo = new JLabel("Ingrese Domicilo");
		lblDomicilo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDomicilo.setBounds(57, 124, 100, 14);
		frmRegistrarAlumno.getContentPane().add(lblDomicilo);
		
		JLabel lblTelefono = new JLabel("Ingrese Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(57, 159, 100, 14);
		frmRegistrarAlumno.getContentPane().add(lblTelefono);
		
		JLabel lblBecado = new JLabel("¿El alumno es becado?");
		lblBecado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBecado.setBounds(57, 199, 141, 14);
		frmRegistrarAlumno.getContentPane().add(lblBecado);
		
		lblPorcentaje = new JLabel("Ingrese porcentaje de beca");
		lblPorcentaje.setVisible(false);
		lblPorcentaje.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPorcentaje.setBounds(39, 238, 159, 14);
		frmRegistrarAlumno.getContentPane().add(lblPorcentaje);
		
		lblRazon = new JLabel("Ingrese Razon de la beca");
		lblRazon.setVisible(false);
		lblRazon.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRazon.setBounds(39, 277, 159, 14);
		frmRegistrarAlumno.getContentPane().add(lblRazon);
		
		chckBec = new JCheckBox("");
		chckBec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckBec.isSelected()) {
					lblRazon.setVisible(true);
					lblPorcentaje.setVisible(true);
					txtRaz.setVisible(true);
					txtPorce.setVisible(true);
				}
				else {
					lblRazon.setVisible(false);
					lblPorcentaje.setVisible(false);
					txtRaz.setVisible(false);
					txtPorce.setVisible(false);
				}
			}
		});
		chckBec.setBackground(new Color(255, 255, 255));
		chckBec.setBounds(265, 190, 21, 23);
		frmRegistrarAlumno.getContentPane().add(chckBec);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long cedula = Long.parseLong(txtCed.getText());
				String nombre = txtNom.getText();
				String apellido = txtApe.getText();
				String domicilio = txtDom.getText();
				long telefono = Long.parseLong(txtTel.getText());
				if(chckBec.isSelected()){
					int porcentaje = Integer.parseInt(txtPorce.getText());
					String razon = txtRaz.getText();
					controlador.registrarAlumnoBecado(cedula, nombre, apellido, domicilio, telefono,porcentaje,razon);
				}
				else {
					controlador.registrarAlumno(cedula,nombre,apellido,domicilio,telefono);
				}
			}
		});
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setBounds(203, 322, 114, 30);
		frmRegistrarAlumno.getContentPane().add(btnRegistrar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				frmRegistrarAlumno.dispose();
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(65, 322, 92, 30);
		frmRegistrarAlumno.getContentPane().add(btnVolver);
	}
	
	public void setVisible(boolean mostrar) {
		frmRegistrarAlumno.setVisible(mostrar);
	}

	public void mostrarMensajeError (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrarMensajeExito (String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}

