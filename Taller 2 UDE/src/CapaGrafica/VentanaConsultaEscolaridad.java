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
import java.awt.Color;

public class VentanaConsultaEscolaridad extends JFrame {

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
		setBounds(100, 100, 341, 237);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloEscolaridad = new JLabel("LISTAR ESCOLARIDAD");
		lblTituloEscolaridad.setBounds(61, 11, 224, 26);
		lblTituloEscolaridad.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloEscolaridad);
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(173, 58, 128, 20);
		contentPane.add(textCed);
		
		JLabel lblCedula = new JLabel("Indique cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(34, 59, 101, 19);
		contentPane.add(lblCedula);
		
		JLabel lblModoListado = new JLabel("Indique modo");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(34, 102, 101, 19);
		contentPane.add(lblModoListado);
		
		JRadioButton rdbtnParcial = new JRadioButton("Parcial");
		rdbtnParcial.setBackground(Color.WHITE);
		rdbtnParcial.setBounds(141, 100, 71, 23);
		contentPane.add(rdbtnParcial);
		
		JRadioButton rdbtnCompleto = new JRadioButton("Completo");
		rdbtnCompleto.setBackground(Color.WHITE);
		rdbtnCompleto.setBounds(222, 100, 79, 23);
		contentPane.add(rdbtnCompleto);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(Color.BLACK);
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(46, 146, 100, 30);
		contentPane.add(btnCancelar);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(173, 146, 100, 30);
		contentPane.add(btnListar);
		
	}
}
