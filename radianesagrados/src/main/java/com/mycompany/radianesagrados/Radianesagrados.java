
package com.mycompany.radianesagrados;

/**
 *
 * @author Gato3rine
 */
import java.io.*;

import java.math.*;


public class Radianesagrados {

    public static void main(String[] args)  throws IOException {
     BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System . in));

 int a;

       double dcimal, dvisor, grdos, logmin, logseg,mnutos,rdianes,res, sgundos, logdec, logprtedecimal   ;

 String dec, dgito, mnutost,prtedecimal ;

 // Definir variables
 logprtedecimal = 0;
 logdec = 0;

 logmin = 0;

 mnutos = 0;

 logseg = 0;

 a = 0;

 res = 0;

 rdianes = 0;

 grdos = 0;

 dcimal = 0;

 sgundos = 0;

 dvisor = 0;

 dec = "";

 mnutost = "";

 prtedecimal = "";

 dgito = "";

 System.out.println("*De radianes a grados* ");

 

 // Ingresar radianes
 System.out.print("Radianes: ");

 rdianes = Double.parseDouble(bufEntrada.readLine());

 

 // Convertir radianes a grados e imprimirlo
 res = (rdianes*180)/Math.PI;

 grdos = Math.floor(res);

 System.out.println("Grados:"+grdos);

 // Separar la parte decimal y pasarlo a minutos
 dec = Double.toString(res);

       logdec = dec.length();

 for (a=1;a<=logdec-1;a++) {

  dgito = dec.substring(a,a+1);

  if (dgito.equals(".")) {

     

   prtedecimal = dec.substring(a+1,dec.length()-1);

 

  }

 }

 dcimal = Double.parseDouble(prtedecimal);

 logprtedecimal = prtedecimal.length();

 dgito = "1";

 for (a=0;a<=logprtedecimal-1;a++) {

  dgito = dgito+"0";

 }

 dvisor = Double.parseDouble(dgito);

 mnutos = (dcimal/dvisor)*60;

 mnutost = Double.toString(mnutos);

 logmin = mnutost.length();

 mnutos = Math.floor(mnutos);

 System.out.println("Minutos:"+mnutos);

 // Separar la parte decimal y pasarlo a segundos
 for (a=0;a<=logmin-1;a++) {

  dgito = mnutost.substring(a,a+1);

  if (dgito.equals(".")) {

   prtedecimal = mnutost.substring(a+1,mnutost.length()-1);

  }

 }

 sgundos = Double.parseDouble(prtedecimal);

 logseg = prtedecimal.length();

 dgito = "1";

 for (a=0;a<=logseg-1;a++) {

  dgito = dgito+"0";

 }

 dvisor = Double.parseDouble(dgito);

 sgundos = (sgundos/dvisor)*60;

 System.out.println("Segundos:"+sgundos);

}

}
    

