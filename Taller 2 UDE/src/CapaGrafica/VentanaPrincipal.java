package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JRadioButton rdbtnRegistrarAsigantura = new JRadioButton("Registrar Asigantura");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPrinciapl = new JLabel("MENU PRINCIPAL");
		lblTituloPrinciapl.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTituloPrinciapl.setBounds(158, 0, 182, 38);
		contentPane.add(lblTituloPrinciapl);
		
		JLabel lblSubtitulo = new JLabel("Seleccione la opcion deseada");
		lblSubtitulo.setBounds(158, 46, 209, 14);
		contentPane.add(lblSubtitulo);
		
		JRadioButton rdbtnReq2 = new JRadioButton("Listado de Asignaturas");
		rdbtnReq2.setBackground(new Color(255, 255, 255));
		rdbtnReq2.setBounds(40, 101, 159, 23);
		contentPane.add(rdbtnReq2);
		
		JRadioButton rdbtnReq3 = new JRadioButton("Registrar Alumno");
		rdbtnReq3.setBackground(Color.WHITE);
		rdbtnReq3.setBounds(40, 133, 135, 23);
		contentPane.add(rdbtnReq3);
		
		JRadioButton rdbtnReq4 = new JRadioButton("Listado de Alumno dado Apellido");
		rdbtnReq4.setBackground(Color.WHITE);
		rdbtnReq4.setBounds(40, 166, 217, 23);
		contentPane.add(rdbtnReq4);
		
		JRadioButton rdbtnReq5 = new JRadioButton("Listado de Alumno dada Cedula");
		rdbtnReq5.setBackground(Color.WHITE);
		rdbtnReq5.setBounds(40, 198, 217, 23);
		contentPane.add(rdbtnReq5);
		
		JRadioButton rdbtnReq6 = new JRadioButton("Registrar Inscrpcion");
		rdbtnReq6.setBackground(Color.WHITE);
		rdbtnReq6.setBounds(40, 231, 159, 23);
		contentPane.add(rdbtnReq6);
		rdbtnRegistrarAsigantura.setBounds(40, 67, 180, 31);
		contentPane.add(rdbtnRegistrarAsigantura);
		rdbtnRegistrarAsigantura.setBackground(Color.WHITE);
		
		JRadioButton rdbtnReq7 = new JRadioButton("Registrar Calificacion");
		rdbtnReq7.setBackground(Color.WHITE);
		rdbtnReq7.setBounds(268, 71, 159, 23);
		contentPane.add(rdbtnReq7);
		
		JRadioButton rdbtnReq8 = new JRadioButton("Calcular Monto Recaudado");
		rdbtnReq8.setBackground(Color.WHITE);
		rdbtnReq8.setBounds(268, 101, 186, 23);
		contentPane.add(rdbtnReq8);
		
		JRadioButton rdbtnReq9 = new JRadioButton("Listar Escolaridad ");
		rdbtnReq9.setBackground(Color.WHITE);
		rdbtnReq9.setBounds(268, 133, 135, 23);
		contentPane.add(rdbtnReq9);
		
		JRadioButton rdbtnReq10 = new JRadioButton("Listar Egresados");
		rdbtnReq10.setBackground(Color.WHITE);
		rdbtnReq10.setBounds(268, 166, 135, 23);
		contentPane.add(rdbtnReq10);
		
		JRadioButton rdbtnReq11 = new JRadioButton("Respaldar");
		rdbtnReq11.setBackground(Color.WHITE);
		rdbtnReq11.setBounds(268, 198, 109, 23);
		contentPane.add(rdbtnReq11);
		
		JRadioButton rdbtnReq12 = new JRadioButton("Recuperar");
		rdbtnReq12.setBackground(Color.WHITE);
		rdbtnReq12.setBounds(268, 231, 109, 23);
		contentPane.add(rdbtnReq12);
		
		JButton btnAbrir = new JButton("ABRIR");
		btnAbrir.setForeground(Color.BLACK);
		btnAbrir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAbrir.setBackground(Color.GREEN);
		btnAbrir.setBounds(226, 268, 114, 30);
		contentPane.add(btnAbrir);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSalir.setBackground(new Color(255, 0, 0));
		btnSalir.setBounds(81, 268, 92, 30);
		contentPane.add(btnSalir);
	}
}
