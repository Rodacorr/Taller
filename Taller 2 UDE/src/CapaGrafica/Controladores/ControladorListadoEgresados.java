package CapaGrafica.Controladores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import CapaGrafica.VentanaListadoEgresados;
import CapaGrafica.VentanaRegistrarAlumno;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.DicAlumnosVacioException;
import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voPromedio;

public class ControladorListadoEgresados {
	private VentanaListadoEgresados ventana;
	private IFachada fachada;

	public ControladorListadoEgresados(VentanaListadoEgresados ven) {
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
	
	public void listarEgresados(boolean modo) {
		ArrayList<voAlumnoDat> listaEgresados = null;
		try {
				if(modo) {
				listaEgresados = fachada.listarEgresados(modo);
		        Object[][] data = new Object [listaEgresados.size()][5];
		        int numFila = 0;
		        for(voAlumnoDat vo : listaEgresados) {
		        	if(vo instanceof voPromedio) {
		        	Object [] fila = {vo.getNombre(),vo.getApellido(),vo.getCedula(),((voPromedio) vo).getPromedioAprobacion(),((voPromedio) vo).getPromedioTotal()};
		        	data[numFila] = fila;
		        	numFila++;
		        	}
		        }
		        ventana.setearDatosCompleto(data);
				}
				else {
					listaEgresados = fachada.listarEgresados(modo);
			        Object[][] data = new Object [listaEgresados.size()][3];
			        int numFila = 0;
			        for(voAlumnoDat vo : listaEgresados) {
			        	Object [] fila = {vo.getNombre(),vo.getApellido(),vo.getCedula()};
			        	data[numFila] = fila;
			        	numFila++;
			        	}
			        ventana.setearDatosParcial(data);	
			        }  
	    } catch (RemoteException exc) {
	        ventana.mostrarMensajeError(exc.getMessage());
	    } catch (DicAlumnosVacioException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
