package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

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

		public ControladorPrincipal(VentanaPrincipal ven) {
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
