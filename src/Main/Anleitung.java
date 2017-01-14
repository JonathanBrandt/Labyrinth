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
public class Anleitung {
    JFrame anleitung;
    
    
    public Anleitung(){
        JFrame anleitung = new JFrame();
        
        frameInit();
        anleitung.setVisible(true);
    }
    
    private void frameInit(){
        anleitung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anleitung.setLayout(null);
        anleitung.setSize(1050, 900);
        anleitung.setResizable(false);
        
    }
}
