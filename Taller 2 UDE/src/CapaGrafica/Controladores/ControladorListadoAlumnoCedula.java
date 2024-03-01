package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaListadoAlumnoApellido;
import CapaGrafica.VentanaListadoAlumnoCedula;
import CapaLogica.IFachada;

public class ControladorListadoAlumnoCedula {
	private VentanaListadoAlumnoCedula ventana;
	private IFachada fachada;

	public ControladorListadoAlumnoCedula(VentanaListadoAlumnoCedula ven) {
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
