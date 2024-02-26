package Cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import CapaLogica.IFachada;
import CapaLogica.Exceptions.DicAsignaturasVacioException;

public class MainCliente {

	public MainCliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try
		{ 
			IFachada fachada = (IFachada)
					Naming.lookup("//localhost:1099/fachada");
			fachada.listarAsignaturas();
		}
		catch (MalformedURLException e) { e.printStackTrace(); }
		catch (RemoteException e) { e.printStackTrace(); }
		catch (NotBoundException e) { e.printStackTrace(); } 
		catch (DicAsignaturasVacioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


