package Startschirm;

import Anleitung.Anleitung;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class Startschirm extends JFrame{
    
    private JPanel startmenue;
    private JButton startknopf;
    private JButton einstellungenknopf;
    private JLabel startbild;
    private Einstellungen einstellungen;
    
    /**
     * Erstellt das Fester und die Objekte darauf.
     * Ruft initOjects und initScreen auf
     **/
    public Startschirm(){
        startmenue = new JPanel();
        startbild = new JLabel();
        startknopf = new JButton();
        einstellungenknopf = new JButton();
                
        initObjects();
        initScreen();
    }
    
    /**
     * alle Objekte auf dem Startschirm werden initialisiert.
     */
    private void initObjects(){
        startknopf.setText("Start");
        startknopf.setSize(300, 100);
        startknopf.setLocation(410, 420);
        startknopf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startmenue.setVisible(false);
                Anleitung anleitung = new Anleitung();
                add(anleitung);
                anleitung.setVisible(true);
            }
        });
        
        einstellungenknopf.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\Settingsicon.png"));  
        einstellungenknopf.setSize(50, 50);
        einstellungenknopf.setLocation(975, 25);
        einstellungenknopf.setBorderPainted(false);
        einstellungenknopf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startmenue.setVisible(false);
                einstellungen = new Einstellungen();
                add(einstellungen);          
                einstellungen.setVisible(true);
            }
        });
        
        startbild.setSize(600, 218);
        startbild.setLocation(250, 140);
        startbild.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\Startbild.png"));
    }
    
    /**
     * legt die Größe etc. vom Fenster fest. 
     * Alle Objekte werden zu dem Fenster hinzugefügt.
     */
    private void initScreen(){
        setLayout(null);
        setSize(1050, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Labyrinth - Start");
        
        startmenue.setSize(1050, 600);
        startmenue.setLayout(null);
        
        startmenue.add(startknopf);
        startmenue.add(startbild);
        startmenue.add(einstellungenknopf);
        startmenue.setBackground(Color.WHITE);
        startmenue.setVisible(true);
        
        add(startmenue);
        setVisible(true);
    }
    /**
     * Diese Methode fügt ein Panel auf das Fenster und macht es sichtbar.
     * @param panel Das Panel, welche angezeigt werden soll.
     */
    public void setStartfensterPanel(JPanel panel){
        add(panel);
        panel.setVisible(true);
    }
    /**
     * Das Einstellungen-Panel wird unsichtbar gemacht und das Startmenü wird sichtbar
     */
    public void setStartfensterPanelToStartmenue(){
        einstellungen.setVisible(false);
        add(startmenue);
        startmenue.setVisible(true);
    }
    
    /**
     * legt den Titel des Fensters fest
     * @param titel der Titel welches hinter "Labyrinth - " stehen soll
     */
    public void setTitel(String titel){
        setTitle("Labyrinth - " + titel);
    }
    
}
