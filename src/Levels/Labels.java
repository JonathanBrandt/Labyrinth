package Levels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *Die Klasse legt die einzelnen Labels fest, welche die Felder repräsentieren
 * @author Jonathan
 */
public class Labels extends JPanel{
    
    private static Steuerung steuerung;
    
    private JLabel x0y0;
    private JLabel x0y1;
    private JLabel x0y2;
    private JLabel x0y3;
    private JLabel x0y4;
    private JLabel x0y5;
    
    private JLabel x1y0;
    private JLabel x1y1;
    private JLabel x1y2;
    private JLabel x1y3;
    private JLabel x1y4;
    private JLabel x1y5;
    
    private JLabel x2y0;
    private JLabel x2y1;
    private JLabel x2y2;
    private JLabel x2y3;
    private JLabel x2y4;
    private JLabel x2y5;
    
    private JLabel x3y0;
    private JLabel x3y1;
    private JLabel x3y2;
    private JLabel x3y3;
    private JLabel x3y4;
    private JLabel x3y5;
    
    private JLabel x4y0;
    private JLabel x4y1;
    private JLabel x4y2;
    private JLabel x4y3;
    private JLabel x4y4;
    private JLabel x4y5;
    
    private JLabel x5y0;
    private JLabel x5y1;
    private JLabel x5y2;
    private JLabel x5y3;
    private JLabel x5y4;
    private JLabel x5y5;
    
    private JLabel x6y0;
    private JLabel x6y1;
    private JLabel x6y2;
    private JLabel x6y3;
    private JLabel x6y4;
    private JLabel x6y5;
    
    private JLabel[][] labelArray; //Array indem 2-Dimensional alle Labels gespeichert werden
    
    /**
     *
     */
    public Labels(){

        initPanel();
        deklComponents();
        initLists();
        sizeComponents();
        locateLabels();
        
//        setImageToFigurWeg(0, 0);
//        setImageToEis(1, 0);
//        setImageToEis(2, 0);
//        setImageToEis(3, 0);
//        setImageToWeg(4, 0);
//        setImageToWand(5, 0);
//        setImageToWeg(6, 0);
//        
//        setImageToWeg(0, 1);
//        setImageToWand(1, 1);
//        setImageToWeg(2, 1);
//        setImageToWeg(3, 1);
//        setImageToWeg(4, 1);
//        setImageToEis(5, 1);
//        setImageToWeg(6, 1);
//        
//        setImageToWeg(0, 2);
//        setImageToWand(1, 2);
//        setImageToEis(2, 2);
//        setImageToWand(3, 2);
//        setImageToWand(4, 2);
//        setImageToEis(5, 2);
//        setImageToWeg(6, 2);
//        
//        setImageToWand(0, 3);
//        setImageToWand(1, 3);
//        setImageToWeg(2, 3);
//        setImageToWand(3, 3);
//        setImageToWand(4, 3);
//        setImageToWeg(5, 3);
//        setImageToWand(6, 3);
//        
//        setImageToWeg(0, 4);
//        setImageToWeg(1, 4);
//        setImageToEis(2, 4);
//        setImageToWeg(3, 4);
//        setImageToWeg(4, 4);
//        setImageToWand(5, 4);
//        setImageToZiel(6, 4);
//        
//        setImageToEis(0, 5);
//        setImageToEis(1, 5);
//        setImageToWeg(2, 5);
//        setImageToWand(3, 5);
//        setImageToWeg(4, 5);
//        setImageToEis(5, 5);
//        setImageToEis(6, 5);
        
        
        setFocusable(true);
        
        steuerung = new Steuerung();
        addKeyListener(steuerung);
        
        Level1 level = new Level1();
    }
    
    public void disableKeyListener(){
        removeKeyListener(steuerung);
    }
    
    /**
     * legt größe vom Panel fest und macht es sichtbar
     */
    private void initPanel(){
            
        setLayout(null);
        setSize(1050, 900);
        setVisible(true);
                
    }
    
    /**
     *  deklariert alle Labels
    */
    private void deklComponents(){
        
        x0y0 = new JLabel("0.0");
        x0y1 = new JLabel("0.1");
        x0y2 = new JLabel("0.2");
        x0y3 = new JLabel("0.3");
        x0y4 = new JLabel("0.4");
        x0y5 = new JLabel("0.5");
        
        x1y0 = new JLabel("1.0");
        x1y1 = new JLabel();
        x1y2 = new JLabel();
        x1y3 = new JLabel();
        x1y4 = new JLabel();
        x1y5 = new JLabel();
        
        x2y0 = new JLabel("2.0");
        x2y1 = new JLabel();
        x2y2 = new JLabel();
        x2y3 = new JLabel();
        x2y4 = new JLabel();
        x2y5 = new JLabel();
        
        x3y0 = new JLabel("3.0");
        x3y1 = new JLabel();
        x3y2 = new JLabel();
        x3y3 = new JLabel();
        x3y4 = new JLabel();
        x3y5 = new JLabel();
        
        x4y0 = new JLabel("4.0");
        x4y1 = new JLabel();
        x4y2 = new JLabel();
        x4y3 = new JLabel();
        x4y4 = new JLabel();
        x4y5 = new JLabel();
        
        x5y0 = new JLabel("5.0");
        x5y1 = new JLabel();
        x5y2 = new JLabel();
        x5y3 = new JLabel();
        x5y4 = new JLabel();
        x5y5 = new JLabel();
        
        x6y0 = new JLabel("6.0");
        x6y1 = new JLabel();
        x6y2 = new JLabel();
        x6y3 = new JLabel();
        x6y4 = new JLabel();
        x6y5 = new JLabel();
    }
    
