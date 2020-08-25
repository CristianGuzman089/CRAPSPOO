
package craps;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class GUIInicio extends JFrame implements ActionListener{
    JPanel panel;
    JLabel label;
    JButton iniciar;
    JButton agregar;  
    
    public GUIInicio(){
        this.setSize(250,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("REGISTRO");
        
        iniciarComponentes();
        
        this.setVisible(true);  
    }
    private void iniciarComponentes(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.RED);
        
        label = new JLabel("CRAPS");
        label.setBounds(100, 10, 150, 30);
        panel.add(label);
        
        iniciar = new JButton("iniciar");
        iniciar.setBounds(75, 50, 90, 30);
        panel.add(iniciar);
        iniciar.setActionCommand("iniciar");
        iniciar.addActionListener(this);
        
        agregar = new JButton("agregar");
        agregar.setBounds(75, 100, 90, 30);
        panel.add(agregar);
        agregar.setActionCommand("agregar");
        agregar.addActionListener(this);      
        
    }
    
    
  
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("agregar")){
            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
            new ArchivoJugador(new Jugador(nombre, 200));
        }
        if(e.getActionCommand().equals("iniciar")){
            GUIPartida p = new GUIPartida();
            p.setVisible(true);
            this.dispose();
        }
    }
}
