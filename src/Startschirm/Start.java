package Startschirm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Startschirm.Startschirm;

/**
 *
 * @author Jonathan
 */
public class Start {
    
    private static Startschirm startschirm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        startschirm = new Startschirm();
    }
    
    public static Startschirm getStartschirm(){
        return startschirm;
    }
    
}
