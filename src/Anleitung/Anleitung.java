/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anleitung;

import Levels.Fenster;
import Startschirm.Start;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class Anleitung extends JPanel{
        
    private JButton weiter;
    private static Fenster fenster;
    
    public Anleitung(){
        
        initComponents();
        initPanel();
    }
    
    private void initPanel(){
        setLayout(null);
        setSize(1050, 600);
        Start.getStartschirm().setTitel("Anleitung");
        
        add(weiter);
        weiter.setVisible(true);
        
        setVisible(true);
        
    }
    
    private void initComponents(){
        
        
        
        weiter = new JButton("Weiter >"); 
        weiter.setSize(100, 30);
        weiter.setLocation(910, 510);
        weiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fenster = new Fenster();
                Start.getStartschirm().setVisible(false);
            }
        });
    }
 
    public static Fenster getFenster(){
        return fenster;
    }
}
