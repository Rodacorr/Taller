package persistencia;

import generalUtils.FilePropertyReadUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import persistencia.exceptions.PersistenciaException;


public class Persistencia {
	private String propertyName =""; //setear ruta

	public void respaldar( /*posible archivo de Vopersistencia ?? */) throws PersistenciaException{
		try {
			// Abro el archivo 
			FileOutputStream f = new FileOutputStream(readUtil.leerPropertyMensaje(propertyName, readUtil.getFileAplicationToRead()));
			ObjectOutputStream o = new ObjectOutputStream(f);
					
			o.writeObject ();
			o.close();
			f.close();
		}catch (IOException e) {
			e.printStactTrace();
			throw new PersitenciaException("Error respaldar");
		}
	}
	
	public /*tengo que devovler algo, posible VoPersistencia*/ recuperar () throws PersistenciaException{//devuelvo un arhivo
		try {
			
			FilePropertyReadUtil readUtil = new FilePropertyReadUtil();
			
			//Abro el archivo 
			FileInputStream f = new FileInputStream(readUtil.leerPropertyMensaje(propertyName, readUtil.getFileAplicationToRead()));
			f.available();
			
			File file = new File(readUtil.leerPropertyMensaje(propertyName, readUtil.getFileAplicationToRead()));
	
			if(file.length() > 0)
			{
				ObjectInputStream o = new ObjectInputStream(f);
				//Leo el arreglo
				o.readObject();
	
				o.close();
			}
			f.close();
			return pVO;
			
		}catch (IOException e) {
			e.printStactTrace();
			throw new PersitenciaException("Error respaldar");
		}
	}
}
