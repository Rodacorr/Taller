package CapaGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import javax.swing.JTree;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaListadoAsignaturas extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListadoAsignaturas frame = new VentanaListadoAsignaturas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//creemos que la tabla se insertan valores dimamicamente por el arreglo lo mismo para listar alumno apellido
	
	
	
	public VentanaListadoAsignaturas() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblListarAsignaturas = new JLabel("LISTAR ASIGNATURAS");
		lblListarAsignaturas.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblListarAsignaturas.setBounds(46, 11, 224, 26);
		getContentPane().add(lblListarAsignaturas);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBackground(Color.GREEN);
		btnListar.setBounds(168, 62, 100, 30);
		getContentPane().add(btnListar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(Color.BLACK);
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(27, 62, 100, 30);
		getContentPane().add(btnCancelar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 147);
	}
}
