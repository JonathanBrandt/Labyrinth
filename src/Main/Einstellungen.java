/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Jonathan
 */
public class Einstellungen {
    
    private JPanel einstellungen;
    private JLabel test;
    
    public Einstellungen(){
        einstellungen = new JPanel();
        test = new JLabel("Einstellungen");
        
        //initComponents();
        initPanel();
        
        einstellungen.setVisible(true);
        //das objekt "einstellungen".setStartfensterPanel(einstellungen);
    }
    
    private void initPanel(){
        einstellungen.setSize(1050, 600);
        einstellungen.setLayout(null);
    }
    
    private void initComponents(){
        einstellungen.add(test);
    }
    
}
