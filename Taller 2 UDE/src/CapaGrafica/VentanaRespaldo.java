package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class VentanaRespaldo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRespaldo frame = new VentanaRespaldo();
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
	public VentanaRespaldo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 165);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloRespaldar = new JLabel("RESPALDAR");
		lblTituloRespaldar.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTituloRespaldar.setBounds(100, 0, 141, 26);
		contentPane.add(lblTituloRespaldar);
		
		JButton btnRespaldar = new JButton("RESPALDAR");
		btnRespaldar.setForeground(Color.BLACK);
		btnRespaldar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRespaldar.setBackground(Color.GREEN);
		btnRespaldar.setBounds(166, 58, 114, 30);
		contentPane.add(btnRespaldar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setForeground(Color.BLACK);
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(26, 58, 100, 30);
		contentPane.add(btnCancelar);
	}
}
