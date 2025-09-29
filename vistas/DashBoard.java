package vistas;
import javax.swing.JFrame;
import control.ControladorTareas;
import control.AgregarTarea;
import paneles.HeaderPanel;
import paneles.TareasPanel;
import paneles.AgregarPanel;
import java.awt.BorderLayout;

public class DashBoard extends JFrame {
    private ControladorTareas controlador;
    private TareasPanel tareasPanel;
    private AgregarTarea controlAgregar;
    private HeaderPanel headerPanel;
    
    public DashBoard() {
        controlador = new ControladorTareas();
        tareasPanel = new TareasPanel(controlador);
        controlAgregar = new AgregarTarea(controlador);
        configurarVentana();
        agregarComponentes();
        configurarEventos();
    }
    
    private void configurarVentana() {
        setTitle("Mi Gestor de Tareas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setVisible(true);
    }
    
    private void agregarComponentes() {
        headerPanel = new HeaderPanel();
        add(headerPanel, BorderLayout.NORTH);
        
        add(tareasPanel, BorderLayout.CENTER);
        
        AgregarPanel agregarPanel = new AgregarPanel(controlAgregar, tareasPanel);
        add(agregarPanel, BorderLayout.SOUTH);
    }
    
    private void configurarEventos() {
    
        headerPanel.getBtnVerCompletadas().addActionListener(e -> {
           int completadas = controlador.obtenerTareasCompletadas().size();
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Tareas completadas: " + completadas);
        });
    }
    
}