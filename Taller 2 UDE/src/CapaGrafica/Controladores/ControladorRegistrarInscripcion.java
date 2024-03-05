package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaRegistrarInscripcion;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.*;

public class ControladorRegistrarInscripcion {
	private VentanaRegistrarInscripcion ventana;
	private IFachada fachada;

	public ControladorRegistrarInscripcion(VentanaRegistrarInscripcion ven) {
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

	public void registrarInscripcion(String cod, String ced, String mon, String anio){
		try {
			if (cod.isEmpty()) {
				ventana.mostrarMensajeError("El campo codigo no puede estar vacío");
			}
			else {
				if (!ced.matches("\\d+")) {
					ventana.mostrarMensajeError("La cedula no tiene formato numerico");
				}
				else {
					if (!mon.matches("\\d+")) {
						ventana.mostrarMensajeError("El monto no tiene formato numerico");
					}
					else {
						if (!anio.matches("\\d+")) {
							ventana.mostrarMensajeError("El año no tiene formato numerico");
						}
						else {
							fachada.registrarInscripcion(cod,Long.parseLong(ced),Float.parseFloat(mon),Integer.parseInt(anio));
							ventana.mostrarMensajeExito("Se realizo la inscripcion correctamente");
						}
					}
				}
			}
		} catch (AlumnoNoInscriptoException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (AsignaturaNoExisteException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (AlumnoYaCursaAsignatura exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (AñoMenorAlUltimoReg exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		}
		catch (RemoteException exc) {
			ventana.mostrarMensajeError(exc.getMessage());
		}
	}
}
