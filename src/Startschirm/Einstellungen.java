package Startschirm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *Ist das Panel auf den Startschirm indem man Einstellungen tätigen kann
 * @author Jonathan
 */
public class Einstellungen extends JPanel{
    
    private JButton zurueckKnopf;
    
    
    public Einstellungen(){
        
        initComponents();
        initPanel();
        
    }
    
    /**
     * legt Größe, Farbe und Titel fest. 
     * Alle Komponenten werden zum Panel hinzugefügt
     */
    private void initPanel(){
        setSize(1050, 600);
        setLayout(null);
        setBackground(Color.WHITE);
        
        Start.getStartschirm().setTitel("Einstellungen");
        
        add(zurueckKnopf);
        zurueckKnopf.setVisible(true);
    }
    
    /**
     * Die Objekte auf dem Panel werden initialisiert. 
     * D.h. Größe, Ort, Aktion, Text etc. wird festgelegt.
     */
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
