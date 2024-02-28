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
import javax.swing.ButtonGroup;
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
	private JRadioButton rdbtnCompleto;
	private JRadioButton rdbtnParcial;

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
		setTitle("LISTAR EGRESADOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 142);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup bgp = new ButtonGroup();
		
		JLabel lblModoListado = new JLabel("Indique modo");
		lblModoListado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModoListado.setBounds(25, 21, 101, 19);
		contentPane.add(lblModoListado);
		
		rdbtnCompleto = new JRadioButton("Completo");
		rdbtnCompleto.setBackground(new Color(255, 255, 255));
		rdbtnCompleto.setBounds(205, 19, 79, 23);
		contentPane.add(rdbtnCompleto);
		bgp.add(rdbtnCompleto);
		
		rdbtnParcial = new JRadioButton("Parcial");
		rdbtnParcial.setBackground(new Color(255, 255, 255));
		rdbtnParcial.setBounds(132, 19, 71, 23);
		contentPane.add(rdbtnParcial);
		bgp.add(rdbtnParcial);
		
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
		btnListar.setBounds(173, 59, 100, 30);
		contentPane.add(btnListar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(49, 59, 92, 30);
		contentPane.add(btnVolver);
	}
}
