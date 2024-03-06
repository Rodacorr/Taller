package Cliente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Properties;
import CapaGrafica.VentanaPrincipal;
import CapaLogica.IFachada;
import CapaLogica.Exceptions.*;
import CapaLogica.VO.*;
import persistencia.exceptions.PersistenciaException;

public class MainCliente {

	public MainCliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try
		{ 
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String ip = prop.getProperty("ip");
			String puerto = prop.getProperty("puerto");
			IFachada fachada = (IFachada)
					Naming.lookup("//"+ip+":"+puerto+"/fachada");

			VentanaPrincipal ventana = new VentanaPrincipal();
			ventana.setVisible(true);

		}
		catch (MalformedURLException e) { e.printStackTrace(); }
		catch (RemoteException e) { e.printStackTrace(); }
		catch (NotBoundException e) { e.printStackTrace(); } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


