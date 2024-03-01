package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import CapaGrafica.VentananRegistroResultado;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.*;

public class ControladorRegistrarResultado {
private VentananRegistroResultado ventana;
private IFachada fachada;

	public ControladorRegistrarResultado(VentananRegistroResultado ven) {
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
	
	public void registrarCalificacion(long ced, int cal, int num){
		try {
				fachada.registrarCalificacion(ced, cal, num);
		        ventana.mostrarMensajeExito("Se registro la calificacion correctamente");
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