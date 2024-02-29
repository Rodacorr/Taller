package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaConsultaEscolaridad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCed;
	private JRadioButton rdbtnCompleto;
	private JRadioButton rdbtnParcial;
	

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
		setTitle("LISTAR ESCOLARIDAD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 190);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup bgp = new ButtonGroup();
		
		textCed = new JTextField();
		textCed.setColumns(10);
		textCed.setBounds(173, 25, 128, 20);
		contentPane.add(textCed);
		
		JLabel lblCedula = new JLabel("Indique cedula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(34, 26, 101, 19);
		contentPane.add(lblCedula);
		
		JLabel lblModoListado = new JLabel("Indique modo");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(34, 69, 101, 19);
		contentPane.add(lblModoListado);
		
		rdbtnParcial = new JRadioButton("Parcial");
		rdbtnParcial.setBackground(Color.WHITE);
		rdbtnParcial.setBounds(141, 67, 71, 23);
		contentPane.add(rdbtnParcial);
		bgp.add(rdbtnParcial);
		
		rdbtnCompleto = new JRadioButton("Completo");
		rdbtnCompleto.setBackground(Color.WHITE);
		rdbtnCompleto.setBounds(214, 67, 79, 23);
		contentPane.add(rdbtnCompleto);
		bgp.add(rdbtnCompleto);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCompleto.isSelected()) {
					JOptionPane.showMessageDialog(null, "completo");
					///ventana.setVisible(true);
				}
				else if(rdbtnParcial.isSelected()) {
					JOptionPane.showMessageDialog(null, "parcial");
					///ventana.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion");
				}
	
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(173, 108, 100, 30);
		contentPane.add(btnListar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(43, 108, 92, 30);
		contentPane.add(btnVolver);
		
	}
}
