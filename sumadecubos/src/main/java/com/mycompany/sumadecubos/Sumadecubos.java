

package com.mycompany.sumadecubos;

import java.util.Scanner;
/**
 *
 * @author Gato3rine
 */
public class Sumadecubos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      int n,s;
        // Solicitar al usuario que ingrese el valor de n
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Ingresar cantidad de elementos:");
        n=teclado.nextInt();
   
          // Calcular la suma de los cubos de los primeros n números naturales
        s=(n*n*(n+1)*(n+1))/4;
        
         System.out.println("Suma de los cuadrados de los primeros números=" +s);      
    }
}
