package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;

public class VentanaListadoCedula extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListadoCedula frame = new VentanaListadoCedula();
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
	public VentanaListadoCedula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListar = new JLabel("Listar Alumnos Cedula");
		lblTituloListar.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloListar.setBounds(113, 0, 242, 40);
		contentPane.add(lblTituloListar);
		
		JLabel lblCedulaIngresado = new JLabel("Ingrese Cedula");
		lblCedulaIngresado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaIngresado.setBounds(77, 51, 101, 19);
		contentPane.add(lblCedulaIngresado);
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(246, 51, 86, 20);
		contentPane.add(textCed);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBounds(96, 97, 260, 23);
		contentPane.add(btnListar);
		
		//decidir si hay que mostrarlo dinamico o ya queda ahi y saltamos otra ventana por si no existe la cedula
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellido.setBounds(52, 210, 55, 19);
		contentPane.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(52, 180, 55, 19);
		contentPane.add(lblNombre);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(52, 142, 55, 19);
		contentPane.add(lblCedula);
		
		JLabel lblTipoAlum = new JLabel("Tipo Alumno");
		lblTipoAlum.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTipoAlum.setBounds(52, 357, 84, 19);
		contentPane.add(lblTipoAlum);
		
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDomicilio.setBounds(52, 249, 55, 19);
		contentPane.add(lblDomicilio);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(52, 290, 55, 19);
		contentPane.add(lblTelefono);
		
		JLabel lblCantAsig = new JLabel("Cantidad de Asignaturas");
		lblCantAsig.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCantAsig.setBounds(52, 317, 151, 19);
		contentPane.add(lblCantAsig);
		//estos dos se muestran si es becado
		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescuento.setBounds(123, 387, 80, 19);
		contentPane.add(lblDescuento);
		
		JLabel lblRAzon = new JLabel("Razon");
		lblRAzon.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRAzon.setBounds(123, 417, 55, 19);
		contentPane.add(lblRAzon);
		
		
		//Mostrar esto dinamico con la cedula que ingreso
		
			JLabel lblDnyCed = new JLabel("dinamico de cedula");
			lblDnyCed.setBounds(288, 144, 115, 14);
			contentPane.add(lblDnyCed);
		
			JLabel lblDnyNom = new JLabel("dinamico");
			lblDnyNom.setBounds(271, 182, 46, 14);
			contentPane.add(lblDnyNom);
			
			JLabel lblDnyApe = new JLabel("dinamico");
			lblDnyApe.setBounds(281, 212, 46, 14);
			contentPane.add(lblDnyApe);
			
			JLabel lblDnyDom = new JLabel("dinamico");
			lblDnyDom.setBounds(288, 251, 46, 14);
			contentPane.add(lblDnyDom);
			
			JLabel lblDnyTel = new JLabel("dinamico");
			lblDnyTel.setBounds(271, 292, 46, 14);
			contentPane.add(lblDnyTel);
			
			JLabel lblDnyCantAsi = new JLabel("dinamico ");
			lblDnyCantAsi.setBounds(271, 319, 46, 14);
			contentPane.add(lblDnyCantAsi);
			
			JLabel lblDnyBecado = new JLabel("dinamico");
			lblDnyBecado.setBounds(271, 359, 46, 14);
			contentPane.add(lblDnyBecado);
			
			JLabel lblDnyDesc = new JLabel("dinamico");
			lblDnyDesc.setBounds(271, 389, 46, 14);
			contentPane.add(lblDnyDesc);
			
			JLabel lblDnyRaz = new JLabel("dinamico");
			lblDnyRaz.setBounds(271, 419, 46, 14);
			contentPane.add(lblDnyRaz);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(52, 387, 351, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 131, 464, 0);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 123, 432, 8);
		contentPane.add(separator_2);
	}
}
