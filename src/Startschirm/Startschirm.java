/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startschirm;

import Main.Anleitung;
import Main.Einstellungen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class Startschirm {
    
    private JFrame startfenster;
    private JPanel startmenue;
    private JButton startknopf;
    private JButton einstellungenknopf;
    private JLabel startbild;
    
    /**
     * Erstellt das Fester und die Objekte darauf.
     * Ruft initOjects und initScreen auf
     **/
    public Startschirm(){
        startfenster = new JFrame("Labyrith - Startmenü"); // Titel muss noch verbessert werden
        startmenue = new JPanel();
        startbild = new JLabel();
        startknopf = new JButton();
        einstellungenknopf = new JButton();
                
        initObjects();
        initScreen();
    }
    
    private void initObjects(){
        startknopf.setText("Start");
        startknopf.setSize(300, 100);
        startknopf.setLocation(400, 400);
        startknopf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startfenster.setVisible(false);
                Anleitung anleitung = new Anleitung();
            }
        });
        
        //einstellungenknopf.setIcon(Icon);  Icon muss Bild von "Einstellungsrad" sein
        einstellungenknopf.setSize(50, 50);
        einstellungenknopf.setLocation(975, 25);
        einstellungenknopf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startmenue.setVisible(false);
                Einstellungen einstellungen = new Einstellungen();
            }
        });
        
        //Bild oder GIF muss in Label gespeichert werden
        startbild.setSize(550, 200);//muss an Bild oder GIF angepasst werden(sollte aber  in ungefähr der Dimension bleiben)
        startbild.setLocation(250, 100);
    }
    
    private void initScreen(){
        startfenster.setLayout(null);
        startfenster.setSize(1050, 600);
        startfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startfenster.setResizable(false);
        
        startmenue.setSize(1050, 600);
        startmenue.setLayout(null);
        
        startmenue.add(startknopf);
        startmenue.add(startbild);
        startmenue.add(einstellungenknopf);
        startmenue.setVisible(true);
        startfenster.add(startmenue);
        startfenster.setVisible(true);
    }
    
    public void setStartfensterPanel(JPanel panel){
        startfenster.add(panel);
        panel.setVisible(true);        
    }
    
    
    
}
