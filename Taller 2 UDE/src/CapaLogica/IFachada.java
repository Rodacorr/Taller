package CapaLogica;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import CapaLogica.Exceptions.AlumnoNoInscriptoException;
import CapaLogica.Exceptions.AlumnoYaCursaAsignatura;
import CapaLogica.Exceptions.AlumnoYaExisteExceptions;
import CapaLogica.Exceptions.AsignaturaNoExisteException;
import CapaLogica.Exceptions.AsignaturaYaExisteException;
import CapaLogica.Exceptions.AsignaturasCompletaException;
import CapaLogica.Exceptions.AñoMenorAlUltimoReg;
import CapaLogica.Exceptions.DicAlumnosVacioException;
import CapaLogica.Exceptions.DicAsignaturasVacioException;
import CapaLogica.Exceptions.NotaInvalida;
import CapaLogica.Exceptions.NumInscripcionNoExiste;
import CapaLogica.Exceptions.SecInscripcionesVaciaException;
import CapaLogica.Exceptions.YaTieneCalificacion;
import CapaLogica.VO.voAlumno;
import CapaLogica.VO.voAlumnoCompleto;
import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voAlumnoDatTipo;
import CapaLogica.VO.voAsignatura;
import CapaLogica.VO.voInscripcion;
import persistencia.exceptions.PersistenciaException;

public interface IFachada extends Remote{


public void registrarAsignatura(voAsignatura asig) throws RemoteException, AsignaturaYaExisteException, AsignaturasCompletaException;

public ArrayList<voAsignatura> listarAsignaturas() throws RemoteException, DicAsignaturasVacioException;

public void registarAlumno(voAlumno al) throws RemoteException, AlumnoYaExisteExceptions;

public ArrayList<voAlumnoDatTipo> listarAlumnoApe(String ape) throws RemoteException, DicAlumnosVacioException;

public voAlumnoCompleto listarAlumnoCed(long ced) throws RemoteException, AlumnoNoInscriptoException;

public void registrarInscripcion(String cod, long ced, float mon, int anio) throws RemoteException, AlumnoNoInscriptoException, AsignaturaNoExisteException,AlumnoYaCursaAsignatura,AñoMenorAlUltimoReg;

public void registrarCalificacion(long ced, int cal, int num) throws RemoteException, AlumnoNoInscriptoException, NumInscripcionNoExiste, YaTieneCalificacion, NotaInvalida;

public float montoRecaudado (long ced, int anio) throws RemoteException, AlumnoNoInscriptoException;

public  ArrayList<voInscripcion> listarEscolaridad(long ced, boolean modo) throws RemoteException, AlumnoNoInscriptoException,SecInscripcionesVaciaException;

public  ArrayList<voAlumnoDat> listarEgresados(boolean modo) throws RemoteException, DicAlumnosVacioException;

public void respaldar() throws RemoteException, PersistenciaException;

public void recuperar() throws RemoteException, PersistenciaException;



}