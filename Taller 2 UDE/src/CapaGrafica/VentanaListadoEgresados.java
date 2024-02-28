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
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class VentanaListadoEgresados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListadoEgresados frame = new VentanaListadoEgresados();
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
	public VentanaListadoEgresados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 188);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListar = new JLabel("LISTAR EGRESADOS");
		lblTituloListar.setBounds(59, 0, 206, 26);
		lblTituloListar.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTituloListar);
		
		JLabel lblModoListado = new JLabel("Indique modo");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(26, 53, 101, 19);
		contentPane.add(lblModoListado);
		
		JRadioButton rdbtnCompleto = new JRadioButton("Completo");
		rdbtnCompleto.setBackground(new Color(255, 255, 255));
		rdbtnCompleto.setBounds(221, 51, 79, 23);
		contentPane.add(rdbtnCompleto);
		
		JRadioButton rdbtnParcial = new JRadioButton("Parcial");
		rdbtnParcial.setBackground(new Color(255, 255, 255));
		rdbtnParcial.setBounds(139, 51, 71, 23);
		contentPane.add(rdbtnParcial);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(178, 97, 100, 30);
		contentPane.add(btnListar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(45, 97, 92, 30);
		contentPane.add(btnVolver);
	}
}
