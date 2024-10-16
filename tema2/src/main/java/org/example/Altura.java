package org.example;

import java.util.Scanner;

public class Altura {
    public void medidas (){

        Scanner entrada =  new Scanner(System.in);



        System.out.println( " ¿Cuál es tu altura?");
        int altura = entrada.nextInt();

        if(altura <= 150) {


            System.out.println(" Persona de altura baja");
        } else if (altura > 150 && altura < 175 ) {

            System.out.println(" Persona de altura media");
        } else if ( altura >= 175) {

            System.out.println( " Persona alta");





        }







    }
}
