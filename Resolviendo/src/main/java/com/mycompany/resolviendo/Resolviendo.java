package com.mycompany.resolviendo;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Gato3rine
 */
public class Resolviendo {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();
        
        
        double solve = resolver(x);
        System.out.println("La solución  de la ecuación para x = " + x + " es: " + solve);
        
        if (solve>= -1 && solve <= 1) {
            System.out.println("Sí se encuentra en el rango <-1, 1>.");
        } else {
            System.out.println("No se encuentra en el rango <-1, 1>.");
        }
        
    }
    
    public static double resolver(double x) {
   
        double num = (2 * Math.pow(x, -3) + 5 * Math.pow(x, 2) - 8 * x);   
        double denom = Math.sqrt(9 * Math.pow(x, 3) - 2 * Math.pow(x, 2) + x);
        double solve = num / denom;
        
        return solve;
    }
}
