/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.los4leatorios;

/**
 *
 * @author Gato3rine
 */
import java.util.Random;
public class Los4leatorios {

    public static void main(String[] args) {
       // Generar 4 números aleatorios
        Random random = new Random();
        int aleat1 = random.nextInt(100);
        int aleat2 = random.nextInt(100);
        int aleat3 = random.nextInt(100);
        int aleat4 = random.nextInt(100);
        
        // Calcular la suma
        int suma = aleat1 + aleat2 + aleat3 + aleat4;
        
        // Calcular el promedio
        double promedio = suma / 4.0;
        
        // Encontrar el número mayor
        int mayor = Math.max(Math.max(aleat1, aleat2), Math.max(aleat3, aleat4));
        
        // Encontrar el número menor
        int menor = Math.min(Math.min(aleat1, aleat2), Math.min(aleat3, aleat4));
        
        // Imprimir los resultados
        System.out.println("Los números generados son: " + aleat1 + ", " + aleat2 + ", " + aleat3 + ", " + aleat4);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);   
    }}
    
    
    
    
    