package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaRegistrarAlumno;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.AlumnoNoInscriptoException;
import CapaLogica.Exceptions.AlumnoYaExisteExceptions;
import CapaLogica.Exceptions.AsignaturaYaExisteException;
import CapaLogica.Exceptions.AsignaturasCompletaException;
import CapaLogica.Inscripciones.Inscripciones;
import CapaLogica.VO.voAlumno;

public class ControladorRegistrarAlumno {

	private VentanaRegistrarAlumno ventana;
	private IFachada fachada;

	public ControladorRegistrarAlumno(VentanaRegistrarAlumno ven) {
		this.ventana = ven;
		try {
			fachada=(IFachada)
					Naming.lookup("//localhost:1099/fachada");	
		}catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
			e.printStackTrace();
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
			e.printStackTrace();
		} catch (NotBoundException e) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con el servidor");
		}
	}
	public void registrarAlumno(long cedula,String nombre,	String apellido,String domicilio,long telefono) {
		try {
			voAlumno alumno = new voAlumno(cedula,nombre,apellido,domicilio,telefono);
			fachada.registarAlumno(alumno);
			ventana.mostrarMensajeExito("Alumno ingresado correctamente.");
		}
		 catch (AlumnoYaExisteExceptions exc) {
        	ventana.mostrarMensajeError(exc.darMensaje());
        } catch (RemoteException exc) {
        	ventana.mostrarMensajeError(exc.getMessage());
        }
	}

}

	
