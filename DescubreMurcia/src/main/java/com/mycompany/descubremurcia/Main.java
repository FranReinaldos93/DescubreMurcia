/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descubremurcia;

import com.mycompany.descubremurcia.vista.Splash;
import com.mycompany.descubremurcia.vista.VentanaPrincipal;
import java.awt.Dimension;
import javax.swing.Timer;

/**
 *
 * @author Francisco Javier Reinaldos Chuecos
 */
public class Main {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        
        
        java.awt.EventQueue.invokeLater(() -> {
            try{
            
                //crea y carga la pantalla splash
                Splash ventanaCarga= new Splash();
                ventanaCarga.setVisible(true);
            
                //Timer para controlar el timepo de carga de la ventana principal
                    Timer timer = new Timer (3500, e -> {
                    ventanaCarga.dispose();
                    VentanaPrincipal ventanap = new VentanaPrincipal(); //creación de la ventana principal
                    ventanap.setTitle("Descubre Murcia");
                    ventanap.setVisible(true);
                    ventanap.setLocationRelativeTo(null);
                    java.awt.EventQueue.invokeLater(() -> ventanap.setVisible(true)); //puntero
                });
                timer.setRepeats(false); //metodo para que una vezz se termine el timer no repita
                timer.start(); 
                
            
            } catch (Exception e){
                logger.log(java.util.logging.Level.SEVERE, "Error al iniciar la aplicación", e);
            }
        
        });
        
   
    }
}
