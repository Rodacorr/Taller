package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

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