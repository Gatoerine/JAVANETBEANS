
package com.mycompany.planocartesiano;

/**
 *
 * @author Gato3rine
 */
import java.util.Scanner;
public class Planocartesiano {

    public static void main(String[] args) {
    Scanner Temp = new Scanner(System.in);

    // declare the variables
    int x1;
    int x2;
    int y1;
    int y2;
    int x;
    int y;
    double Distance_Result;

    // get the input coordinates
    System.out.print("Ingresa los valores de las primeras coordenadas X e Y : ");
    x1 = Temp.nextInt();
    y1 = Temp.nextInt();
    System.out.print("Ingresa los valores de las segundas coordenadas X e Y : ");
    x2 = Temp.nextInt();
    y2 = Temp.nextInt();

    // Implement pythagorean theorem
    x = x2 - x1;
    y = y2 - y1;
    Distance_Result = Math.sqrt(x * x + y * y);

    System.out.println("La distancia entre los dos puntos es : " + Distance_Result);
    }

    }
