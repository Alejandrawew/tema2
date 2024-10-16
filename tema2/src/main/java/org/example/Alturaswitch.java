package org.example;

import java.util.Scanner;

public class Alturaswitch {

    public void medidas() {

        Scanner entrada = new Scanner(System.in);


        System.out.println(" ¿Cuál es tu altura?");
        int altura = entrada.nextInt();

        switch (altura) {

            case  (altura <= 150):

                System.out.println(" Persona de altura baja");
            break;

            case (altura > 150 && altura < 175):
                System.out.println(" Persona de altura media");
                break;

            case (altura >= 175):
                System.out.println(" Persona alta");
                break;


        }


    }
}



