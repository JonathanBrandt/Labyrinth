/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Levels;



/**
 *
 * @author Jonathan
 */
public class Level1 {
    
    public Level1(){
        
        Labels labels = Fenster.getLabels();
        labels.setImageToFigurWeg(0, 0);
        
        Steuerung steuerung = labels.getSteuerung();
        steuerung.setIntToWegFigur(0, 0);
    }
}
