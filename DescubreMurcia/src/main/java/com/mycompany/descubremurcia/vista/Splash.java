/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.descubremurcia.vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 *
 * @author Fran Reinaldos
 */
public class Splash extends JWindow {
    
    PanelSplash panel = new PanelSplash();
    
    public Splash (){
    
        setSize(500,540);
        setLocationRelativeTo(null);
        add(panel);
       
        
        
    
    }
    
}
