
package com.mycompany.devuelvelaplata;

/**
 *
 * @author Gato3rine
 */
import java.util.Scanner;


public class Devuelvelaplata {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int monto, billetes200, billetes100, billetes50, billetes20, billetes10;
    double monedas5, monedas2, monedas1, monedas50Cent, monedas20Cent, monedas10Cent;

    
    System.out.print("Ingrese un monto  en Soles: ");
    monto = input.nextInt();
    
    
        billetes200 = monto / 200;
        monto = monto % 200;        
        
        billetes100 = monto / 100;
        monto = monto % 100;
        
        billetes50 = monto / 50;
        monto = monto % 50;
        
        billetes20 = monto / 20;
        monto = monto % 20;
        
        billetes10 = monto / 10;
        monto = monto % 10;        
        
    System.out.println(billetes200);
    System.out.println(billetes100);
    System.out.println(billetes50);
    System.out.println(billetes20); 
    System.out.println(billetes10);    
    System.out.println(monto);
    
    
    System.out.println("En billetes:");
        System.out.println("Billetes de 200 Soles: " + billetes200);
        System.out.println("Billetes de 100 Soles: " + billetes100);
        System.out.println("Billetes de 50 Soles: " + billetes50);
        System.out.println("Billetes de 20 Soles: " + billetes20);
        System.out.println("Billetes de 10 Soles: " + billetes10);
        
        
   // Lo restante en monedas
        monedas5 =  monto / 5;
        monto =  monto % 5;
        
        monedas2 = monto / 2;
        monto = monto % 2;
        
        monedas1 = monto / 1;
        monto =   monto % 1;
        
        monedas50Cent = monto / 0.5;
        monedas50Cent = (double)monto / 0.5;
        
        monedas20Cent = monto / 0.2;
        monedas20Cent = (double)monto / 0.2;
        
        monedas10Cent = monto / 0.1;
        monedas10Cent = (double)monto / 0.1;
        
 System.out.println("\nEn de monedas:");
        System.out.println("Monedas de 5 Soles: " + monedas5);
        System.out.println("Monedas de 2 Soles: " + monedas2);
        System.out.println("Monedas de 1 Soles: " + monedas1);
        System.out.println("Monedas de 0.5 Soles: " + monedas50Cent);
        System.out.println("Monedas de 0.2 Soles: " + monedas20Cent);
        System.out.println("Monedas de 0.1 Soles: " + monedas10Cent);      
    }
}
