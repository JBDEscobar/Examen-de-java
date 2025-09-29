package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import control.ControladorTareas;
import modulos.Tarea;

public class TareasPanel extends JPanel {
    private ControladorTareas controlador;
    
    public TareasPanel(ControladorTareas controlador) {
        this.controlador = controlador;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        mostrarTareas();
    }
    
    public void mostrarTareas() {
        removeAll();
        
        int indice = 0;
        for (Tarea tarea : controlador.obtenerTodasLasTareas()) {
            JPanel panelTarea = new JPanel(new FlowLayout(FlowLayout.LEFT));
            
            
            if (tarea.isCompletada()) {
                panelTarea.setBackground(Color.GREEN);
            } else {
                panelTarea.setBackground(Color.WHITE);
            }
            
            JLabel labelTarea = new JLabel(tarea.getTitulo());
            panelTarea.add(labelTarea);
            
          
            if (!tarea.isCompletada()) {
                JButton btnCompletar = new JButton("Marcar como hecha");
                int indiceActual = indice;
                btnCompletar.addActionListener(e -> {
                    controlador.completarTarea(indiceActual);
                    mostrarTareas();
                });
                panelTarea.add(btnCompletar);
            }
            
            JButton btnEliminar = new JButton("Eliminar");
            int indiceActual = indice;
            btnEliminar.addActionListener(e -> {
                controlador.eliminarTarea(indiceActual);
                mostrarTareas();
            });
            
            panelTarea.add(btnEliminar);
            add(panelTarea);
            
            indice++;
        }
        
        revalidate();
        repaint();
    }
}