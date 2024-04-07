/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cilindros;

/**
 *
 * @author LENOVO
 */
public class Cilindros {

    public static void main(String[] args) {
           double r1 = 2; // Radio del primer cilindro
        double r2 = 4; // Radio del segundo cilindro
        double l1 = 5; // Altura del primer cilindro
        double l2 = 2; // Altura del segundo cilindro
        
        // Calcular el área del primer cilindro
        double area1 = calcularAreaCilindro(r1, l1);
        
        // Calcular el área del segundo cilindro
        double area2 = calcularAreaCilindro(r2, l2);
        
        // Imprimir los resultados
        System.out.println("Área del primer cilindro: " + area1 + " metros cuadrados");
        System.out.println("Área del segundo cilindro: " + area2 + " metros cuadrados");
    }
    
    public static double calcularAreaCilindro(double radio, double altura) {
      
        double area= 2 * Math.PI * radio * (altura + radio); // Área lateral del cilindro
        return area;
      
    }
}
