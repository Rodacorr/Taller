package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaRegistrarAsignatura;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.AsignaturaYaExisteException;
import CapaLogica.Exceptions.AsignaturasCompletaException;
import CapaLogica.VO.voAsignatura;

public class ControladorRegistrarAsignatura {
	private VentanaRegistrarAsignatura ventana;
	private IFachada fachada;

	public ControladorRegistrarAsignatura(VentanaRegistrarAsignatura ven) {
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

	public void registrarAsignatura (String codigo, String nombre, String descripcion)
	{
		try {
			if (codigo.isEmpty()) {
				ventana.mostrarMensajeError("El campo codigo no puede estar vacío");
			}
			else {
				if (nombre.isEmpty()) {
					ventana.mostrarMensajeError("El campo nombre no puede estar vacío");
				}
				else {
					if (descripcion.isEmpty()) {
						ventana.mostrarMensajeError("El campo descripcion no puede estar vacío");
					}
					else {
						voAsignatura asignatura = new voAsignatura(codigo, nombre, descripcion);
						fachada.registrarAsignatura(asignatura);
						ventana.mostrarMensajeExito("asignatura registrada correctamente.");
					}
				}
			}
		} catch (AsignaturasCompletaException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
			ventana.cerrarVentana();
		} catch (AsignaturaYaExisteException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError(exc.getMessage());
		}
	}


}
