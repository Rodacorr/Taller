package CapaGrafica.Controladores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaListadoAsignaturas;
import CapaGrafica.VentanaListadoEscolaridad;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.AlumnoNoInscriptoException;
import CapaLogica.Exceptions.DicAlumnosVacioException;
import CapaLogica.Exceptions.SecInscripcionesVaciaException;
import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voInscripcion;
import CapaLogica.VO.voInscripcionCompleto;
import CapaLogica.VO.voPromedio;

public class ControladorListadoEscolaridad {
	private VentanaListadoEscolaridad ventana;
	private IFachada fachada;

	public ControladorListadoEscolaridad(VentanaListadoEscolaridad ven) {
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

	public void listarEscolaridad(String ced, boolean modo) {
		ArrayList<voInscripcion> listaEscolaridad = null;
		try {
			if (!ced.matches("\\d+")) {
				ventana.mostrarMensajeError("La cedula no tiene formato numerico");
			}
			else {
				if(modo) {
					listaEscolaridad = fachada.listarEscolaridad(Long.parseLong(ced),modo);
					Object[][] data = new Object [listaEscolaridad.size()][5];
					int numFila = 0;
					for(voInscripcion vo : listaEscolaridad) {
						if(vo instanceof voInscripcionCompleto) {
							Object [] fila = {vo.getNumero(),vo.getAsignatura(),vo.getAnioLectivo(),vo.getCalificacion(),String.format("%.2f",(((voInscripcionCompleto) vo).getMonto()))};
							data[numFila] = fila;
							numFila++;
						}
					}
					ventana.setearDatosCompleto(data);
				}
				else {

					listaEscolaridad = fachada.listarEscolaridad(Long.parseLong(ced),modo);
					Object[][] data = new Object [listaEscolaridad.size()][4];
					int numFila = 0;
					for(voInscripcion vo : listaEscolaridad) {
						Object [] fila = {vo.getNumero(),vo.getAsignatura(),vo.getAnioLectivo(),vo.getCalificacion()};
						data[numFila] = fila;
						numFila++;
					}
					ventana.setearDatosParcial(data);
				} 
			}
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError(exc.getMessage());
		} catch (AlumnoNoInscriptoException e) {
			ventana.mostrarMensajeError(e.darMensaje());
		} catch (SecInscripcionesVaciaException e) {
			ventana.mostrarMensajeError(e.darMensaje());
		}
	}


}
