/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startschirm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class Einstellungen extends JPanel{
    
    private JButton zurueckKnopf;
    
    
    public Einstellungen(){
        
        initComponents();
        initPanel();
        
    }
    
    private void initPanel(){
        setSize(1050, 600);
        setLayout(null);
        setBackground(Color.WHITE);
        
        Start.getStartschirm().setTitel("Einstellungen");
        
        add(zurueckKnopf);
        zurueckKnopf.setVisible(true);
    }
    
    private void initComponents(){
        zurueckKnopf = new JButton("< Zurück"); 
        zurueckKnopf.setSize(100, 30);
        zurueckKnopf.setLocation(910, 510);
        zurueckKnopf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Start.getStartschirm().setStartfensterPanelToStartmenue();
            }
        });
    }
    
}
