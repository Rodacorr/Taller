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

import CapaGrafica.VentanaRegistrarResultado;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.*;

public class ControladorRegistrarResultado {
	private VentanaRegistrarResultado ventana;
	private IFachada fachada;

	public ControladorRegistrarResultado(VentanaRegistrarResultado ven) {
		this.ventana = ven;
		try {
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String ip = prop.getProperty("ip");
			String puerto = prop.getProperty("puerto");
			fachada = (IFachada) Naming.lookup("//"+ip+":"+puerto+"/fachada");
			
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

	public void registrarCalificacion(String ced, String cal, String num){
		try {
			if (!ced.matches("\\d+")) {
				ventana.mostrarMensajeError("La cedula no tiene formato numerico");
			}
			else {
				if (!cal.matches("\\d+")) {
					ventana.mostrarMensajeError("La calificación no tiene formato numerico");
				}
				else {
					if (!num.matches("\\d+")) {
						ventana.mostrarMensajeError("El número de inscripción no tiene formato numerico");
					}
					else {
						fachada.registrarCalificacion(Long.parseLong(ced),Integer.parseInt(cal), Integer.parseInt(num));
						ventana.mostrarMensajeExito("Se registro la calificacion correctamente");
					}
				}
			}
		} catch (AlumnoNoInscriptoException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (NumInscripcionNoExiste exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (YaTieneCalificacion exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (NotaInvalida exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		}
		catch (RemoteException exc) {
			ventana.mostrarMensajeError(exc.getMessage());
		}
	}


}