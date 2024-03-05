package Servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

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
			System.out.println ("Antes de publicarlo");
			Naming.rebind("//localhost:1099/fachada", fachada);
			System.out.println ("Luego de publicarlo");
		}
		catch (RemoteException e)
		{ e.printStackTrace(); }
		catch (MalformedURLException e)
		{ e.printStackTrace(); }

	}

}
