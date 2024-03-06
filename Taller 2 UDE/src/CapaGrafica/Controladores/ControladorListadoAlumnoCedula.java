package CapaGrafica.Controladores;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import CapaGrafica.VentanaListadoAlumnoApellido;
import CapaGrafica.VentanaListadoAlumnoCedula;
import CapaLogica.IFachada;
import CapaLogica.Alumnos.Becado;
import CapaLogica.Exceptions.AlumnoNoInscriptoException;
import CapaLogica.Exceptions.DicAsignaturasVacioException;
import CapaLogica.VO.voAlumnoCompleto;
import CapaLogica.VO.voAlumnoDatTipo;
import CapaLogica.VO.voAsignatura;
import CapaLogica.VO.voBecadoDatCom;

public class ControladorListadoAlumnoCedula {
	private VentanaListadoAlumnoCedula ventana;
	private IFachada fachada;

	public ControladorListadoAlumnoCedula(VentanaListadoAlumnoCedula ven) {
		this.ventana = ven;
		try {
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String ip = prop.getProperty("ip");
			String puerto = prop.getProperty("puerto");
			fachada = (IFachada)
					Naming.lookup("//"+ip+":"+puerto+"/fachada");

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

	public void listarAlumnoCed(String ced) {
		try {
			if (!ced.matches("\\d+")) {
				ventana.mostrarMensajeError("La cedula no tiene formato numerico");
			}
			else {
				voAlumnoCompleto alumno = fachada.listarAlumnoCed(Long.parseLong(ced));
				String cedula = String.valueOf(alumno.getCedula());
				String nombre = alumno.getNombre();
				String apellido = alumno.getApellido();
				String cantAsigAprob = String.valueOf(alumno.getCantAsigAprob());
				String domicilio = alumno.getDomicilio();
				String Telefono = String.valueOf(alumno.getTelefono());
				String tipoAl = "Alumno";
				if(alumno instanceof voBecadoDatCom) {	
					String tipoBec = "Becado";
					String porceBeca = String.valueOf(((voBecadoDatCom)alumno).getPorcentajeBeca());
					String razon = ((voBecadoDatCom)alumno).getRazon();
					ventana.setearDatosBecado(cedula, nombre, apellido, cantAsigAprob, domicilio, Telefono, tipoBec, porceBeca, razon);
				}
				else {
					ventana.setearDatosAlumno(cedula, nombre, apellido, cantAsigAprob, domicilio, Telefono, tipoAl);



				}
			}
		} catch (AlumnoNoInscriptoException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError("Error de conexión con el servidor");
		}	  
	}


}
