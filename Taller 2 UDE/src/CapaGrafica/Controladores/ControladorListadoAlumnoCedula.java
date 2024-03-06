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
				String mensaje = ""; 

				mensaje = "Cedula: " + alumno.getCedula() + "\n" +
						"Nombre: " + alumno.getNombre() + "\n" +
						"Apellido: " + alumno.getApellido() + "\n" +
						"Cantidad de asignaturas aprobadas: " + alumno.getCantAsigAprob() + "\n" +
						"Domicilio: " + alumno.getDomicilio() + "\n" +
						"Telefono: " + alumno.getTelefono();
				if(alumno instanceof voBecadoDatCom) {	
					String mensaje2 = "Tipo: Becado \n" +
							"PorcentajeBeca: "  +((voBecadoDatCom)alumno).getPorcentajeBeca() + "\n" +
							"Razon: " + ((voBecadoDatCom)alumno).getRazon();
					ventana.setearDatosEnTextArea(mensaje+ "\n" +mensaje2);
				}
				else {
					ventana.setearDatosEnTextArea(mensaje+"\n"+"Tipo: Alumno");
				}
			}
		} catch (AlumnoNoInscriptoException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError("Error de conexión con el servidor");
		}	  
	}


}
