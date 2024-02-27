package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaInscripcionAsignatura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCedAlu;
	private JTextField textCodAsi;
	private JTextField textMonto;
	private JTextField textAnio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInscripcionAsignatura frame = new VentanaInscripcionAsignatura();
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
	public VentanaInscripcionAsignatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitituloInscribir = new JLabel("Inscribir Alumno");
		lblTitituloInscribir.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTitituloInscribir.setBounds(124, 0, 163, 40);
		contentPane.add(lblTitituloInscribir);
		
		JLabel lblCedulaAlumno = new JLabel("Ingrese Cedula");
		lblCedulaAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedulaAlumno.setBounds(61, 52, 86, 19);
		contentPane.add(lblCedulaAlumno);
		
		textCedAlu = new JTextField();
		textCedAlu.setColumns(10);
		textCedAlu.setBounds(287, 51, 86, 20);
		contentPane.add(textCedAlu);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrar.setBounds(61, 224, 332, 32);
		contentPane.add(btnRegistrar);
		
		JLabel lblCodigoAsignatura = new JLabel("Ingrese Codigo Asignatura");
		lblCodigoAsignatura.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigoAsignatura.setBounds(61, 95, 153, 19);
		contentPane.add(lblCodigoAsignatura);
		
		textCodAsi = new JTextField();
		textCodAsi.setColumns(10);
		textCodAsi.setBounds(287, 94, 86, 20);
		contentPane.add(textCodAsi);
		
		JLabel lblCodigoAsignatura_1 = new JLabel("Monto Base");
		lblCodigoAsignatura_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigoAsignatura_1.setBounds(61, 125, 153, 19);
		contentPane.add(lblCodigoAsignatura_1);
		
		JLabel lblCodigoAsignatura_2 = new JLabel("Año Lectivo");
		lblCodigoAsignatura_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigoAsignatura_2.setBounds(61, 168, 153, 19);
		contentPane.add(lblCodigoAsignatura_2);
		
		textMonto = new JTextField();
		textMonto.setColumns(10);
		textMonto.setBounds(287, 125, 86, 20);
		contentPane.add(textMonto);
		
		textAnio = new JTextField();
		textAnio.setColumns(10);
		textAnio.setBounds(287, 167, 86, 20);
		contentPane.add(textAnio);
	}
}
