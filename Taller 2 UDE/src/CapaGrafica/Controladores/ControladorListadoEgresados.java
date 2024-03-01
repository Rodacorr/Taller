package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaListadoEgresados;
import CapaGrafica.VentanaRegistrarAlumno;
import CapaLogica.IFachada;

public class ControladorListadoEgresados {
	private VentanaListadoEgresados ventana;
	private IFachada fachada;

	public ControladorListadoEgresados(VentanaListadoEgresados ven) {
		this.ventana = ven;
		try {
			fachada = (IFachada)
			Naming.lookup("//localhost:1099/fachada");
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
			e.printStackTrace();
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
			e.printStackTrace();
		} catch (NotBoundException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
		}
	}
	
	
	
	
	

}
