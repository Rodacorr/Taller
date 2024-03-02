package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

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

	public void listarAlumnoApe(String ape) {
			ArrayList<voAlumnoDatTipo> listaAlumnoApe = null; // Inicializamos a null
			try {
				listaAlumnoApe = fachada.listarAlumnoApe(ape);
				Object[][] data = new Object [listaAlumnoApe.size()][4];
				int numFila = 0;
				for(voAlumnoDatTipo vo : listaAlumnoApe) {
					Object [] fila = {vo.getNombre(),vo.getApellido(),vo.getCedula(),vo.getTipo()};
					data[numFila] = fila;
					numFila++;
				}
				ventana.setearDatos(data);
			} catch (DicAlumnosVacioException exc) {
				ventana.mostrarMensajeError(exc.darMensaje());
			} catch (RemoteException exc) {
				ventana.mostrarMensajeError("Error de conexión con el servidor");
			}	  
		}

	}
