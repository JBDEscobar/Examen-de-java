package database;

import modulos.Tarea;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {
    private List<Tarea> baseDatosTareas;
    
    public GestorDatos() {
        this.baseDatosTareas = new ArrayList<>();
    }
    
 
    public void guardarTarea(Tarea tarea) {
        baseDatosTareas.add(tarea);
    }
    
    public List<Tarea> obtenerTodasLasTareas() {
        return baseDatosTareas;
    }
    
    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < baseDatosTareas.size()) {
            baseDatosTareas.remove(indice);
        }
    }
    
    public Tarea obtenerTarea(int indice) {
        if (indice >= 0 && indice < baseDatosTareas.size()) {
            return baseDatosTareas.get(indice);
        }
        return null;
    }
    
    // completadas
    public List<Tarea> obtenerTareasCompletadas() {
        List<Tarea> completadas = new ArrayList<>();
        for (Tarea tarea : baseDatosTareas) {
            if (tarea.isCompletada()) {
                completadas.add(tarea);
            }
        }
        return completadas;
    }
    
    public int obtenerCantidadTareas() {
        return baseDatosTareas.size();
    }
}