/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Levels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;


/**
 *Ist für die Steuerung der Figur zuständig. Die Figur wird mit den Tasten W,A,S und D bewegt.
 * @author Jonathan
 */
public class Steuerung implements KeyListener{
    
    private int x0y0;
    private int x0y1;
    private int x0y2;
    private int x0y3;
    private int x0y4;
    private int x0y5;
    
    private int x1y0;
    private int x1y1;
    private int x1y2;
    private int x1y3;
    private int x1y4;
    private int x1y5;
    
    private int x2y0;
    private int x2y1;
    private int x2y2;
    private int x2y3;
    private int x2y4;
    private int x2y5;
    
    private int x3y0;
    private int x3y1;
    private int x3y2;
    private int x3y3;
    private int x3y4;
    private int x3y5;
    
    private int x4y0;
    private int x4y1;
    private int x4y2;
    private int x4y3;
    private int x4y4;
    private int x4y5;
    
    private int x5y0;
    private int x5y1;
    private int x5y2;
    private int x5y3;
    private int x5y4;
    private int x5y5;
    
    private int x6y0;
    private int x6y1;
    private int x6y2;
    private int x6y3;
    private int x6y4;
    private int x6y5;
    
    private int[][] intArray; //Array indem 2-Dimensional alle ints gespeichert werden
    
    private int[] aktuellePosition; //speichert die X- und Y-Position der aktuellen Position
    
    private final int wand;
    private final int weg;
    private final int eis;
    private final int wegFigur;
    private final int eisFigur;
    private final int ziel;
    
