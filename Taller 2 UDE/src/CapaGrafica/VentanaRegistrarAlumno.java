package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;

public class VentanaRegistrarAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCed;
	private JTextField txtTel;
	private JTextField txtApe;
	private JTextField txtDom;
	private JTextField txtPorce;
	private JTextField txtRa;
	private JTextField txtNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrarAlumno frame = new VentanaRegistrarAlumno();
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
	public VentanaRegistrarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancel = new JButton("Canecelar");
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancel.setForeground(new Color(255, 0, 0));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setBounds(75, 400, 100, 30);
		contentPane.add(btnCancel);
		
		JButton btnAccept = new JButton("Aceptar");
		btnAccept.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAccept.setForeground(new Color(0, 255, 0));
		btnAccept.setBackground(new Color(0, 255, 0));
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccept.setBounds(225, 400, 100, 30);
		contentPane.add(btnAccept);
		
		txtCed = new JTextField();
		txtCed.setBounds(225, 75, 86, 20);
		contentPane.add(txtCed);
		txtCed.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(225, 215, 86, 20);
		contentPane.add(txtTel);
		
		txtApe = new JTextField();
		txtApe.setColumns(10);
		txtApe.setBounds(225, 145, 86, 20);
		contentPane.add(txtApe);
		
		txtDom = new JTextField();
		txtDom.setColumns(10);
		txtDom.setBounds(225, 180, 86, 20);
		contentPane.add(txtDom);
		
		txtPorce = new JTextField();
		txtPorce.setColumns(10);
		txtPorce.setBounds(225, 285, 86, 20);
		contentPane.add(txtPorce);
		
		txtRa = new JTextField();
		txtRa.setColumns(10);
		txtRa.setBounds(225, 320, 86, 20);
		contentPane.add(txtRa);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(225, 110, 86, 20);
		contentPane.add(txtNom);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(75, 75, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(75, 110, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(75, 145, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Domicilo");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(75, 180, 70, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(75, 215, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Es becado?");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(75, 250, 79, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Porcentaje");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(75, 285, 70, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Razon");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(75, 320, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JCheckBox chckBec = new JCheckBox("");
		chckBec.setBounds(250, 250, 97, 23);
		contentPane.add(chckBec);
		
		JLabel lblNewLabel_8 = new JLabel("Registrar Alumno");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_8.setBounds(100, 25, 175, 33);
		contentPane.add(lblNewLabel_8);
	}
}
