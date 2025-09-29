package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import control.AgregarTarea;

public class AgregarPanel extends JPanel {
    private JTextField campoTexto;
    private JButton btnAgregar;
    
    public AgregarPanel(AgregarTarea controlAgregar, TareasPanel tareasPanel) {
        configurarPanel();
        configurarEventos(controlAgregar, tareasPanel);
    }
    
    private void configurarPanel() {
        setLayout(new FlowLayout());
        
        JLabel etiqueta = new JLabel("Agregar tarea:");
        campoTexto = new JTextField(15);
        btnAgregar = new JButton("Agregar");
        
        add(etiqueta);
        add(campoTexto);
        add(btnAgregar);
    }
    
    private void configurarEventos(AgregarTarea controlAgregar, TareasPanel tareasPanel) {
        btnAgregar.addActionListener(e -> {
            controlAgregar.agregarTareaDesdeCampo(campoTexto);
            tareasPanel.mostrarTareas(); 
        });
    }
}