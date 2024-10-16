package org.example;

import java.util.Scanner;

public class NumeroDeLaSuerte {

        public static void pract1() {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Introduce el día de tu nacimiento (dd): ");
            int dia = scanner.nextInt();

            System.out.print("Introduce el mes de tu nacimiento (mm): ");
            int mes = scanner.nextInt();

            System.out.print("Introduce el año de tu nacimiento (aaaa): ");
            int anio = scanner.nextInt();


            String fechaCompleta = String.valueOf(dia) + String.valueOf(mes) + String.valueOf(anio);

            int sumaDigitos = 0;
            int resultado = dia + mes + anio;


            int numeroSuerte = resultado;

            // Mostramos el número de la suerte
            System.out.println("Tu número de la suerte es: " + resultado / 3);


        }
    }

