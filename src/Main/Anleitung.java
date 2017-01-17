/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JFrame;

/**
 *
 * @author Jonathan
 */
public class Anleitung{
    
    private JFrame anleitungFenster;
    
    
    public Anleitung(){
        anleitungFenster = new JFrame();
        
        frameInit();
        anleitungFenster.setVisible(true);
    }
    
    private void frameInit(){
        anleitungFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anleitungFenster.setLayout(null);
        anleitungFenster.setSize(1050, 900);
        anleitungFenster.setResizable(false);
        
    }
}
