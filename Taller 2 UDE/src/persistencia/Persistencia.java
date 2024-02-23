package persistencia;
import persistencia.exceptions.*;

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

	public void respaldar(String nomArch, voPersistencia vo) throws PersistenciaException{
		try {
			// Abro el archivo 
			FileOutputStream f = new FileOutputStream(nomArch);
			ObjectOutputStream o = new ObjectOutputStream(f);
					
			o.writeObject (vo);
			o.close();
			f.close();
		}catch (IOException e) {
			throw new PersistenciaException("Error respaldar");
		}
	}
	
	public voPersistencia recuperar (String nomArch) throws PersistenciaException{
		try {
			//Abro el archivo 
			FileInputStream f = new FileInputStream(nomArch);
			ObjectInputStream o = new ObjectInputStream(f);
	
			voPersistencia voP = (voPersistencia) o.readObject();
			o.close();
			f.close();
			return voP;
		}catch (ClassNotFoundException e) {
			throw new PersistenciaException("Error respaldar");
			
		}catch (IOException e) {
			throw new PersistenciaException("Error respaldar");
		}
	}
}
