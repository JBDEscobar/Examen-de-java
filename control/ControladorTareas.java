package control;

import modulos.Tarea;
import database.GestorDatos;
import java.util.List;

public class ControladorTareas {
    private GestorDatos baseDatos;
    
    public ControladorTareas() {
        this.baseDatos = new GestorDatos();
    }
    

    public void agregarTarea(String titulo, String descripcion) {
        Tarea nuevaTarea = new Tarea(titulo, descripcion);
        baseDatos.guardarTarea(nuevaTarea);
    }
    
    public List<Tarea> obtenerTodasLasTareas() {
        return baseDatos.obtenerTodasLasTareas();
    }
    
    public void completarTarea(int indice) {
        Tarea tarea = baseDatos.obtenerTarea(indice);
        if (tarea != null) {
            tarea.marcarCompletada();
        }
    }
    
    public void eliminarTarea(int indice) {
        baseDatos.eliminarTarea(indice);
    }
    
  
    public List<Tarea> obtenerTareasCompletadas() {
        return baseDatos.obtenerTareasCompletadas();
    }
}