    public Steuerung(){
                
        wand = 0;
        weg = 1;
        eis = 2;
        wegFigur = 3;
        eisFigur = 4;
        ziel = 5;
        
        aktuellePosition = new int[2];
        
        initList();
    
//        setIntToWegFigur(0, 0);
//        setIntToWeg(0, 1);
//        setIntToWeg(0, 2);
//        setIntToWand(0, 3);
//        setIntToWeg(0, 4);
//        setIntToEis(0, 5);
//        
//        setIntToEis(1, 0);
//        setIntToWand(1, 1);
//        setIntToWand(1, 2);
//        setIntToWand(1, 3);
//        setIntToWeg(1, 4);
//        setIntToEis(1, 5);
//        
//        setIntToEis(2, 0);
//        setIntToWeg(2, 1);
//        setIntToEis(2, 2);
//        setIntToWeg(2, 3);
//        setIntToEis(2, 4);
//        setIntToWeg(2, 5);
//        
//        setIntToEis(3, 0);
//        setIntToWeg(3, 1);
//        setIntToWand(3, 2);
//        setIntToWand(3, 3);
//        setIntToWeg(3, 4);
//        setIntToWand(3, 5);
//        
//        setIntToWeg(4, 0);
//        setIntToWeg(4, 1);
//        setIntToWand(4, 2);
//        setIntToWand(4, 3);
//        setIntToWeg(4, 4);
//        setIntToWeg(4, 5);
//        
//        setIntToWand(5, 0);
//        setIntToEis(5, 1);
//        setIntToEis(5, 2);
//        setIntToWeg(5, 3);
//        setIntToWand(5, 4);
//        setIntToEis(5, 5);
//        
//        setIntToWeg(6, 0);
//        setIntToWeg(6, 1);
//        setIntToWeg(6, 2);
//        setIntToWand(6, 3);
//        setIntToZiel(6, 4);
//        setIntToEis(6, 5);
//        
//        setAktuellePosition(0, 0);
    }
    /**
     * Methode wird ausgeführt, wenn man das Spiel gewonnen hat. 
     * Der KeyListener wird deaktiviert und eine MessageBox popt auf, die einen über der Sieg informiert. 
     * Das Spielfenster wird geschlossen und der Startschirm wird wieder aufgerufen.
     */
    private void gewonnen(){
        
        Fenster.getLabels().disableKeyListener();
        JOptionPane.showMessageDialog(null, "Du hast das Level geschafft!!!", "Gewonnen!!!", PLAIN_MESSAGE, new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\Settingsicon.png"));
        //Fenster schließen und Startschirm öffnen
    }
    
    /**
     * setzt die Position fest, auf der die Figur steht(im Array)
     * @param x legt die Position auf der X-Achse fest
     * @param y legt die Position auf der Y-Achse fest
     */
    public void setAktuellePosition(int x, int y){
        aktuellePosition[0] = x;
        aktuellePosition[1] = y;
    }
    
    /**
     * fügt alle ints in den zugehörigen Array
     */
    private void initList(){
         
        intArray = new int[7][6];
        intArray[0][0] = x0y0; 
        intArray[0][1] = x0y1;
        intArray[0][2] = x0y2;
        intArray[0][3] = x0y3;
        intArray[0][4] = x0y4;
        intArray[0][5] = x0y5;

        intArray[1][0] = x1y0;
        intArray[1][1] = x1y1;
        intArray[1][2] = x1y2;
        intArray[1][3] = x1y3;
        intArray[1][4] = x1y4;
        intArray[1][5] = x1y5;
        
        intArray[2][0] = x2y0;
        intArray[2][1] = x2y1;
        intArray[2][2] = x2y2;
        intArray[2][3] = x2y3;
        intArray[2][4] = x2y4;
        intArray[2][5] = x2y5;    
        
        intArray[3][0] = x3y0;
        intArray[3][1] = x3y1;
        intArray[3][2] = x3y2;
        intArray[3][3] = x3y3;
        intArray[3][4] = x3y4;
        intArray[3][5] = x3y5;  
        
        intArray[4][0] = x4y0;
        intArray[4][1] = x4y1;
        intArray[4][2] = x4y2;
        intArray[4][3] = x4y3;
        intArray[4][4] = x4y4;
        intArray[4][5] = x4y5;
        
        intArray[5][0] = x5y0;
        intArray[5][1] = x5y1;
        intArray[5][2] = x5y2;
        intArray[5][3] = x5y3;
        intArray[5][4] = x5y4;
        intArray[5][5] = x5y5;
        
        intArray[6][0] = x6y0;
        intArray[6][1] = x6y1;
        intArray[6][2] = x6y2;
        intArray[6][3] = x6y3;
        intArray[6][4] = x6y4;
        intArray[6][5] = x6y5;
    }

    /**
     * Stellt den ausgewählten int auf Wand
     * !!!Muss mit dem zugehörigen Level übereinstimmen!!!
     * @param x Die Position auf der der int auf der X-Achse liegt
     * @param y Die Position auf der der int auf der Y-Achse liegt
     */
    public void setIntToWand(int x, int y){
        intArray[x][y] = wand;
    }
    
    /**
     * Stellt den ausgewählten int auf Weg
     * !!!Muss mit dem zugehörigen Level übereinstimmen!!!
     * @param x Die Position auf der der int auf der X-Achse liegt
     * @param y Die Position auf der der int auf der Y-Achse liegt
     */
    public void setIntToWeg(int x, int y){
        intArray[x][y] = weg;
    }
    
    /**
     * Stellt den ausgewählten int auf Eis
     * !!!Muss mit dem zugehörigen Level übereinstimmen!!!
     * @param x Die Position auf der der int auf der X-Achse liegt
     * @param y Die Position auf der der int auf der Y-Achse liegt
     */
    public void setIntToEis(int x, int y){
        intArray[x][y] = eis;
    }

    /**
     * Stellt den ausgewählten int auf wegFigur
     * !!!Muss mit dem zugehörigen Level übereinstimmen!!!
     * @param x Die Position auf der der int auf der X-Achse liegt
     * @param y Die Position auf der der int auf der Y-Achse liegt
     */
    public void setIntToWegFigur(int x, int y){
        intArray[x][y] = wegFigur;
    }
    
    /**
     * Stellt den ausgewählten int auf eisFigur
     * !!!Muss mit dem zugehörigen Level übereinstimmen!!!
     * @param x Die Position auf der der int auf der X-Achse liegt
     * @param y Die Position auf der der int auf der Y-Achse liegt
     */
    public void setIntToEisFigur(int x, int y){
        intArray[x][y] = eisFigur;
    }
    
    /**
     * Stellt den ausgewählten int auf Ziel
     * !!!Muss mit dem zugehörigen Level übereinstimmen!!!
     * @param x Die Position auf der der int auf der X-Achse liegt
     * @param y Die Position auf der der int auf der Y-Achse liegt
     */
    public void setIntToZiel(int x, int y){
        intArray[x][y] = ziel;
    }

    
    /**
     * Prüft, welches Feld unter der aktuellen Position ist. Ist es Eis, Weg oder das Ziel so wird ein Schritt ausgeführt(Labels und ints werden geändert)
     * Läuft man auf Eis, so rutscht man solange weiter, bis man auf eine Wand trifft
     */
    private void untenbewegung(){
        if(intArray[aktuellePosition[0]][aktuellePosition[1]+1] == weg){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0], aktuellePosition[1]+1);
            setIntToWegFigur(aktuellePosition[0], aktuellePosition[1]+1);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[1]++;
        }
        else if(intArray[aktuellePosition[0]][aktuellePosition[1]+1] == ziel){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0], aktuellePosition[1]+1);
            setIntToZiel(aktuellePosition[0], aktuellePosition[1]+1);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[1]++;
            gewonnen();
        }
        else if(intArray[aktuellePosition[0]][aktuellePosition[1]+1] == eis){
            if(intArray[aktuellePosition[0]][aktuellePosition[1]+1] != wand){
                Fenster.getLabels().setImageToFigurEis(aktuellePosition[0], aktuellePosition[1]+1);
                setIntToEisFigur(aktuellePosition[0], aktuellePosition[1]+1);
                if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                    Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                    setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
                }
                else{
                    Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                    setIntToEis(aktuellePosition[0], aktuellePosition[1]);
                }
            aktuellePosition[1]++;
            untenbewegung();
            }
        }
    }
    
    /**
     * Prüft, welches Feld über der aktuellen Position ist. Ist es Eis, Weg oder das Ziel so wird ein Schritt ausgeführt(Labels und ints werden geändert)
     * Läuft man auf Eis, so rutscht man solange weiter, bis man auf eine Wand trifft
     */
    private void hochbewegung(){
        if(intArray[aktuellePosition[0]][aktuellePosition[1]-1] == weg){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0], aktuellePosition[1]-1);
            setIntToWegFigur(aktuellePosition[0], aktuellePosition[1]-1);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[1]--;
        }
        else if(intArray[aktuellePosition[0]][aktuellePosition[1]-1] == ziel){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0], aktuellePosition[1]-1);
            setIntToZiel(aktuellePosition[0], aktuellePosition[1]-1);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[1]--;
            gewonnen();
        }
        else if(intArray[aktuellePosition[0]][aktuellePosition[1]-1] == eis){
            if(intArray[aktuellePosition[0]][aktuellePosition[1]-1] != wand){
                Fenster.getLabels().setImageToFigurEis(aktuellePosition[0], aktuellePosition[1]-1);
                setIntToEisFigur(aktuellePosition[0], aktuellePosition[1]-1);
                if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                    Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                    setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
                }
                else{
                    Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                    setIntToEis(aktuellePosition[0], aktuellePosition[1]);
                }
            aktuellePosition[1]--;
            hochbewegung();
            }
        }
    }
    
    /**
     * Prüft, welches Feld rechts der aktuellen Position ist. Ist es Eis, Weg oder das Ziel so wird ein Schritt ausgeführt(Labels und ints werden geändert)
     * Läuft man auf Eis, so rutscht man solange weiter, bis man auf eine Wand trifft
     */
    private void rechtsbewegung(){
        if(intArray[aktuellePosition[0]+1][aktuellePosition[1]] == weg){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0]+1, aktuellePosition[1]);
            setIntToWegFigur(aktuellePosition[0]+1, aktuellePosition[1]);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[0]++;
        }
        else if(intArray[aktuellePosition[0]+1][aktuellePosition[1]] == ziel){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0]+1, aktuellePosition[1]);
            setIntToZiel(aktuellePosition[0]+1, aktuellePosition[1]);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[0]++;
            gewonnen();
        }
        else if(intArray[aktuellePosition[0]+1][aktuellePosition[1]] == eis){
            if(intArray[aktuellePosition[0]+1][aktuellePosition[1]] != wand){
                Fenster.getLabels().setImageToFigurEis(aktuellePosition[0]+1, aktuellePosition[1]);
                setIntToEisFigur(aktuellePosition[0]+1, aktuellePosition[1]);
                if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                    Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                    setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
                }
                else{
                    Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                    setIntToEis(aktuellePosition[0], aktuellePosition[1]);
                }
            aktuellePosition[0]++;
            rechtsbewegung();
            }
        }
    }
    
    /**
     * Prüft, welches Feld links der aktuellen Position ist. Ist es Eis, Weg oder das Ziel so wird ein Schritt ausgeführt(Labels und ints werden geändert)
     * Läuft man auf Eis, so rutscht man solange weiter, bis man auf eine Wand trifft
     */
    private void linksbewegung(){
        if(intArray[aktuellePosition[0]-1][aktuellePosition[1]] == weg){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0]-1, aktuellePosition[1]);
            setIntToWegFigur(aktuellePosition[0]-1, aktuellePosition[1]);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[0]--;
        }
        else if(intArray[aktuellePosition[0]-1][aktuellePosition[1]] == ziel){
            Fenster.getLabels().setImageToFigurWeg(aktuellePosition[0]-1, aktuellePosition[1]);
            setIntToZiel(aktuellePosition[0]-1, aktuellePosition[1]);
            if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
            }
            else{
                Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                setIntToEis(aktuellePosition[0], aktuellePosition[1]);
            }
            aktuellePosition[0]--;
            gewonnen();
        }
        else if(intArray[aktuellePosition[0]-1][aktuellePosition[1]] == eis){
            if(intArray[aktuellePosition[0]-1][aktuellePosition[1]] != wand){
                Fenster.getLabels().setImageToFigurEis(aktuellePosition[0]-1, aktuellePosition[1]);
                setIntToEisFigur(aktuellePosition[0]-1, aktuellePosition[1]);
                if(intArray[aktuellePosition[0]][aktuellePosition[1]] == wegFigur){
                    Fenster.getLabels().setImageToWeg(aktuellePosition[0], aktuellePosition[1]);
                    setIntToWeg(aktuellePosition[0], aktuellePosition[1]);
                }
                else{
                    Fenster.getLabels().setImageToEis(aktuellePosition[0], aktuellePosition[1]);
                    setIntToEis(aktuellePosition[0], aktuellePosition[1]);
                }
            aktuellePosition[0]--;
            linksbewegung();
            }
        }
    }
    
    /**
     * Wenn W,A,S oder D gedrückt wird, wird die zugehörige Laufmethode aufgerufen.
     * @param e die Taste bzw. Buchstabe der gedrückt wurde
     */
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == 'd'){
            rechtsbewegung();
        }
        else if(e.getKeyChar() == 'a'){
            linksbewegung();
        }
        else if(e.getKeyChar() == 's'){
            untenbewegung();
        }
        else if(e.getKeyChar() == 'w'){
            hochbewegung();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
