package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Excepciones {

    public void modos() {


        System.out.println("Elige modo 1 o modo 2");
        System.out.println("aÑO NACIMIENTO");
        System.out.println("EDAD");
        Scanner teclado = new Scanner(System.in);

        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo_nacimiento = 1900;


        if (modo.equals("1")) {
            System.out.println("Introduce tu añi de nacimiento");
            String anyo = teclado.next();


            //LocalDteTime.now(); nos dice la fecha de hoy

            try {
                anyo_nacimiento = Integer.parseInt(anyo);
            } catch (NumberFormatException e1) {
                System.out.println("El formato no es correcto" + e1.getMessage());
            }

            if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual) {
                System.out.println("El año intrpoducido no es eñl correcto");

            } else if (anyo_nacimiento >= 1928 && anyo_nacimiento <= 1944) {

                System.out.println(" Eres de tal");
            } else if (anyo_nacimiento >= 1945 && anyo_nacimiento <= 1964) {

                System.out.print("Eres x");
            } else if (anyo_nacimiento >= 1965 && anyo_nacimiento <= 1981) {
                System.out.println("Eres Y");

            } else if (anyo_nacimiento >= 1982 && anyo_nacimiento <= 1994) {
                System.out.println(" Erez z");
            } else if (anyo_nacimiento >= 1995 && anyo_nacimiento <= 2009) {
                System.out.println("Eres 0");


            } else if (modo.equals("2")) {

                int edad = teclado.nextInt();
                {

                    if (edad < 0) {

                        System.out.print(" La edad introducida  no es correcta");
                    } else {

                        anyo_nacimiento = anyo_actual - edad;

                    }
                }


            } else {


                System.out.println("El modo no existe");

            }


        }
    }
}