    /**
     * legt die größe aller Labels fest
     */
    private void sizeComponents(){
        for(int x=0; x<7; x++){
            for(int y=0; y<6 ; y++){
                 labelArray[x][y].setSize(150, 150);
            }
        }
    }
    
    /**
     * fügt Labels auf Panel zu
     * plaziert sie an ihrem zugehörigem Platz
     */
    private void locateLabels(){
        
        int xPos = 0;
        int yPos = 0;
        
        for(int x=0; x<7; x++){
            yPos = 0;
            for(int y=0; y<6 ; y++){
                add(labelArray[x][y]);
                labelArray[x][y].setLocation(xPos, yPos);
                yPos = yPos +150;
            }
            xPos = xPos +150;
        }
        
        
    }
    
    /**
     * fügt alle Labels in den zugehörigen Array
     */
    private void initLists(){
         
        labelArray = new JLabel[7][6];
        labelArray[0][0] = x0y0; 
        labelArray[0][1] = x0y1;
        labelArray[0][2] = x0y2;
        labelArray[0][3] = x0y3;
        labelArray[0][4] = x0y4;
        labelArray[0][5] = x0y5;

        labelArray[1][0] = x1y0;
        labelArray[1][1] = x1y1;
        labelArray[1][2] = x1y2;
        labelArray[1][3] = x1y3;
        labelArray[1][4] = x1y4;
        labelArray[1][5] = x1y5;
        
        labelArray[2][0] = x2y0;
        labelArray[2][1] = x2y1;
        labelArray[2][2] = x2y2;
        labelArray[2][3] = x2y3;
        labelArray[2][4] = x2y4;
        labelArray[2][5] = x2y5;    
        
        labelArray[3][0] = x3y0;
        labelArray[3][1] = x3y1;
        labelArray[3][2] = x3y2;
        labelArray[3][3] = x3y3;
        labelArray[3][4] = x3y4;
        labelArray[3][5] = x3y5;  
        
        labelArray[4][0] = x4y0;
        labelArray[4][1] = x4y1;
        labelArray[4][2] = x4y2;
        labelArray[4][3] = x4y3;
        labelArray[4][4] = x4y4;
        labelArray[4][5] = x4y5;
        
        labelArray[5][0] = x5y0;
        labelArray[5][1] = x5y1;
        labelArray[5][2] = x5y2;
        labelArray[5][3] = x5y3;
        labelArray[5][4] = x5y4;
        labelArray[5][5] = x5y5;
        
        labelArray[6][0] = x6y0;
        labelArray[6][1] = x6y1;
        labelArray[6][2] = x6y2;
        labelArray[6][3] = x6y3;
        labelArray[6][4] = x6y4;
        labelArray[6][5] = x6y5;
    }
    
    
    /**
     * Fügt dem ausgewählten Labels ein Wandbild hinzu  
     * @param x Die Position des Labels auf der X-Achse 
     * @param y Die Position des Labels auf der Y-Achse 
     */
    public void setImageToWand(int x, int y){
        labelArray[x][y].setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\wand.png"));
    }
    
     /**
     * Fügt dem ausgewählten Labels ein Eisbild hinzu  
     * @param x Die Position des Labels auf der X-Achse 
     * @param y Die Position des Labels auf der Y-Achse 
     */
    public void setImageToEis(int x, int y){
        labelArray[x][y].setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\eis.png"));
    }
    
     /**
     * Fügt dem ausgewählten Labels ein Wegbild hinzu  
     * @param x Die Position des Labels auf der X-Achse 
     * @param y Die Position des Labels auf der Y-Achse 
     */
    public void setImageToWeg(int x, int y){
        labelArray[x][y].setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\weg.png"));
    }
    
     /**
     * Fügt dem ausgewählten Labels ein Wegbild mit der Figur hinzu  
     * @param x Die Position des Labels auf der X-Achse 
     * @param y Die Position des Labels auf der Y-Achse 
     */
    public void setImageToFigurWeg(int x, int y){
        labelArray[x][y].setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\figur_Weg.png"));
    }
    
     /**
     * Fügt dem ausgewählten Labels ein Eisbild mit der Figur hinzu  
     * @param x Die Position des Labels auf der X-Achse 
     * @param y Die Position des Labels auf der Y-Achse 
     */
    public void setImageToFigurEis(int x, int y){
        labelArray[x][y].setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\figur_Eis.png"));
    }
    
    /**
     * Fügt dem ausgewählten Labels ein Eisbild mit der Figur hinzu  
     * @param x Die Position des Labels auf der X-Achse 
     * @param y Die Position des Labels auf der Y-Achse 
     */
    public void setImageToZiel(int x, int y){
        labelArray[x][y].setIcon(new ImageIcon("C:\\Users\\Jonathan\\Documents\\Labyrinth_Projekt\\Ziel.png"));
    }
    
    public static Steuerung getSteuerung(){
        return steuerung;
    }
}
