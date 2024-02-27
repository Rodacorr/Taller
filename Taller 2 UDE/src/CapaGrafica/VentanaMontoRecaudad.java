package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class VentanaMontoRecaudad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCed;
	private JTextField textAnioLec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMontoRecaudad frame = new VentanaMontoRecaudad();
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
	public VentanaMontoRecaudad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloMontoRecaudado = new JLabel("Monto Recaudado");
		lblTituloMontoRecaudado.setBounds(118, 0, 177, 26);
		lblTituloMontoRecaudado.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloMontoRecaudado);
		
		JLabel lblCedAlumno = new JLabel("Cedula Alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(55, 56, 101, 19);
		contentPane.add(lblCedAlumno);
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(248, 55, 86, 20);
		contentPane.add(textCed);
		
		JLabel lblAnioLectivo = new JLabel("Año Lectivo");
		lblAnioLectivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAnioLectivo.setBounds(55, 89, 101, 19);
		contentPane.add(lblAnioLectivo);
		
		textAnioLec = new JTextField();
		textAnioLec.setColumns(10);
		textAnioLec.setBounds(248, 86, 86, 20);
		contentPane.add(textAnioLec);
		
		JLabel lblMontoRecaudado = new JLabel("\"monto\"");
		lblMontoRecaudado.setBounds(118, 141, 177, 50);
		contentPane.add(lblMontoRecaudado);
	}

}
