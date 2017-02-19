/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Levels;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class Fenster extends JFrame{
    
    private static Labels labels;
    
    public Fenster(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1050, 928);
        setResizable(false);
        setVisible(true);
        setTitle("Labyrinth - Level 1");
        
        labels = new Labels();
        
        add(labels);
    }
    
    public void setPanel(JPanel panel){
        removeAll();
        add(panel);
        panel.setVisible(true);
    }
    
    public static Labels getLabels(){
        return labels;
    }
}
