package Servidor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Properties;

import CapaLogica.Fachada;
import CapaLogica.IFachada;
import persistencia.exceptions.PersistenciaException;

public class MainServidor {

	public MainServidor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try
		{ // pongo a correr el rmiregistry
			LocateRegistry.createRegistry(1099);
			// instancio mi Objeto Remoto y lo publico
			IFachada fachada = new Fachada();
			try {
				fachada.recuperar();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String ip = prop.getProperty("ip");
			String puerto = prop.getProperty("puerto");
			System.out.println ("Antes de publicarlo");
			Naming.rebind("//"+ip+":"+puerto+"/fachada", fachada);
			System.out.println ("Luego de publicarlo");
		}
		catch (RemoteException e)
		{ e.printStackTrace(); }
		catch (MalformedURLException e)
		{ e.printStackTrace(); 
		} catch (FileNotFoundException e) 
		// TODO Auto-generated catch block
		{e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
