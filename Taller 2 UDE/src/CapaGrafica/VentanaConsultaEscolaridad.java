package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class VentanaConsultaEscolaridad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsultaEscolaridad frame = new VentanaConsultaEscolaridad();
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
	public VentanaConsultaEscolaridad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloMontoRecaudado = new JLabel("Monto Recaudado");
		lblTituloMontoRecaudado.setBounds(117, 0, 172, 26);
		lblTituloMontoRecaudado.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloMontoRecaudado);
		
		JLabel lblCedAlumno = new JLabel("Cedula Alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(56, 59, 101, 19);
		contentPane.add(lblCedAlumno);
		
		JLabel lblModoListado = new JLabel("Modo Listado");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(56, 101, 101, 19);
		contentPane.add(lblModoListado);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(248, 58, 86, 20);
		contentPane.add(textField);
		
		JCheckBox chckbxModo = new JCheckBox("Completo");
		chckbxModo.setBounds(248, 99, 97, 23);
		contentPane.add(chckbxModo);
		
		JButton btnMostrarRecaudado = new JButton("Mostrar");
		btnMostrarRecaudado.setBounds(145, 145, 89, 23);
		contentPane.add(btnMostrarRecaudado);
		
		JLabel lblDynamic = new JLabel("\"TEXTO MOSTRADO\"");
		lblDynamic.setBounds(160, 198, 129, 14);
		contentPane.add(lblDynamic);
		
	}
}
