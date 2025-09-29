package modulos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean completada;
    private String fechaCreacion;
    
    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
        this.fechaCreacion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
    
    public String getTitulo() {
         return titulo; }
    public String getDescripcion() {
         return descripcion; }
    public boolean isCompletada() { 
        return completada; }
    public String getFechaCreacion() {
         return fechaCreacion; }
    
    public void marcarCompletada() {
        this.completada = true;
    }
}