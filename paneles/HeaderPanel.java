package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;

public class HeaderPanel extends JPanel {
    private JButton btnVerCompletadas;
    
    public HeaderPanel() {
        configurarPanel();
    }
    
    private void configurarPanel() {
        setLayout(new FlowLayout());
        setBackground(new Color(70, 130, 180));
        
        JLabel titulo = new JLabel("Gestor de Tareas");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        add(titulo);
        
        
        btnVerCompletadas = new JButton("completadas");
        btnVerCompletadas.setBackground(Color.ORANGE);
        btnVerCompletadas.setForeground(Color.BLACK);
        add(btnVerCompletadas);
    }
    
    public JButton getBtnVerCompletadas() {
        return btnVerCompletadas;
    }
}