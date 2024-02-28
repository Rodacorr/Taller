package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMontoRecaudado extends JFrame {

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
					VentanaMontoRecaudado frame = new VentanaMontoRecaudado();
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
	public VentanaMontoRecaudado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 251);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloMontoRecaudado = new JLabel("MONTO RECAUDADO");
		lblTituloMontoRecaudado.setBounds(92, 0, 216, 26);
		lblTituloMontoRecaudado.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloMontoRecaudado);

		JLabel lblCedAlumno = new JLabel("Ingrese cedula del alumno");
		lblCedAlumno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedAlumno.setBounds(36, 56, 152, 19);
		contentPane.add(lblCedAlumno);

		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(212, 55, 122, 20);
		contentPane.add(textCed);

		JLabel lblAnioLectivo = new JLabel("Ingrese año lectivo");
		lblAnioLectivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAnioLectivo.setBounds(36, 97, 109, 19);
		contentPane.add(lblAnioLectivo);

		textAnioLec = new JTextField();
		textAnioLec.setColumns(10);
		textAnioLec.setBounds(212, 96, 122, 20);
		contentPane.add(textAnioLec);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setBounds(222, 147, 100, 30);
		contentPane.add(btnCalcular);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(67, 147, 92, 30);
		contentPane.add(btnVolver);
	}

}
