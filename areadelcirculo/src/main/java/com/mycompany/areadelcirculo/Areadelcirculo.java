
package com.mycompany.areadelcirculo;

/**
 *
 * @author Gato3rine
 */
import java.util.Scanner;
public class Areadelcirculo {

    public static void main(String[] args) {
    int Radio;
     System.out.println("Ingrese el tamaño del radio:");
       Scanner radio = new Scanner(System.in);
       Radio = radio.nextInt();
       double Area = Math.PI * Math.pow(Radio, 2);
       
        System.out.println("El area del circulo con radio es de: " + Area);
        }
}
