package CapaGrafica.Controladores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Properties;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaPrincipal;
import CapaGrafica.VentanaRegistrarAsignatura;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.AsignaturaYaExisteException;
import CapaLogica.Exceptions.AsignaturasCompletaException;
import CapaLogica.VO.voAsignatura;
import persistencia.exceptions.PersistenciaException;

public class ControladorPrincipal {
	private VentanaPrincipal ventana;
	private IFachada fachada;
	private boolean conexionExitosa = false;


	public ControladorPrincipal(VentanaPrincipal ven) {
		this.ventana = ven;
		try {
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String ip = prop.getProperty("ip");
			String puerto = prop.getProperty("puerto");
			fachada = (IFachada)
					Naming.lookup("//"+ip+":"+puerto+"/fachada");

			conexionExitosa = true;
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
			e.printStackTrace();
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
			e.printStackTrace();
		} catch (NotBoundException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isConexionExitosa() {
		return conexionExitosa;
	}


	public void respaldar() {
		try {
			fachada.respaldar();
			ventana.mostrarMensajeExito("Datos respaldados correctamente");
		} catch (PersistenciaException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError(exc.getMessage());
		}
	}


}