package com.mycompany.volumenesfera;

/**
 *
 * @author Gato3rine
 */
import javax.swing.*;

public class Volumenesfera {

    public static void main(String[] args) {
        
        VolumenEsfera();
        
    }
    public static void VolumenEsfera() {
            
      
         double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor del radio:"));
         double volumen=(4.0/3.0) * Math.PI* (Math.pow(radio, 3)); 
       
     
         
        // Imprimir el resultado
        System.out.println("El volumen de la esfera con radio " + radio + " es: " + volumen);
                

    }
       }

