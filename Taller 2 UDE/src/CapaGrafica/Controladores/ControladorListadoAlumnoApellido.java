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

import CapaGrafica.VentanaListadoAlumnoApellido;
import CapaGrafica.VentanaListadoEgresados;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.AlumnoNoInscriptoException;
import CapaLogica.Exceptions.DicAlumnosVacioException;
import CapaLogica.VO.voAlumnoCompleto;
import CapaLogica.VO.voAlumnoDatTipo;
import CapaLogica.VO.voAsignatura;

public class ControladorListadoAlumnoApellido {
	private VentanaListadoAlumnoApellido ventana;
	private IFachada fachada;

	public ControladorListadoAlumnoApellido(VentanaListadoAlumnoApellido ven) {
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

	public void listarAlumnoApe(String ape) {
		ArrayList<voAlumnoDatTipo> listaAlumnoApe = null; // Inicializamos a null
		try {
			if (ape.isEmpty()) {
				ventana.mostrarMensajeError("El campo apellido no puede estar vacío");
			}
			else {
				listaAlumnoApe = fachada.listarAlumnoApe(ape);
				Object[][] data = new Object [listaAlumnoApe.size()][4];
				int numFila = 0;
				for(voAlumnoDatTipo vo : listaAlumnoApe) {
					Object [] fila = {vo.getNombre(),vo.getApellido(),vo.getCedula(),vo.getTipo()};
					data[numFila] = fila;
					numFila++;
				}
				if(!listaAlumnoApe.isEmpty()){
					ventana.setearDatos(data);
				}
				else {
					ventana.mostrarMensajeError("No hay alumnos con ese apellido/prefijo");
				}
			}
		} catch (DicAlumnosVacioException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError("Error de conexión con el servidor");
		}	  
	}

}
