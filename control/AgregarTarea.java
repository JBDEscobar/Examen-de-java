package control;

import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class AgregarTarea {
    private ControladorTareas controlador;
    
    public AgregarTarea(ControladorTareas controlador) {
        this.controlador = controlador;
    }
    
    public void agregarTareaDesdeCampo(JTextField campoTexto) {
        String texto = campoTexto.getText().trim();
        
        if (!texto.isEmpty()) {
            controlador.agregarTarea(texto, "Tarea personal");
            campoTexto.setText("");
            JOptionPane.showMessageDialog(null, "Tarea agregada: " + texto);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Escribe una tarea");
        }
    }
}