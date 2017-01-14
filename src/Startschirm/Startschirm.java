/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startschirm;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jonathan
 */
public class Startschirm {
    
    private JFrame startschirm;
    private JButton startknopf;
    private JButton einstellungenknopf;
    private JLabel startbild;
    
    /**
     * Erstellt das Fester und die Objekte darauf.
     * Ruft initOjects und initScreen auf
     **/
    public Startschirm(){
        startschirm = new JFrame("Labyrith - Startmenü"); // Titel muss noch verbessert werden
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
        
        //einstellungenknopf.setIcon(Icon);  Icon muss Bild von "Einstellungsrad" sein
        einstellungenknopf.setSize(50, 50);
        einstellungenknopf.setLocation(975, 25);
        
        //Bild oder GIF muss in Label gespeichert werden
        startbild.setSize(550, 200);//muss an Bild oder GIF angepasst werden(sollte aber  in ungefähr der Dimension bleiben)
        startbild.setLocation(250, 100);
    }
    
    private void initScreen(){
        startschirm.setLayout(null);
        startschirm.setSize(1050, 600);
        startschirm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startschirm.setResizable(false);
        
        startschirm.add(startknopf);
        startschirm.add(startbild);
        startschirm.add(einstellungenknopf);
        startschirm.setVisible(true);
    }
    
    //actionListener für Einstellungen
    
    //actionListener für Start
    
    
    
}
