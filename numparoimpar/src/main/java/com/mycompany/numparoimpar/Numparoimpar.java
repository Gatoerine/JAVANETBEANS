package com.mycompany.numparoimpar;

/**
 *
 * @author Gato3rine
 */
import java.util.Scanner;
public class Numparoimpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingrese un número
        System.out.print("Joven,ingrese un número entero: ");
        int n = scanner.nextInt();
        
        // Determinar si el número es par o impar
        if (n % 2 == 0) {
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar.");
        }
    }
}
