package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

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
	private JTextField txtCed2;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtCantAsigAprob;
	private JTextField txtDom;
	private JTextField txtTel;
	private JTextField txtTipo;
	private JTextField txtPorceBeca;
	private JTextField txtRaz;
	private JLabel lblCedula;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblCantAsigAprob;
	private JLabel lblDomicilio;
	private JLabel lblTelefono;
	private JLabel lblTipo;
	private JLabel lblPorceBeca;
	private JLabel lblRazon;


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
		frmListarAlumnoCed.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/Logo.png")));
		frmListarAlumnoCed.getContentPane().setBackground(new Color(255, 255, 255));
		frmListarAlumnoCed.getContentPane().setLayout(null);
		frmListarAlumnoCed.setResizable(false);


		JLabel lblCedulaIngresado = new JLabel("Indique la cédula de un alumno:");
		lblCedulaIngresado.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaIngresado.setBounds(20, 32, 181, 19);
		frmListarAlumnoCed.getContentPane().add(lblCedulaIngresado);

		txtCed = new JTextField();
		txtCed.setColumns(10);
		txtCed.setBounds(207, 32, 136, 20);
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
		btnVolver.setBounds(59, 91, 92, 30);
		frmListarAlumnoCed.getContentPane().add(btnVolver);


		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cedula = txtCed.getText();
				controlador.listarAlumnoCed(cedula);
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.BOLD, 12));
		btnListar.setBackground(new Color(0x42b881));
		btnListar.setBounds(224, 91, 100, 30);
		frmListarAlumnoCed.getContentPane().add(btnListar);

		lblCedula = new JLabel("Cedula:");
		lblCedula.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCedula.setBounds(20, 147, 46, 14);
		lblCedula.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblCedula);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNombre.setBounds(20, 172, 74, 14);
		lblNombre.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblNombre);

		lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblApellido.setBounds(20, 197, 74, 14);
		lblApellido.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblApellido);

		lblCantAsigAprob = new JLabel("Cantidad asignaturas aprobadas:");
		lblCantAsigAprob.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCantAsigAprob.setBounds(20, 223, 191, 14);
		lblCantAsigAprob.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblCantAsigAprob);

		lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDomicilio.setBounds(20, 247, 92, 14);
		lblDomicilio.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblDomicilio);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTelefono.setBounds(20, 272, 74, 14);
		lblTelefono.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblTelefono);

		lblPorceBeca = new JLabel("Porcentaje de la beca:");
		lblPorceBeca.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPorceBeca.setBounds(20, 320, 151, 14);
		lblPorceBeca.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblPorceBeca);

		lblRazon = new JLabel("Razon de la beca:");
		lblRazon.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRazon.setBounds(20, 349, 142, 14);
		lblRazon.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblRazon);

		lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTipo.setBounds(20, 296, 46, 14);
		lblTipo.setVisible(false);
		frmListarAlumnoCed.getContentPane().add(lblTipo);

		txtCed2 = new JTextField();
		txtCed2.setBackground(new Color(255, 255, 255));
		txtCed2.setEditable(false);
		txtCed2.setBounds(228, 147, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtCed2);
		txtCed2.setColumns(10);
		txtCed2.setVisible(false);

		txtNom = new JTextField();
		txtNom.setBackground(new Color(255, 255, 255));
		txtNom.setEditable(false);
		txtNom.setBounds(228, 172, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		txtNom.setVisible(false);

		txtApe = new JTextField();
		txtApe.setBackground(new Color(255, 255, 255));
		txtApe.setEditable(false);
		txtApe.setBounds(228, 197, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtApe);
		txtApe.setColumns(10);
		txtApe.setVisible(false);

		txtCantAsigAprob = new JTextField();
		txtCantAsigAprob.setBackground(new Color(255, 255, 255));
		txtCantAsigAprob.setEditable(false);
		txtCantAsigAprob.setBounds(228, 222, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtCantAsigAprob);
		txtCantAsigAprob.setColumns(10);
		txtCantAsigAprob.setVisible(false);

		txtDom = new JTextField();
		txtDom.setBackground(new Color(255, 255, 255));
		txtDom.setEditable(false);
		txtDom.setBounds(228, 247, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtDom);
		txtDom.setColumns(10);
		txtDom.setVisible(false);

		txtTel = new JTextField();
		txtTel.setBackground(new Color(255, 255, 255));
		txtTel.setEditable(false);
		txtTel.setBounds(228, 272, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		txtTel.setVisible(false);

		txtTipo = new JTextField();
		txtTipo.setBackground(new Color(255, 255, 255));
		txtTipo.setEditable(false);
		txtTipo.setBounds(228, 297, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtTipo);
		txtTipo.setColumns(10);
		txtTipo.setVisible(false);

		txtPorceBeca = new JTextField();
		txtPorceBeca.setBackground(new Color(255, 255, 255));
		txtPorceBeca.setEditable(false);
		txtPorceBeca.setBounds(228, 322, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtPorceBeca);
		txtPorceBeca.setColumns(10);
		txtPorceBeca.setVisible(false);

		txtRaz = new JTextField();
		txtRaz.setBackground(new Color(255, 255, 255));
		txtRaz.setEditable(false);
		txtRaz.setBounds(228, 347, 86, 20);
		frmListarAlumnoCed.getContentPane().add(txtRaz);
		txtRaz.setColumns(10);
		txtRaz.setVisible(false);


		frmListarAlumnoCed.setTitle("LISTAR ALUMNO DADO SU CEDULA");
		frmListarAlumnoCed.setBounds(100, 100, 391, 424);
		frmListarAlumnoCed.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void setearDatosAlumno(String cedula, String nombre, String apellido, String cantAsigApro, String domicilio, String telefono, String tipo) {
		txtCed2.setText(cedula);
		txtNom.setText(nombre);
		txtApe.setText(apellido);
		txtCantAsigAprob.setText(cantAsigApro);
		txtDom.setText(domicilio);
		txtTel.setText(telefono);
		txtTipo.setText(tipo);
		lblCedula.setVisible(true);
		lblNombre.setVisible(true);
		lblApellido.setVisible(true);
		lblCantAsigAprob.setVisible(true);
		lblDomicilio.setVisible(true);
		lblTelefono.setVisible(true);
		lblTipo.setVisible(true);
		txtCed2.setVisible(true);
		txtNom.setVisible(true);
		txtApe.setVisible(true);
		txtCantAsigAprob.setVisible(true);
		txtDom.setVisible(true);
		txtTel.setVisible(true);
		txtTipo.setVisible(true);
	}

	public void setearDatosBecado(String cedula, String nombre, String apellido, String cantAsigApro, String domicilio, String telefono, String tipo, String porceBeca, String raz)  {
		txtCed2.setText(cedula);
		txtNom.setText(nombre);
		txtApe.setText(apellido);
		txtCantAsigAprob.setText(cantAsigApro);
		txtDom.setText(domicilio);
		txtTel.setText(telefono);
		txtTipo.setText(tipo);
		txtPorceBeca.setText(porceBeca);
		txtRaz.setText(raz);
		lblCedula.setVisible(true);
		lblNombre.setVisible(true);
		lblApellido.setVisible(true);
		lblCantAsigAprob.setVisible(true);
		lblDomicilio.setVisible(true);
		lblTelefono.setVisible(true);
		lblTipo.setVisible(true);
		lblPorceBeca.setVisible(true);
		lblRazon.setVisible(true);
		txtCed2.setVisible(true);
		txtNom.setVisible(true);
		txtApe.setVisible(true);
		txtCantAsigAprob.setVisible(true);
		txtDom.setVisible(true);
		txtTel.setVisible(true);
		txtTipo.setVisible(true);
		txtPorceBeca.setVisible(true);
		txtRaz.setVisible(true);
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
	
	public void setLocationRelativeToNull() {
		frmListarAlumnoCed.setLocationRelativeTo(null);
    }
}
