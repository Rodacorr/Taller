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
import CapaGrafica.VentanaRegistrarAsignatura;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.AsignaturaYaExisteException;
import CapaLogica.Exceptions.AsignaturasCompletaException;
import CapaLogica.Exceptions.DicAsignaturasVacioException;
import CapaLogica.VO.voAsignatura;

public class ControladorListadoAsignaturas {

	private VentanaListadoAsignaturas ventana;
	private IFachada fachada;

	public ControladorListadoAsignaturas(VentanaListadoAsignaturas ven) {
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


	public void listarAsignaturas() {
		ArrayList<voAsignatura> listaAsignaturas = null; // Inicializamos a null
		try {
			listaAsignaturas = fachada.listarAsignaturas();
			Object[][] data = new Object [listaAsignaturas.size()][3];
			int numFila = 0;
			for(voAsignatura vo : listaAsignaturas) {
				Object [] fila = {vo.getCodigo(),vo.getNombre(),vo.getDescripcion()};
				data[numFila] = fila;
				numFila++;
			}
			ventana.setearDatos(data);
			ventana.setVisible(true);
		} catch (DicAsignaturasVacioException exc) {
			ventana.mostrarMensajeError(exc.darMensaje());
		} catch (RemoteException exc) {
			ventana.mostrarMensajeError(exc.getMessage());
		}

	}
}
